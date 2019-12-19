package com.pzhu.novel.service.impl;

import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.pzhu.novel.annotations.ReadLog;
import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.enums.ReadLogType;
import com.pzhu.novel.message.RabbitSender;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.nosql.mongodb.repository.NovelDocumnetRepository;
import com.pzhu.novel.service.Novelservice;
import com.pzhu.novel.vo.ChapterVO;
import com.pzhu.novel.vo.NovelContent;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@Service
public class NovelserviceImpl implements Novelservice {
    private static final String FUN1 = "1";
    private static final String FUN2 = "2";
    private static final String SEARCH_KEY_PREFIX = "novel:";
    @Autowired
    private NovelDocumnetRepository novelDocumnetRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Autowired
    private RabbitSender rabbitSender;

    @Override
    public List<NovelDocumnet> getNovels() {
        return novelDocumnetRepository.findAll();
    }


    @Override
    public Page<NovelDocumnet> getNovels(NovelDocumnet search, Integer page, Integer limit) {
        Page<NovelDocumnet> novelDocumnets;
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("website", ExampleMatcher.GenericPropertyMatchers.exact())
                .withMatcher("type", ExampleMatcher.GenericPropertyMatchers.exact())
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("author", ExampleMatcher.GenericPropertyMatchers.contains());
        Example<NovelDocumnet> ex = Example.of(search, exampleMatcher);
        novelDocumnets = novelDocumnetRepository
                .findAll(ex, PageRequest.of(page, limit));
        return novelDocumnets;
    }

    @Override
    public CommonResult<List<NovelDocumnet>> search(String key) throws IOException {
        //请求
        String valueJson = JSON.toJSONString(key);
        Boolean islock = stringRedisTemplate.opsForValue().setIfAbsent(key, valueJson);
        if (islock) {
            //没有请求过
            stringRedisTemplate.expire(key, 30 * 60, TimeUnit.SECONDS);
            String msg = "key" + key;
//            SpiderTcpClient client = spiderTcpClientPool.getClient();
//            client.sendMessages(msg);
//            spiderTcpClientPool.closeClient(client);
            rabbitSender.sendMessage(msg);
        }
        return null;
    }

    @Override
    public NovelDocumnet update(NovelDocumnet novelDocumnet) {
        NovelDocumnet save = novelDocumnetRepository.save(novelDocumnet);
        return save;

    }

    @Override
    public void delete(String novelId) {
        novelDocumnetRepository.deleteById(novelId);
    }

    @Override
    public List<String> getTypes() {
        Aggregation agg = Aggregation.newAggregation(

                // 第一步：挑选所需的字段，类似select *，*所代表的字段内容
//                Aggregation.project("begin", "end", "userId", "distance"),
                // 第二步：sql where 语句筛选符合条件的记录
//            Aggregation.match(Criteria.where("userId").is(map.get("userId"))),
                // 第三步：分组条件，设置分组字段
//                Aggregation.group("userId").sum("distance").as("distance"),
//                // 第四部：排序（根据某字段排序 倒序）
//                Aggregation.sort(Sort.Direction.DESC, "distance"),
//                // 第五步：数量(分页)
//                Aggregation.limit(Integer.parseInt(map.get("pagesCount"))),
//                // 第六步：重新挑选字段
//                Aggregation.project("userId", "distance");

                Aggregation.project("type"),
                Aggregation.group("type"),
                Aggregation.project("type")

        );
        AggregationResults<JSONObject> results = mongoTemplate.aggregate(agg, NovelDocumnet.class, JSONObject.class);
        List<String> types = new ArrayList<>(results.getMappedResults().size());
        for (Iterator<JSONObject> iterator = results.iterator(); iterator.hasNext(); ) {
            JSONObject obj = iterator.next();
            types.add(obj.getStr("_id"));
        }
        return types;
    }

    @Override
    @ReadLog(type = ReadLogType.INSERT)
    public List<ChapterVO> findChapters(String chaptersUrl) throws IOException, InterruptedException {
        String chapterListStrJsonStr = stringRedisTemplate.opsForValue().get(chaptersUrl.replace("/", ":"));
        if (StringUtils.isBlank(chapterListStrJsonStr)) {
            //如果为空，代表redis中没有
            String valueJson = JSON.toJSONString(chaptersUrl);
            String chaptersUrlLock = chaptersUrl + "lock";
            Boolean isLock = stringRedisTemplate.opsForValue().setIfAbsent(chaptersUrlLock.replace("/", ":"), valueJson);
            if (isLock) {
                //没有请求过
                stringRedisTemplate.expire(chaptersUrlLock.replace("/", ":"), 30 * 60, TimeUnit.SECONDS);
                String tchaptersUrl = "chapter" + chaptersUrl;
                rabbitSender.sendMessage(tchaptersUrl);
//                SpiderTcpClient client = spiderTcpClientPool.getClient();
//                client.sendMessages(chaptersUrl);
//                spiderTcpClientPool.closeClient(client);
                Thread.sleep(1000);
            }
            return findChapters(chaptersUrl);
        }
        List<ChapterVO> chapterVOS = JSON.parseArray(chapterListStrJsonStr, ChapterVO.class);
        return chapterVOS;

    }

    @Override
    @ReadLog(type = ReadLogType.UPDATE)
    public NovelContent findContent(String contentUrl) throws IOException, InterruptedException {
        //请求过
        String key = contentUrl;
        String contentJsonStr = stringRedisTemplate.opsForValue().get(key.replace("/", ":"));
        if (StringUtils.isBlank(contentJsonStr)) {
            String valueJson = JSON.toJSONString(contentUrl);
            String contentUrlLock = contentUrl + "lock";
            Boolean isLock = stringRedisTemplate.opsForValue().setIfAbsent(contentUrlLock.replace("/", ":"), valueJson);
            if (isLock) {
                //没有请求过
                stringRedisTemplate.expire(contentUrlLock.replace("/", ":"), 30 * 60, TimeUnit.SECONDS);
                contentUrl = "content" + contentUrl;
//                SpiderTcpClient client = spiderTcpClientPool.getClient();
//                client.sendMessages(contentUrl);
//                spiderTcpClientPool.closeClient(client);
                rabbitSender.sendMessage(contentUrl);
                Thread.sleep(1000);
                return findContent(key);
            }
        }
        if (contentJsonStr == null) {
            Thread.sleep(1000);
            return findContent(key);
        }
        NovelContent novelContent = JSON.parseObject(contentJsonStr, NovelContent.class);
        return novelContent;
    }

    @Override
    public List<NovelDocumnet> findTop() {
        return novelDocumnetRepository.findTop12By();
    }

    @Override
    public List<NovelDocumnet> findRotate() {
        return novelDocumnetRepository.findTop5By();
    }

    @Override
    public List<NovelDocumnet> findTop10ByUpdate() {
        return novelDocumnetRepository.findTop12ByOrderByUpdateTimeDesc();
    }

    @Override
    public List<NovelDocumnet> findTop10ByWordCount() {
        return novelDocumnetRepository.findTop12ByOrderByWordCountDesc();
    }

    @Override
    public List<String> getSites() {
        Aggregation agg = Aggregation.newAggregation(
                Aggregation.project("website"),
                Aggregation.group("website"),
                Aggregation.project("website")

        );
        AggregationResults<JSONObject> results = mongoTemplate.aggregate(agg, NovelDocumnet.class, JSONObject.class);
        List<String> types = new ArrayList<>(results.getMappedResults().size());
        for (Iterator<JSONObject> iterator = results.iterator(); iterator.hasNext(); ) {
            JSONObject obj = iterator.next();
            types.add(obj.getStr("_id"));
        }
        return types;
    }

    @Override
    public List<Map<String, String>> findNumberOfType() {
        Aggregation agg = Aggregation.newAggregation(
                // 选定字段
                Aggregation.group("type").count().as("num"),
                Aggregation.project("_id", "type", "num")
        );
        AggregationResults<JSONObject> results = mongoTemplate.aggregate(agg, NovelDocumnet.class, JSONObject.class);
        List<Map<String, String>> types = new ArrayList<>(results.getMappedResults().size());
        for (Iterator<JSONObject> iterator = results.iterator(); iterator.hasNext(); ) {
            JSONObject obj = iterator.next();
            Map<String, String> type = new HashMap<>();
            type.put("type", obj.getStr("_id"));
            type.put("num", String.valueOf(obj.getInt("num")));
            types.add(type);
        }
        return types;
    }

    @Override
    public CommonResult<List<NovelDocumnet>> search(String fun, String key) throws IOException {
        List<NovelDocumnet> novels = new ArrayList<>();
        String searchKey = SEARCH_KEY_PREFIX + key;
        Set<String> novelJsons = stringRedisTemplate.opsForSet().members(searchKey);
        if (!novelJsons.isEmpty()) {
            for (String novelJson : novelJsons) {
                NovelDocumnet novelDocumnet = JSON.parseObject(novelJson, NovelDocumnet.class);
                novels.add(novelDocumnet);
            }
            return CommonResult.success(novels);
        }
        //1. 查mongo
        if (StringUtils.equals(FUN1, fun)) {
            novels = novelDocumnetRepository.findAllByAuthorIsLikeOrNameIsLike(key, key);
        } else {
            search(key);
            return CommonResult.success(null);
        }
        return CommonResult.success(novels);
    }

    @Override
    public List<NovelDocumnet> getTypeByTypeName(String typeName) {
        return novelDocumnetRepository.findAllByTypeEquals(typeName);
    }

    @Override
    public NovelDocumnet getNovelByNovelId(String novelId) {
        Optional<NovelDocumnet> optional = novelDocumnetRepository.findById(novelId);
        return optional.isPresent() ? optional.get() : null;
    }


}

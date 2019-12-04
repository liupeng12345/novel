package com.pzhu.novel.service.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.nosql.mongodb.repository.NovelDocumnetRepository;
import com.pzhu.novel.service.Novelservice;
import com.pzhu.novel.vo.ChapterVO;
import com.pzhu.novel.vo.NovelContent;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@Service
public class NovelserviceImpl implements Novelservice {

    @Autowired
    private NovelDocumnetRepository novelDocumnetRepository;
    @Value("${serchServe.ip}")
    private String ip;
    @Value("${serchServe.port}")
    private Integer port;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public List<NovelDocumnet> getNovels() {
        return novelDocumnetRepository.findAll();
    }

    @Override
    public Page<NovelDocumnet> getNovels(String search, Integer page, Integer limit) {
        Page<NovelDocumnet> novelDocumnets;
        if (search == null) {
            novelDocumnets = novelDocumnetRepository.findAll(PageRequest.of(page, limit));
        } else {
            novelDocumnets = (Page<NovelDocumnet>) novelDocumnetRepository.findAllByNameIsLike(search,
                    PageRequest.of(page, limit));
        }

        return novelDocumnets;
    }

    @Override
    public String search(String key) throws IOException {
        //请求
        String valueJson = JSON.toJSONString(key);
        Boolean islock = stringRedisTemplate.opsForValue().setIfAbsent(key, valueJson);
        if (islock) {
            //没有请求过
            stringRedisTemplate.expire(key, 30, TimeUnit.SECONDS);
            Socket socket = new Socket(ip, port);
            OutputStream os = socket.getOutputStream();
            key = key + "key";
            byte[] bytes = key.getBytes("utf-8");
            os.write(bytes);
            os.flush();
            os.close();
        }
        return key;
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
    public List<ChapterVO> findChapters(String chaptersUrl) throws IOException {
        String chapterListStrJsonStr = stringRedisTemplate.opsForValue().get(chaptersUrl);
        if (StringUtils.isBlank(chapterListStrJsonStr)) {
            //如果为空，代表redis中没有
            String valueJson = JSON.toJSONString(chaptersUrl);
            String chaptersUrlLock = chaptersUrl + "lock";
            Boolean isLock = stringRedisTemplate.opsForValue().setIfAbsent(chaptersUrlLock, valueJson);
            if (isLock) {
                //没有请求过
                stringRedisTemplate.expire(chaptersUrlLock, 30, TimeUnit.SECONDS);
                Socket socket = new Socket(ip, port);
                OutputStream os = socket.getOutputStream();
                chaptersUrl = "chapter" + chaptersUrl;
                byte[] bytes = chaptersUrl.getBytes("utf-8");
                os.write(bytes);
                os.flush();
                os.close();
            }
        }
        List<ChapterVO> chapterVOS = JSON.parseArray(chapterListStrJsonStr, ChapterVO.class);
        return chapterVOS;

    }

    @Override
    public NovelContent findContent(String contentUrl) throws IOException, InterruptedException {
        //请求过
        String key = contentUrl;
        String contentJsonStr = stringRedisTemplate.opsForValue().get(key);
        if (StringUtils.isBlank(contentJsonStr)) {
            String valueJson = JSON.toJSONString(contentUrl);
            String contentUrlLock = contentUrl + "lock";
            Boolean isLock = stringRedisTemplate.opsForValue().setIfAbsent(contentUrlLock, valueJson);
            if (isLock) {
                //没有请求过
                stringRedisTemplate.expire(contentUrlLock, 30, TimeUnit.SECONDS);
                Socket socket = new Socket(ip, port);
                OutputStream os = socket.getOutputStream();
                contentUrl = "content" + contentUrl;
                byte[] bytes = contentUrl.getBytes("utf-8");
                os.write(bytes);
                os.flush();
                os.close();
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


}

package com.pzhu.novel.message;

import com.alibaba.fastjson.JSON;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.mapper.ReadLogMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.mbg.model.ReadLogExample;
import com.pzhu.novel.nosql.mongodb.document.NovelContentDocument;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.nosql.mongodb.repository.NovelContentDocumentRepository;
import com.pzhu.novel.nosql.mongodb.repository.NovelDocumnetRepository;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class RabbitListeners {

    private static final String readLogInsertQueue = "novel.readLog.insert";

    private static final String readLogUpdateQueue = "novel.readLog.update";

    private static final String contentQueue = "novel.content.direct";

    private final AdminMapper adminMapper;

    private final ReadLogMapper readLogMapper;

    private final NovelDocumnetRepository novelDocumnetRepository;

    private final NovelContentDocumentRepository novelContentDocumentRepository;

    private final StringRedisTemplate stringRedisTemplate;


    public RabbitListeners(AdminMapper adminMapper, ReadLogMapper readLogMapper, NovelDocumnetRepository novelDocumnetRepository, NovelContentDocumentRepository novelContentDocumentRepository, StringRedisTemplate stringRedisTemplate) {
        this.adminMapper = adminMapper;
        this.readLogMapper = readLogMapper;
        this.novelDocumnetRepository = novelDocumnetRepository;
        this.novelContentDocumentRepository = novelContentDocumentRepository;
        this.stringRedisTemplate = stringRedisTemplate;
    }


    @RabbitListener(queuesToDeclare = @Queue(readLogInsertQueue), concurrency = "8")
    public void receiverReadLogInsertMsg(String msg) {
        try {
            String[] info = msg.split(",");
            String url = info[0];
            String userName = info[1];
            // 查找小说信息
            NovelDocumnet novel = novelDocumnetRepository.findAllByChaptersUrlEquals(url).get(0);
            // 查找用户信息
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andUsernameEqualTo(userName);
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            if (admins.isEmpty()) {
                return;
            }
            //判断阅读记录是否存在
            ReadLogExample readLogExample = new ReadLogExample();
            ReadLogExample.Criteria readLogCriteria = readLogExample.createCriteria();
            readLogCriteria.andUserIdEqualTo(admins.get(0).getId());
            readLogCriteria.andNovelIdEqualTo(novel.get_id());
            List<ReadLog> readLogList = readLogMapper.selectByExample(readLogExample);
            if (readLogList.size() > 0) {
                // 不进行日志录入
                System.out.println("已经进入日志");
                return;
            }
            ReadLog readLog = new ReadLog();
            readLog.setUserId(admins.get(0).getId());
            readLog.setNovelId(novel.get_id());
            readLog.setCreateTime(LocalDateTime.now());
            readLog.setUpdateTime(LocalDateTime.now());
            readLogMapper.insert(readLog);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RabbitListener(queuesToDeclare = @Queue(readLogUpdateQueue), concurrency = "8")
    public void receiverReadLogUpdateMsg(String msg) {
        try {
            String[] info = msg.split(",");
            String url = info[0];
            String userName = info[1];
            // 查找用户信息
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andUsernameEqualTo(userName);
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            if (admins.isEmpty()) {
                return;
            }
            ReadLogExample readLogExample = new ReadLogExample();
            ReadLogExample.Criteria readLogCriteria = readLogExample.createCriteria();
            readLogCriteria.andUserIdEqualTo(admins.get(0).getId());
            List<ReadLog> readLogList = readLogMapper.selectByExample(readLogExample);
            readLogList.forEach(readLog -> {
                Optional<NovelDocumnet> optional = novelDocumnetRepository.findById(readLog.getNovelId());
                if (url.contains(optional.get().getChaptersUrl())) {
                    readLog.setChapterUrl(url);
                    readLog.setUpdateTime(LocalDateTime.now());
                    readLogMapper.updateByPrimaryKeySelective(readLog);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RabbitListener(queuesToDeclare = @Queue(contentQueue))
    public void receiverContentCache(String novelUrl) {
        // 获取所有章节内容
        List<NovelContentDocument> contentDocumentList = novelContentDocumentRepository.findAllByNovelUrl(novelUrl);
        // 放入 redis
        contentDocumentList.forEach(novelContentDocument -> {
            String key = novelContentDocument.getContentUrl().replace("/", ":");
            // 放入缓存
            stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(novelContentDocument.getContentInfo()));
        });
    }

}

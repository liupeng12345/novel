package com.pzhu.novel.message;

import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.mapper.ReadLogMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.mbg.model.ReadLogExample;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.nosql.mongodb.repository.NovelDocumnetRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class RabbitListeners {

    private static final String readLogInsertQueue = "novel.readLog.insert";

    private static final String readLogUpdateQueue = "novel.readLog.update";

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private ReadLogMapper readLogMapper;

    @Autowired
    private NovelDocumnetRepository novelDocumnetRepository;


    @RabbitListener(queues = readLogInsertQueue)
    public void receiverReadLogInsertMsg(String msg) {
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

        //判断阅读记录是否存在
        ReadLogExample readLogExample = new ReadLogExample();
        ReadLogExample.Criteria readLogCriteria = readLogExample.createCriteria();
        readLogCriteria.andUserIdEqualTo(admins.get(0).getId().intValue());
        readLogCriteria.andNovelIdEqualTo(novel.get_id());
        List<ReadLog> readLogList = readLogMapper.selectByExample(readLogExample);
        if (readLogList.size() > 0) {
            // 不进行日志录入
            System.out.println("已经进入日志");
            return;
        }
        ReadLog readLog = new ReadLog();
        readLog.setUserId(admins.get(0).getId().intValue());
        readLog.setNovelId(novel.get_id());
        readLog.setCreateTime(new Date());
        readLog.setUpdateTime(new Date());
        readLogMapper.insert(readLog);
    }

    @RabbitListener(queues = readLogUpdateQueue)
    public void receiverReadLogUpdateMsg(String msg) {
        String[] info = msg.split(",");
        String url = info[0];
        String userName = info[1];
        // 查找用户信息
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<Admin> admins = adminMapper.selectByExample(adminExample);

        ReadLogExample readLogExample = new ReadLogExample();
        ReadLogExample.Criteria readLogCriteria = readLogExample.createCriteria();
        readLogCriteria.andUserIdEqualTo(admins.get(0).getId().intValue());
        List<ReadLog> readLogList = readLogMapper.selectByExample(readLogExample);
        readLogList.forEach(readLog -> {
            Optional<NovelDocumnet> optional = novelDocumnetRepository.findById(readLog.getNovelId());
            if (url.contains(optional.get().getChaptersUrl())) {
                readLog.setChapterUrl(url);
                readLog.setUpdateTime(new Date());
                readLogMapper.updateByPrimaryKeySelective(readLog);
            }
        });

    }

}

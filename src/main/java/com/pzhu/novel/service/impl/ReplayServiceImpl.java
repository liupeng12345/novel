package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.ReplyMapper;
import com.pzhu.novel.mbg.model.Reply;
import com.pzhu.novel.service.ReplyService;
import org.springframework.stereotype.Service;

@Service
public class ReplayServiceImpl implements ReplyService {
    private final ReplyMapper replyMapper;

    public ReplayServiceImpl(ReplyMapper replyMapper) {
        this.replyMapper = replyMapper;
    }


    @Override
    public void createReply(Reply reply) {
        replyMapper.insert(reply);
    }

    @Override
    public void updateReplay(Reply reply) {
        replyMapper.updateByPrimaryKeySelective(reply);
    }

    @Override
    public void deleteReply(Long replayId) {

    }
}

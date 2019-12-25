package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.Reply;

public interface ReplyService {
    // 提交
    void createReply(Reply reply);

    // 修改
    void updateReplay(Reply reply);

    // 删除
    void deleteReply(Long replayId);
}

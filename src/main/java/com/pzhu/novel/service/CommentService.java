package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.Comment;

public interface CommentService {
    void insertComment(Comment comment);

    void delete(Long commentId);

    void updateComment(Comment comment);
}

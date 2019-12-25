package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.CommentMapper;
import com.pzhu.novel.mbg.model.Comment;
import com.pzhu.novel.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Override
    public void insertComment(Comment comment) {
        commentMapper.insertSelective(comment);
    }

    @Override
    public void delete(Long commentId) {
        commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public void updateComment(Comment comment) {
        commentMapper.updateByPrimaryKeySelective(comment);
    }
}

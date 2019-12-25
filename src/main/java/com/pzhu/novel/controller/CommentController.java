package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.mbg.model.Comment;
import com.pzhu.novel.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/comment")
@Api(tags = "CommentController", description = "小说评论接口")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // 创建评论
    @PostMapping
    @ApiOperation("创建评论")
    public CommonResult createComment(@RequestBody Comment comment) {
        comment.setCreateTime(LocalDateTime.now());
        commentService.insertComment(comment);
        return CommonResult.success(comment);
    }

    // 删除评论
    @DeleteMapping("{commentId}")
    @ApiOperation("删除评论")
    public CommonResult deleteComment(@PathVariable("commentId") Long commentId) {
        commentService.delete(commentId);
        return CommonResult.success(commentId);
    }

    // 修改评论
    @PutMapping
    @ApiOperation("修改评论")
    public CommonResult updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
        return CommonResult.success(comment);
    }

    // 查询评论
    @GetMapping("")
    @ApiOperation("查询评论")
    public CommonResult getComment() {
        return null;
    }
}

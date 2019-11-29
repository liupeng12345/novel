package com.pzhu.novel.controller;

import java.util.List;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.query.NovelSpiderConfigQuery;
import com.pzhu.novel.service.NovelSpiderConfigService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/17
 **/
@RestController
@RequestMapping("/novel/spider/config")
public class NovelSpiderConfig {

    @Autowired
    private NovelSpiderConfigService novelSpiderConfigService;

    //todo 完成novel_spider的配置 增删改查
    @ApiOperation("小说爬虫配置查询")
    @GetMapping("/{page}/{size}")
    public CommonResult<List<NovelSpiderConfig>> getNovelSpiderConfigPages(@PathVariable("page") int page, @PathVariable("size") int size, NovelSpiderConfigQuery novelSpiderConfigQuery) {
        return novelSpiderConfigService.queryPage(page, size, novelSpiderConfigQuery);
    }
}

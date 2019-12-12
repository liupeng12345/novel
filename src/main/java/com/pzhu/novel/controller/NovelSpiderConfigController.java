package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonPage;
import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.mbg.model.NovelSpiderXpathConfig;
import com.pzhu.novel.service.NovelSpiderXpathConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/17
 **/
@RestController
@RequestMapping("/novel/spider/config")
@Api(tags = "NovelSpiderConfigController", value = "小说爬虫配置")
public class NovelSpiderConfigController {

    private final NovelSpiderXpathConfigService novelSpiderXpathConfigService;

    public NovelSpiderConfigController(NovelSpiderXpathConfigService novelSpiderXpathConfigService) {
        this.novelSpiderXpathConfigService = novelSpiderXpathConfigService;
    }

    @ApiOperation("分页查询")
    @GetMapping("/{pageNum}/{pageSize}")
    public CommonResult<CommonPage<NovelSpiderXpathConfig>> pageNCommonResult(@PathVariable("pageNum") Integer pageNum,
                                                                              @PathVariable("pageSize") Integer pageSize,
                                                                              NovelSpiderXpathConfig novelSpiderXpathConfig) {
        List<NovelSpiderXpathConfig> novelSpiderXpathConfigList = novelSpiderXpathConfigService
                .findPage(pageNum, pageSize, novelSpiderXpathConfig);
        CommonPage<NovelSpiderXpathConfig> novelSpiderXpathConfigCommonPage = CommonPage.restPage(novelSpiderXpathConfigList);
        return CommonResult.success(novelSpiderXpathConfigCommonPage, "查询成功");

    }

    @ApiOperation("添加小说爬虫站点")
    @PostMapping
    public CommonResult add(@RequestBody NovelSpiderXpathConfig novelSpiderXpathConfig) {
        novelSpiderXpathConfigService.insert(novelSpiderXpathConfig);
        return CommonResult.success(novelSpiderXpathConfig, "添加成功");
    }

    @ApiOperation("修改小说爬虫配置")
    @PutMapping
    public CommonResult update(@RequestBody NovelSpiderXpathConfig novelSpiderXpathConfig) {
        novelSpiderXpathConfigService.update(novelSpiderXpathConfig);
        return CommonResult.success(novelSpiderXpathConfig, "更新成功");
    }

    @ApiOperation("删除小说站点配置")
    @DeleteMapping
    public CommonResult delete(Integer id) {
        novelSpiderXpathConfigService.delete(novelSpiderXpathConfigService);
        return CommonResult.success(null, "删除成功");
    }
}

package com.pzhu.novel.controller;

import java.util.List;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.service.Novelservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@RestController
@Api(tags = "NovelController", description = "小说管理")
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private Novelservice novelservice;

    @GetMapping
    @ApiOperation("查询所有的小说数据")
    public CommonResult<List<NovelDocumnet>> getAll() {
        return CommonResult.success(novelservice.getNovels());
    }


    @GetMapping("/page")
    @ApiOperation("根据关键信息查找小说信息")
    public CommonResult<Page<NovelDocumnet>> getAllUser(@RequestParam(value = "search", required = false) String search,
                                                        @RequestParam(value = "page",
                                                                defaultValue = "1")
                                                                Integer page,
                                                        @RequestParam(value = "limit", defaultValue = "10")
                                                                Integer limit) {
//        //从第0页开始
        Page<NovelDocumnet> novelDocumnets = novelservice.getNovels(search, page - 1, limit);
        return CommonResult.success(novelDocumnets);
    }

    @PutMapping
    @ApiOperation("修改小说信息")
    public CommonResult<NovelDocumnet> updateNovel(@RequestBody NovelDocumnet novelDocumnet) {
        novelDocumnet = novelservice.update(novelDocumnet);
        return CommonResult.success(novelDocumnet);

    }

    @DeleteMapping
    @ApiOperation("删除小说接口")
    public CommonResult deleteNovel(String novelId) {
        novelservice.delete(novelId);
        return CommonResult.success(novelId);
    }

    @GetMapping("/type")
    @ApiOperation("查询小说种类")
    public CommonResult<List<String>> getTypes() {
        List<String> types = novelservice.getTypes();
        return CommonResult.success(types);
    }
}

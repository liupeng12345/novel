package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.service.NovelShelfRowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/novel/shelf/row")
@Api(tags = "NovelShelfRowController", description = "书架接口")
public class NovelShelfRowController {

    private final NovelShelfRowService novelShelfRowService;

    public NovelShelfRowController(NovelShelfRowService novelShelfRowService) {
        this.novelShelfRowService = novelShelfRowService;
    }

    // 删除
    @DeleteMapping("{rowId}")
    @ApiOperation("按照Id删除书架行")
    public CommonResult deleteRowOfShelf(@PathVariable("rowId") Long rowId) {
        novelShelfRowService.deleteRowOfShelf(rowId);
        return CommonResult.success(rowId);
    }

}

package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.mbg.model.NovelShelf;
import com.pzhu.novel.mbg.model.NovelShelfRow;
import com.pzhu.novel.service.NovelShelfRowService;
import com.pzhu.novel.service.NovelShelfService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liupeng
 * 小说书架功能接口
 */
@RestController
@RequestMapping("/api/shelf")
@Api(tags = "NovelShelfController", description = "书架接口")
public class NovelShelfController {

    private final NovelShelfService novelShelfService;

    @Autowired
    private NovelShelfRowService novelShelfRowService;

    public NovelShelfController(NovelShelfService novelShelfService) {
        this.novelShelfService = novelShelfService;
    }

    @PostMapping
    @ApiOperation("创建书架")
    public CommonResult add(@RequestBody NovelShelf novelShelf) {
        novelShelfService.add(novelShelf);
        return CommonResult.success(novelShelf);
    }

    @PutMapping
    @ApiOperation("修改书架")
    public CommonResult updateShelf(NovelShelfDTO novelShelfDTO) {
        novelShelfService.update(novelShelfDTO);
        return CommonResult.success(novelShelfDTO);
    }

    @DeleteMapping("{shelfId}")
    @ApiOperation("删除书架")
    public CommonResult deleteShelf(@PathVariable("shelfId") Long shelfId) {
        NovelShelfDTO novelShelfDTO = novelShelfService.delete(shelfId);
        return CommonResult.success(novelShelfDTO);
    }

    @GetMapping
    @ApiOperation("查询用户的书架")
    public CommonResult getNovelShelf() {
        List<NovelShelf> novelShelfList = novelShelfService.getNovelShelfOfUser();
        return CommonResult.success(novelShelfList);

    }

    @GetMapping("/{shelfId}/row")
    @ApiOperation("查询书架下的书架行")
    public CommonResult getNovelShelf(@PathVariable("shelfId") Long shelfId) {
        List<NovelShelfRow> novelShelfRows = novelShelfRowService.getRowsByShelfId(shelfId);
        return CommonResult.success(novelShelfRows);
    }

    @PostMapping("/{shelfId}/row/{novelId}")
    @ApiOperation("添加小说到书架")
    public CommonResult addRowToShelf(@PathVariable("shelfId") Long shelfId, @PathVariable("novelId") String novelId) {
        NovelShelfRow novelShelfRow = new NovelShelfRow();
        novelShelfRow.setNovelShelfId(shelfId);
        novelShelfRow.setNovelId(novelId);
        novelShelfRowService.addRow(novelShelfRow);
        return CommonResult.success(novelShelfRow);
    }
}

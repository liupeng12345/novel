package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.mbg.model.NovelShelf;
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

    @Autowired
    private NovelShelfService novelShelfService;

    @PostMapping
    @ApiOperation("创建书架")
    public CommonResult add(NovelShelf novelShelf) {
        novelShelfService.add(novelShelf);
        return CommonResult.success(novelShelf);
    }

    @PutMapping
    @ApiOperation("修改书架")
    public  CommonResult updateShelf(NovelShelf novelShelf)
    {
        novelShelfService.update(novelShelf);
        return  CommonResult.success(novelShelf);
    }

    @DeleteMapping("{shelfId}")
    @ApiOperation("删除书架")
    public CommonResult deleteShelf(@PathVariable("shelfId") Integer shelfId)
    {
        NovelShelf novelShelf  =  novelShelfService.delete(shelfId);
        return CommonResult.success(novelShelf);
    }

    @GetMapping("{userId}")
    @ApiOperation("查询用户的书架")
    public CommonResult getNovelShelf(@PathVariable("userId") Integer userId)
    {
        List<NovelShelfDTO>  novelShelfDTOList=  novelShelfService.getNovelShelfOfUser(userId);
        return  CommonResult.success(novelShelfDTOList);

    }

}

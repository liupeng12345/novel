package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.service.NovelShelfService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    public NovelShelfController(NovelShelfService novelShelfService) {
        this.novelShelfService = novelShelfService;
    }

    @PostMapping
    @ApiOperation("创建书架")
    public CommonResult add(NovelShelfDTO novelShelfDTO) {
        novelShelfService.add(novelShelfDTO);
        return CommonResult.success(novelShelfDTO);
    }

    @PutMapping
    @ApiOperation("修改书架")
    public  CommonResult updateShelf(NovelShelfDTO novelShelfDTO)
    {
        novelShelfService.update(novelShelfDTO);
        return  CommonResult.success(novelShelfDTO);
    }

    @DeleteMapping("{shelfId}")
    @ApiOperation("删除书架")
    public CommonResult deleteShelf(@PathVariable("shelfId") Integer shelfId)
    {
        NovelShelfDTO novelShelfDTO  =  novelShelfService.delete(shelfId);
        return CommonResult.success(novelShelfDTO);
    }

    @GetMapping("/userId/{userId}")
    @ApiOperation("查询用户的书架")
    public CommonResult getNovelShelf(@PathVariable("userId") Integer userId)
    {
        List<NovelShelfDTO>  novelShelfDTOList=  novelShelfService.getNovelShelfOfUser(userId);
        return  CommonResult.success(novelShelfDTOList);

    }

}

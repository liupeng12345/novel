package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.service.Novelservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@RestController
@Api(tags = "NovelController", description = "小说管理")
@RequestMapping("/novel")
public class NovelController {

    private final Novelservice novelservice;

    public NovelController(Novelservice novelservice) {
        this.novelservice = novelservice;
    }

    @GetMapping
    @ApiOperation("查询所有的小说数据")
    public CommonResult<List<NovelDocumnet>> getAll() {
        return CommonResult.success(novelservice.getNovels());
    }


    @GetMapping("/page")
    @ApiOperation("根据关键信息查找小说信息")
    public CommonResult<Page<NovelDocumnet>> getAllUser(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "author", required = false) String author,
            @RequestParam(value = "type",required = false) String type,
            @RequestParam(value = "site",required = false) String site,
            @RequestParam(value = "page",
                    defaultValue = "1")
                    Integer page,
            @RequestParam(value = "limit", defaultValue = "10")
                    Integer limit) {
//        //从第0页开始
        NovelDocumnet novelDocumnet = new NovelDocumnet();
        novelDocumnet.setName(title);
        novelDocumnet.setAuthor(author);
        novelDocumnet.setType(type);
        novelDocumnet.setWebsite(site);
        Page<NovelDocumnet> novelDocumnets = novelservice.getNovels(novelDocumnet, page - 1, limit);
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

    @GetMapping("/site")
    @ApiOperation("查询小说站点")
    public CommonResult<List<String>> getSites() {
        List<String> sites = novelservice.getSites();
        return CommonResult.success(sites);
    }
    @GetMapping("/type/number")
    @ApiOperation("获取对应分类的数量")
    public CommonResult<List<Map<String,String>>> getNumberOfType()
    {
        return CommonResult.success(novelservice.findNumberOfType());
    }
}

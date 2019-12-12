package com.pzhu.novel.controller.fd;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.service.Novelservice;
import com.pzhu.novel.vo.ChapterVO;
import com.pzhu.novel.vo.NovelContent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/22
 **/
@RestController
@RequestMapping("/api/novel")
@Api(tags = "Novelcontroller2", description = "服务调用")
public class Novelcontroller2 {
    private final Novelservice novelservice;

    public Novelcontroller2(Novelservice novelservice) {
        this.novelservice = novelservice;
    }

    @GetMapping
    @ApiOperation("搜索小说")
    public CommonResult<List<NovelDocumnet>> findNovel(String key) throws IOException {
        return novelservice.search(key);
    }

    /**
     * 检索章节信息
     *
     * @param chaptersUrl
     * @return
     */
    @GetMapping("/chapter")
    @ApiOperation("检索章节")
    public CommonResult findChapters(String chaptersUrl ) throws IOException {
        List<ChapterVO> chapters = novelservice.findChapters(chaptersUrl);
        if (chapters == null) {
            return CommonResult.success(null, "正在检索章节列表");
        } else {
            return CommonResult.success(chapters, "章节列表");
        }
    }

    /**
     * 获取小说内容 通过url
     *
     * @param contentUrl
     * @return
     */
    @GetMapping("/content")
    @ApiOperation("小说内容检索")
    public CommonResult<NovelContent> getContent(String contentUrl) throws IOException, InterruptedException {
        NovelContent content = novelservice.findContent(contentUrl);
        return CommonResult.success(content,"正在检索内容");
    }


    /**
     * 获取小说top9
     */
    @ApiOperation("查询前9名小说")
    @GetMapping("/top")
    public CommonResult<List<NovelDocumnet>> ListNovelDCommon() {
        List<NovelDocumnet> novelDocumnets = novelservice.findTop();
        return CommonResult.success(novelDocumnets);
    }

    @ApiOperation("轮播图")
    @GetMapping("/rotate")
    public CommonResult<List<NovelDocumnet>> listRotate() {
        List<NovelDocumnet> novelDocumnets = novelservice.findRotate();
        return CommonResult.success(novelDocumnets, "轮播图");
    }

    @ApiOperation("更新Top10")
    @GetMapping("/updateTop10")
    public CommonResult<List<NovelDocumnet>> listTop10ByUpdate() {
        List<NovelDocumnet> novelDocumnets = novelservice.findTop10ByUpdate();
        return CommonResult.success(novelDocumnets, "最新更新");
    }

    @ApiOperation("字数Top10")
    @GetMapping("/wordCountTop10")
    public CommonResult<List<NovelDocumnet>> listTop10ByWordCount() {
        List<NovelDocumnet> novelDocumnets = novelservice.findTop10ByWordCount();
        return CommonResult.success(novelDocumnets, "最多字数");
    }

    @GetMapping("/type")
    @ApiOperation("查询小说种类")
    public CommonResult<List<String>> getTypes() {
        List<String> types = novelservice.getTypes();
//      types.stream().sorted(Comparator.comparing())
        return CommonResult.success(types);
    }

}

package com.pzhu.novel.controller.fd;

import java.io.IOException;
import java.util.List;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.service.Novelservice;
import com.pzhu.novel.vo.ChapterVO;
import com.pzhu.novel.vo.NovelContent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/22
 **/
@RestController
@RequestMapping("/api/novel")
@Api(tags = "Novelcontroller2", description = "python服务调用")
public class Novelcontroller2 {
    @Autowired
    private Novelservice novelservice;

    @GetMapping
    @ApiOperation("搜索小说")
    public String findNovel(String key) throws IOException {
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
    public CommonResult findChapters(String chaptersUrl) throws IOException {
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
     * @param ContentUrl
     * @return
     */
    @GetMapping("/content")
    @ApiOperation("小说内容检索")
    public CommonResult<NovelContent> getContent(String ContentUrl) throws IOException {
        NovelContent content = novelservice.findContent(ContentUrl);
        return CommonResult.success(content);
    }

}

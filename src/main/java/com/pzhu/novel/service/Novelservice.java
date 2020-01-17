package com.pzhu.novel.service;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.vo.ChapterVO;
import com.pzhu.novel.vo.NovelContent;
import org.springframework.data.domain.Page;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
public interface Novelservice {
    /**
     * 得到所有的小说
     *
     * @return
     */
    List<NovelDocumnet> getNovels();

    /**
     * 关键字 分页查找小说
     *
     * @param search 关键字
     * @param page
     * @param limit
     * @return
     */
    Page<NovelDocumnet> getNovels(NovelDocumnet search, Integer page, Integer limit);

    /**
     * 套接字请求python服务
     *
     * @param key
     * @return
     * @throws IOException
     */
    CommonResult<List<NovelDocumnet>> search(String key) throws IOException;

    /**
     * 更新小说信息
     *
     * @param novelDocumnet
     * @return
     */
    NovelDocumnet update(NovelDocumnet novelDocumnet);

    void delete(String novelId);

    List<String> getTypes();

    List<ChapterVO> findChapters(String chaptersUrl) throws IOException, InterruptedException;

    NovelContent findContent(String contentUrl) throws IOException, InterruptedException;

    List<NovelDocumnet> findTop();

    List<NovelDocumnet> findRotate();

    List<NovelDocumnet> findTop10ByUpdate();

    List<NovelDocumnet> findTop10ByWordCount();

    List<String> getSites();

    List<Map<String, String>> findNumberOfType();

    CommonResult<List<NovelDocumnet>> search(String fun, String key) throws IOException;

    List<NovelDocumnet> getTypeByTypeName(String typeName);

    NovelDocumnet getNovelByNovelId(String novelId);

    Page<NovelDocumnet> searchPage(String fun, String key, String page, String size);
}

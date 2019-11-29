package com.pzhu.novel.service;

import java.io.IOException;
import java.util.List;

import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.vo.ChapterVO;
import com.pzhu.novel.vo.NovelContent;
import org.springframework.data.domain.Page;

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
    Page<NovelDocumnet> getNovels(String search, Integer page, Integer limit);

    /**
     * 套接字请求python服务
     *
     * @param key
     * @return
     * @throws IOException
     */
    String search(String key) throws IOException;

    /**
     * 更新小说信息
     *
     * @param novelDocumnet
     * @return
     */
    NovelDocumnet update(NovelDocumnet novelDocumnet);

    void delete(String novelId);

    List<String> getTypes();

    List<ChapterVO> findChapters(String chaptersUrl) throws IOException;

    NovelContent findContent(String contentUrl) throws IOException;
}

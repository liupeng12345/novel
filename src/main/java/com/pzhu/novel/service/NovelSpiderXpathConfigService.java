package com.pzhu.novel.service;

import java.util.List;

import com.pzhu.novel.mbg.model.NovelSpiderXpathConfig;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/30
 **/
public interface NovelSpiderXpathConfigService {
    List<NovelSpiderXpathConfig> findPage(Integer pageNum, Integer pageSize, NovelSpiderXpathConfig novelSpiderXpathConfig);

    void insert(NovelSpiderXpathConfig novelSpiderXpathConfig);

    void update(NovelSpiderXpathConfig novelSpiderXpathConfig);

    void delete(NovelSpiderXpathConfigService novelSpiderXpathConfigService);
}

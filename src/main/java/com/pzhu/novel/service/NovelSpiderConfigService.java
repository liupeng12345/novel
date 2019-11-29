package com.pzhu.novel.service;

import java.util.List;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.controller.NovelSpiderConfig;
import com.pzhu.novel.query.NovelSpiderConfigQuery;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/29
 **/
public interface NovelSpiderConfigService {
    CommonResult<List<NovelSpiderConfig>> queryPage(int page, int size, NovelSpiderConfigQuery novelSpiderConfigQuery);
}

package com.pzhu.novel.service.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.controller.NovelSpiderConfig;
import com.pzhu.novel.mbg.mapper.NovelSpiderWebsiteMapper;
import com.pzhu.novel.query.NovelSpiderConfigQuery;
import com.pzhu.novel.service.NovelSpiderConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/29
 **/
@Service
public class NovelSpiderConfigServiceImpl implements NovelSpiderConfigService {

    @Autowired
    NovelSpiderWebsiteMapper novelSpiderWebsiteMapper;

    @Override
    public CommonResult<List<NovelSpiderConfig>> queryPage(int page, int size, NovelSpiderConfigQuery novelSpiderConfigQuery) {
        PageHelper.startPage(page, size);
        return null;
    }
}

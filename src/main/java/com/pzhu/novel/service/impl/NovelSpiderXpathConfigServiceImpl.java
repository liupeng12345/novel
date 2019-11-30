package com.pzhu.novel.service.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.pzhu.novel.mbg.mapper.NovelSpiderXpathConfigMapper;
import com.pzhu.novel.mbg.model.NovelSpiderXpathConfig;
import com.pzhu.novel.mbg.model.NovelSpiderXpathConfigExample;
import com.pzhu.novel.service.NovelSpiderXpathConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/30
 **/
@Service
public class NovelSpiderXpathConfigServiceImpl implements NovelSpiderXpathConfigService {

    @Autowired
    private NovelSpiderXpathConfigMapper novelSpiderXpathConfigMapper;

    @Override
    public List<NovelSpiderXpathConfig> findPage(Integer pageNum, Integer pageSize, NovelSpiderXpathConfig novelSpiderXpathConfig) {
        PageHelper.startPage(pageNum, pageSize);
        NovelSpiderXpathConfigExample novelSpiderXpathConfigExample = new NovelSpiderXpathConfigExample();
        if (novelSpiderXpathConfig != null) {
            NovelSpiderXpathConfigExample.Criteria criteria = novelSpiderXpathConfigExample.createCriteria();
            if (novelSpiderXpathConfig.getWebsiteName() != null) {
                criteria.andWebsiteNameLike("%" + novelSpiderXpathConfig.getWebsiteName() + "%");
            }
        }
        return novelSpiderXpathConfigMapper.selectByExample(novelSpiderXpathConfigExample);

    }

    @Override
    public void insert(NovelSpiderXpathConfig novelSpiderXpathConfig) {
        novelSpiderXpathConfigMapper.insertSelective(novelSpiderXpathConfig);
    }

    @Override
    public void update(NovelSpiderXpathConfig novelSpiderXpathConfig) {
        novelSpiderXpathConfigMapper.updateByPrimaryKeySelective(novelSpiderXpathConfig);
    }

    @Override
    public void delete(NovelSpiderXpathConfigService novelSpiderXpathConfigService) {

    }
}

package com.pzhu.novel.service.impl;

import com.github.pagehelper.PageHelper;
import com.pzhu.novel.mbg.mapper.ProxySpiderXpathConfigMapper;
import com.pzhu.novel.mbg.model.ProxySpiderXpathConfig;
import com.pzhu.novel.mbg.model.ProxySpiderXpathConfigExample;
import com.pzhu.novel.service.ProxySpiderXpathConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/30
 **/
@Service
public class ProxySpiderXpathConfigServiceImpl implements ProxySpiderXpathConfigService {

    private final ProxySpiderXpathConfigMapper proxySpiderXpathConfigMapper;

    public ProxySpiderXpathConfigServiceImpl(ProxySpiderXpathConfigMapper proxySpiderXpathConfigMapper) {
        this.proxySpiderXpathConfigMapper = proxySpiderXpathConfigMapper;
    }

    @Override
    public void insert(ProxySpiderXpathConfig proxySpiderXpathConfig) {
        proxySpiderXpathConfigMapper.insert(proxySpiderXpathConfig);
    }

    @Override
    public void update(ProxySpiderXpathConfig proxySpiderXpathConfig) {
        proxySpiderXpathConfigMapper.updateByPrimaryKeySelective(proxySpiderXpathConfig);
    }

    @Override
    public void delete(Long id) {
        proxySpiderXpathConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProxySpiderXpathConfig> pageList(Integer pageNum, Integer pageSize, ProxySpiderXpathConfig proxySpiderXpathConfig) {
        PageHelper.startPage(pageNum, pageSize);
        ProxySpiderXpathConfigExample example = new ProxySpiderXpathConfigExample();
        if (proxySpiderXpathConfig != null) {
            ProxySpiderXpathConfigExample.Criteria criteria = example.createCriteria();
            if (proxySpiderXpathConfig.getWebsite() != null) {
                criteria.andWebsiteLike("%" + proxySpiderXpathConfig.getWebsite() + "%");
            }
        }
        return proxySpiderXpathConfigMapper.selectByExample(example);
    }
}

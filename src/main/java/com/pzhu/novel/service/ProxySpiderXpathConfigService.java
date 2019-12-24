package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.ProxySpiderXpathConfig;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/30
 **/
public interface ProxySpiderXpathConfigService {
    void insert(ProxySpiderXpathConfig proxySpiderXpathConfig);

    void update(ProxySpiderXpathConfig proxySpiderXpathConfig);

    void delete(Long id);

    List<ProxySpiderXpathConfig> pageList(Integer pageNum, Integer pageSize, ProxySpiderXpathConfig proxySpiderXpathConfig);
}

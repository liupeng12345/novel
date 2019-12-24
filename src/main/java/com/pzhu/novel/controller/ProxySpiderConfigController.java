package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonPage;
import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.mbg.model.ProxySpiderXpathConfig;
import com.pzhu.novel.service.ProxySpiderXpathConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/17
 **/
@RestController
@RequestMapping("/proxy/spider/config")
@Api(tags = "ProxySpiderConfigController",description = "代理爬虫配置")
public class ProxySpiderConfigController {

    @Autowired
    private ProxySpiderXpathConfigService proxySpiderXpathConfigService;

    @ApiOperation("分页查询代理配置")
    @GetMapping("/{pageNum}/{pageSize}")
    public CommonPage pageProxySpider
            (@PathVariable("pageNum") Integer PageNum,
             @PathVariable("pageSize") Integer pageSize,
             ProxySpiderXpathConfig proxySpiderXpathConfig) {
        List<ProxySpiderXpathConfig> proxySpiderXpathConfigList = proxySpiderXpathConfigService
                .pageList(PageNum, pageSize, proxySpiderXpathConfig);
        return CommonPage.restPage(proxySpiderXpathConfigList);
    }


    /**
     * @param proxySpiderXpathConfig
     * @return
     */
    @ApiOperation("代理爬虫的配置添加")
    @PostMapping
    public CommonResult add(ProxySpiderXpathConfig proxySpiderXpathConfig) {
        proxySpiderXpathConfigService.insert(proxySpiderXpathConfig);
        return CommonResult.success(proxySpiderXpathConfig, "添加成功");
    }

    @ApiOperation("代理爬虫配置更新")
    @PutMapping
    public CommonResult update(ProxySpiderXpathConfig proxySpiderXpathConfig) {
        proxySpiderXpathConfigService.update(proxySpiderXpathConfig);
        return CommonResult.success(proxySpiderXpathConfig, "更新成功");
    }

    @ApiOperation("代理怕从配置删除")
    @DeleteMapping
    public CommonResult delete(Long id) {
        proxySpiderXpathConfigService.delete(id);
        return CommonResult.success(null, "删除成功");
    }


}

package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NovelSpiderSearchXpathConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "搜索地址")
    private String searchUrl;

    @ApiModelProperty(value = "小说站点id")
    private Integer webSiteId;

    @ApiModelProperty(value = "搜索结果")
    private String info;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public Integer getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(Integer webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", searchUrl=").append(searchUrl);
        sb.append(", webSiteId=").append(webSiteId);
        sb.append(", info=").append(info);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
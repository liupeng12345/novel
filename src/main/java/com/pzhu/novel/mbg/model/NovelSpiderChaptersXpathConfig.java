package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NovelSpiderChaptersXpathConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "站点id")
    private Integer webSite;

    @ApiModelProperty(value = "小说章节列表信息")
    private String chapterList;

    @ApiModelProperty(value = "章节名信息")
    private String chapterName;

    @ApiModelProperty(value = "章节链接")
    private String chapterUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebSite() {
        return webSite;
    }

    public void setWebSite(Integer webSite) {
        this.webSite = webSite;
    }

    public String getChapterList() {
        return chapterList;
    }

    public void setChapterList(String chapterList) {
        this.chapterList = chapterList;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterUrl() {
        return chapterUrl;
    }

    public void setChapterUrl(String chapterUrl) {
        this.chapterUrl = chapterUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", webSite=").append(webSite);
        sb.append(", chapterList=").append(chapterList);
        sb.append(", chapterName=").append(chapterName);
        sb.append(", chapterUrl=").append(chapterUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
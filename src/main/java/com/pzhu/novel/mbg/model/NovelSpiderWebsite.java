package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NovelSpiderWebsite implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "小说站点名")
    private String websiteName;

    @ApiModelProperty(value = "小说爬虫站点url")
    private String websiteUrl;

    @ApiModelProperty(value = "小说站点图标")
    private String websiteImg;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getWebsiteImg() {
        return websiteImg;
    }

    public void setWebsiteImg(String websiteImg) {
        this.websiteImg = websiteImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", websiteName=").append(websiteName);
        sb.append(", websiteUrl=").append(websiteUrl);
        sb.append(", websiteImg=").append(websiteImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
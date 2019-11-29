package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NovelSpiderInfoXpathConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "小说站点id")
    private Integer webSiteId;

    @ApiModelProperty(value = "文章类型")
    private String type;

    @ApiModelProperty(value = "文章作者")
    private String author;

    @ApiModelProperty(value = "字数")
    private String wordCount;

    @ApiModelProperty(value = "封面")
    private String imgUrl;

    @ApiModelProperty(value = "内容简介")
    private String briefintroduction;

    @ApiModelProperty(value = "最新章节")
    private String latestChapter;

    @ApiModelProperty(value = "最新章节地址")
    private String latestChapterUrl;

    @ApiModelProperty(value = "文章状态")
    private String status;

    @ApiModelProperty(value = "最后更新时间")
    private String lastUpdateTime;

    @ApiModelProperty(value = "章节列表")
    private String chapterList;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(Integer webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBriefintroduction() {
        return briefintroduction;
    }

    public void setBriefintroduction(String briefintroduction) {
        this.briefintroduction = briefintroduction;
    }

    public String getLatestChapter() {
        return latestChapter;
    }

    public void setLatestChapter(String latestChapter) {
        this.latestChapter = latestChapter;
    }

    public String getLatestChapterUrl() {
        return latestChapterUrl;
    }

    public void setLatestChapterUrl(String latestChapterUrl) {
        this.latestChapterUrl = latestChapterUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getChapterList() {
        return chapterList;
    }

    public void setChapterList(String chapterList) {
        this.chapterList = chapterList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", webSiteId=").append(webSiteId);
        sb.append(", type=").append(type);
        sb.append(", author=").append(author);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", briefintroduction=").append(briefintroduction);
        sb.append(", latestChapter=").append(latestChapter);
        sb.append(", latestChapterUrl=").append(latestChapterUrl);
        sb.append(", status=").append(status);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", chapterList=").append(chapterList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
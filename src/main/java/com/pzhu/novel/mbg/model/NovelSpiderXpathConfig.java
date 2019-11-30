package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NovelSpiderXpathConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "搜索地址")
    private String searchUrl;

    @ApiModelProperty(value = "小说站点名")
    private String websiteName;

    @ApiModelProperty(value = "小说爬虫站点url")
    private String websiteUrl;

    @ApiModelProperty(value = "小说站点图标")
    private String websiteImg;

    @ApiModelProperty(value = "搜索结果")
    private String searchInfo;

    @ApiModelProperty(value = "文章类型")
    private String novelType;

    @ApiModelProperty(value = "文章作者")
    private String novelAuthor;

    @ApiModelProperty(value = "字数")
    private String wordCount;

    @ApiModelProperty(value = "封面")
    private String novelImgUrl;

    @ApiModelProperty(value = "内容简介")
    private String novelBriefintroduction;

    @ApiModelProperty(value = "最新章节")
    private String noveLatestChapter;

    @ApiModelProperty(value = "最新章节地址")
    private String novelLatestChapterUrl;

    @ApiModelProperty(value = "文章状态")
    private String novelStatus;

    @ApiModelProperty(value = "最后更新时间")
    private String novelLastUpdateTime;

    @ApiModelProperty(value = "章节列表")
    private String novelChaptersUrl;

    @ApiModelProperty(value = "小说章节列表信息")
    private String chapterListInfo;

    @ApiModelProperty(value = "章节名信息")
    private String chapterName;

    @ApiModelProperty(value = "章节链接")
    private String chapterUrl;

    @ApiModelProperty(value = "小说内容")
    private String contentInfo;

    @ApiModelProperty(value = "上一页url")
    private String contentPreviousPage;

    @ApiModelProperty(value = "下一页url")
    private String contentNextPage;

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

    public String getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
    }

    public String getNovelType() {
        return novelType;
    }

    public void setNovelType(String novelType) {
        this.novelType = novelType;
    }

    public String getNovelAuthor() {
        return novelAuthor;
    }

    public void setNovelAuthor(String novelAuthor) {
        this.novelAuthor = novelAuthor;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getNovelImgUrl() {
        return novelImgUrl;
    }

    public void setNovelImgUrl(String novelImgUrl) {
        this.novelImgUrl = novelImgUrl;
    }

    public String getNovelBriefintroduction() {
        return novelBriefintroduction;
    }

    public void setNovelBriefintroduction(String novelBriefintroduction) {
        this.novelBriefintroduction = novelBriefintroduction;
    }

    public String getNoveLatestChapter() {
        return noveLatestChapter;
    }

    public void setNoveLatestChapter(String noveLatestChapter) {
        this.noveLatestChapter = noveLatestChapter;
    }

    public String getNovelLatestChapterUrl() {
        return novelLatestChapterUrl;
    }

    public void setNovelLatestChapterUrl(String novelLatestChapterUrl) {
        this.novelLatestChapterUrl = novelLatestChapterUrl;
    }

    public String getNovelStatus() {
        return novelStatus;
    }

    public void setNovelStatus(String novelStatus) {
        this.novelStatus = novelStatus;
    }

    public String getNovelLastUpdateTime() {
        return novelLastUpdateTime;
    }

    public void setNovelLastUpdateTime(String novelLastUpdateTime) {
        this.novelLastUpdateTime = novelLastUpdateTime;
    }

    public String getNovelChaptersUrl() {
        return novelChaptersUrl;
    }

    public void setNovelChaptersUrl(String novelChaptersUrl) {
        this.novelChaptersUrl = novelChaptersUrl;
    }

    public String getChapterListInfo() {
        return chapterListInfo;
    }

    public void setChapterListInfo(String chapterListInfo) {
        this.chapterListInfo = chapterListInfo;
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

    public String getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    }

    public String getContentPreviousPage() {
        return contentPreviousPage;
    }

    public void setContentPreviousPage(String contentPreviousPage) {
        this.contentPreviousPage = contentPreviousPage;
    }

    public String getContentNextPage() {
        return contentNextPage;
    }

    public void setContentNextPage(String contentNextPage) {
        this.contentNextPage = contentNextPage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", searchUrl=").append(searchUrl);
        sb.append(", websiteName=").append(websiteName);
        sb.append(", websiteUrl=").append(websiteUrl);
        sb.append(", websiteImg=").append(websiteImg);
        sb.append(", searchInfo=").append(searchInfo);
        sb.append(", novelType=").append(novelType);
        sb.append(", novelAuthor=").append(novelAuthor);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", novelImgUrl=").append(novelImgUrl);
        sb.append(", novelBriefintroduction=").append(novelBriefintroduction);
        sb.append(", noveLatestChapter=").append(noveLatestChapter);
        sb.append(", novelLatestChapterUrl=").append(novelLatestChapterUrl);
        sb.append(", novelStatus=").append(novelStatus);
        sb.append(", novelLastUpdateTime=").append(novelLastUpdateTime);
        sb.append(", novelChaptersUrl=").append(novelChaptersUrl);
        sb.append(", chapterListInfo=").append(chapterListInfo);
        sb.append(", chapterName=").append(chapterName);
        sb.append(", chapterUrl=").append(chapterUrl);
        sb.append(", contentInfo=").append(contentInfo);
        sb.append(", contentPreviousPage=").append(contentPreviousPage);
        sb.append(", contentNextPage=").append(contentNextPage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
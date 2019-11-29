package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NovelSpiderContentXpathConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "站点")
    private Integer webSiteId;

    @ApiModelProperty(value = "小说内容")
    private String content;

    @ApiModelProperty(value = "上一页url")
    private String previousPage;

    @ApiModelProperty(value = "下一页url")
    private String nextPage;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", webSiteId=").append(webSiteId);
        sb.append(", content=").append(content);
        sb.append(", previousPage=").append(previousPage);
        sb.append(", nextPage=").append(nextPage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
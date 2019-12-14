package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class NovelShelfRow implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "书籍名")
    private String novelName;

    @ApiModelProperty(value = "小说在数据库id")
    private String novelId;

    @ApiModelProperty(value = "小说阅读到的章节Id")
    private String readChapterId;

    @ApiModelProperty(value = "加入书单时间")
    private Date createTime;

    @ApiModelProperty(value = "阅读记录刷新时间")
    private Date updateTime;

    @ApiModelProperty(value = "书架id")
    private Integer novelShelfId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }

    public String getReadChapterId() {
        return readChapterId;
    }

    public void setReadChapterId(String readChapterId) {
        this.readChapterId = readChapterId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getNovelShelfId() {
        return novelShelfId;
    }

    public void setNovelShelfId(Integer novelShelfId) {
        this.novelShelfId = novelShelfId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", novelName=").append(novelName);
        sb.append(", novelId=").append(novelId);
        sb.append(", readChapterId=").append(readChapterId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", novelShelfId=").append(novelShelfId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
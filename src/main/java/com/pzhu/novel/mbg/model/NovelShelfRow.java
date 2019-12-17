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

    @ApiModelProperty(value = "加入书单时间")
    private Date createTime;

    @ApiModelProperty(value = "书架id")
    private Integer novelShelfId;

    @ApiModelProperty(value = "阅读记录id")
    private Integer readLogId;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNovelShelfId() {
        return novelShelfId;
    }

    public void setNovelShelfId(Integer novelShelfId) {
        this.novelShelfId = novelShelfId;
    }

    public Integer getReadLogId() {
        return readLogId;
    }

    public void setReadLogId(Integer readLogId) {
        this.readLogId = readLogId;
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
        sb.append(", createTime=").append(createTime);
        sb.append(", novelShelfId=").append(novelShelfId);
        sb.append(", readLogId=").append(readLogId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
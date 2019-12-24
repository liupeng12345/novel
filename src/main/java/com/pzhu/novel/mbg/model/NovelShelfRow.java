package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="NovelShelfRow")
public class NovelShelfRow implements Serializable {
    @ApiModelProperty(value="",name="id",dataType="Long")
    private Long id;

    @ApiModelProperty(value="书籍名",name="novelName",dataType="String")
    private String novelName;

    @ApiModelProperty(value="小说在数据库id",name="novelId",dataType="String")
    private String novelId;

    @ApiModelProperty(value="加入书单时间",name="createTime",dataType="LocalDateTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value="书架id",name="novelShelfId",dataType="Long")
    private Long novelShelfId;

    @ApiModelProperty(value="阅读记录id",name="readLogId",dataType="Long")
    private Long readLogId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getNovelShelfId() {
        return novelShelfId;
    }

    public void setNovelShelfId(Long novelShelfId) {
        this.novelShelfId = novelShelfId;
    }

    public Long getReadLogId() {
        return readLogId;
    }

    public void setReadLogId(Long readLogId) {
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
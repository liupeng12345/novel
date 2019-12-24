package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="ReadLog")
public class ReadLog implements Serializable {
    @ApiModelProperty(value="阅读记录表",name="id",dataType="Long")
    private Long id;

    @ApiModelProperty(value="读者",name="userId",dataType="Long")
    private Long userId;

    @ApiModelProperty(value="小说id",name="novelId",dataType="String")
    private String novelId;

    @ApiModelProperty(value="阅读到的章节",name="chapterUrl",dataType="String")
    private String chapterUrl;

    @ApiModelProperty(value="更新时间",name="updateTime",dataType="LocalDateTime")
    private LocalDateTime updateTime;

    @ApiModelProperty(value="创建时间",name="createTime",dataType="LocalDateTime")
    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }

    public String getChapterUrl() {
        return chapterUrl;
    }

    public void setChapterUrl(String chapterUrl) {
        this.chapterUrl = chapterUrl;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", novelId=").append(novelId);
        sb.append(", chapterUrl=").append(chapterUrl);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
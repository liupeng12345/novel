package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="Comment")
public class Comment implements Serializable {
    @ApiModelProperty(value="",name="id",dataType="Long")
    private Long id;

    @ApiModelProperty(value="创建时间",name="createTime",dataType="LocalDateTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value="操作设备",name="operatingEquipment",dataType="String")
    private String operatingEquipment;

    @ApiModelProperty(value="0是小说评论，1是章节评论",name="type",dataType="Boolean")
    private Boolean type;

    @ApiModelProperty(value="评论目标id",name="targetId",dataType="String")
    private String targetId;

    @ApiModelProperty(value="操作者",name="operator",dataType="Long")
    private Long operator;

    @ApiModelProperty(value="富文本内容",name="content",dataType="String")
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getOperatingEquipment() {
        return operatingEquipment;
    }

    public void setOperatingEquipment(String operatingEquipment) {
        this.operatingEquipment = operatingEquipment;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", operatingEquipment=").append(operatingEquipment);
        sb.append(", type=").append(type);
        sb.append(", targetId=").append(targetId);
        sb.append(", operator=").append(operator);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
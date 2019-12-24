package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="Reply")
public class Reply implements Serializable {
    @ApiModelProperty(value="",name="id",dataType="Long")
    private Long id;

    @ApiModelProperty(value="回复目标",name="targetId",dataType="Long")
    private Long targetId;

    @ApiModelProperty(value="创建时间",name="creatTime",dataType="LocalDateTime")
    private LocalDateTime creatTime;

    @ApiModelProperty(value="操作设备",name="operatingEquipment",dataType="String")
    private String operatingEquipment;

    @ApiModelProperty(value="操作者",name="operator",dataType="Long")
    private Long operator;

    @ApiModelProperty(value="回复内容",name="content",dataType="String")
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    public String getOperatingEquipment() {
        return operatingEquipment;
    }

    public void setOperatingEquipment(String operatingEquipment) {
        this.operatingEquipment = operatingEquipment;
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
        sb.append(", targetId=").append(targetId);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", operatingEquipment=").append(operatingEquipment);
        sb.append(", operator=").append(operator);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
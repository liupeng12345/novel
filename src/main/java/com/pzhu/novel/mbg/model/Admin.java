package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="Admin")
public class Admin implements Serializable {
    @ApiModelProperty(value="",name="id",dataType="Long")
    private Long id;

    @ApiModelProperty(value="",name="username",dataType="String")
    private String username;

    @ApiModelProperty(value="",name="password",dataType="String")
    private String password;

    @ApiModelProperty(value="头像",name="icon",dataType="String")
    private String icon;

    @ApiModelProperty(value="邮箱",name="email",dataType="String")
    private String email;

    @ApiModelProperty(value="昵称",name="nickName",dataType="String")
    private String nickName;

    @ApiModelProperty(value="备注信息",name="note",dataType="String")
    private String note;

    @ApiModelProperty(value="创建时间",name="createTime",dataType="LocalDateTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value="最后登录时间",name="loginTime",dataType="LocalDateTime")
    private LocalDateTime loginTime;

    @ApiModelProperty(value="帐号启用状态：0->禁用；1->启用",name="status",dataType="Boolean")
    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
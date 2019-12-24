package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel(value="ProxySpiderXpathConfig")
public class ProxySpiderXpathConfig implements Serializable {
    @ApiModelProperty(value="",name="id",dataType="Long")
    private Long id;

    @ApiModelProperty(value="代理站点",name="website",dataType="String")
    private String website;

    @ApiModelProperty(value="代理ip地址",name="url",dataType="String")
    private String url;

    @ApiModelProperty(value="ip列表",name="ipList",dataType="String")
    private String ipList;

    @ApiModelProperty(value="是否合并 ip和端口",name="merge",dataType="Boolean")
    private Boolean merge;

    @ApiModelProperty(value="ip信息",name="ip",dataType="String")
    private String ip;

    @ApiModelProperty(value="端口信息",name="port",dataType="String")
    private String port;

    @ApiModelProperty(value="请求间隔(单位：s)",name="sleep",dataType="String")
    private String sleep;

    @ApiModelProperty(value="查询页数",name="page",dataType="String")
    private String page;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIpList() {
        return ipList;
    }

    public void setIpList(String ipList) {
        this.ipList = ipList;
    }

    public Boolean getMerge() {
        return merge;
    }

    public void setMerge(Boolean merge) {
        this.merge = merge;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", website=").append(website);
        sb.append(", url=").append(url);
        sb.append(", ipList=").append(ipList);
        sb.append(", merge=").append(merge);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", sleep=").append(sleep);
        sb.append(", page=").append(page);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
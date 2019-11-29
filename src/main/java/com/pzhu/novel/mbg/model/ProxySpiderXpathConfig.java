package com.pzhu.novel.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ProxySpiderXpathConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "代理站点")
    private String website;

    @ApiModelProperty(value = "代理ip地址")
    private String url;

    @ApiModelProperty(value = "ip列表")
    private String ipList;

    @ApiModelProperty(value = "是否合并 ip和端口")
    private Boolean merge;

    @ApiModelProperty(value = "ip信息")
    private String ip;

    @ApiModelProperty(value = "端口信息")
    private String port;

    @ApiModelProperty(value = "请求间隔(单位：s)")
    private String sleep;

    @ApiModelProperty(value = "查询页数")
    private String page;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
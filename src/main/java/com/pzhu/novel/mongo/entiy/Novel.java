package com.pzhu.novel.mongo.entiy;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "scrapy_novel")
public class Novel {


    private String website;
    private String name;
    private String author;
    private String classify;
    private String status;
    private String lastUpdateTime;
    private String latestChapterLink;
    private String latestChapterName;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLatestChapterLink() {
        return latestChapterLink;
    }

    public void setLatestChapterLink(String latestChapterLink) {
        this.latestChapterLink = latestChapterLink;
    }

    public String getLatestChapterName() {
        return latestChapterName;
    }

    public void setLatestChapterName(String latestChapterName) {
        this.latestChapterName = latestChapterName;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "website='" + website + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", classify='" + classify + '\'' +
                ", status='" + status + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", latestChapterLink='" + latestChapterLink + '\'' +
                ", latestChapterName='" + latestChapterName + '\'' +
                '}';
    }
}

package com.pzhu.novel.nosql.mongodb.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@Document("novel_list")
@Data
public class NovelDocumnet {
    @Id
    private String _id;
    private String name;
    private String url;
    private String lastChapter;
    private String lastChapterUrl;
    private String author;
    private String wordCount;
    private String updateTime;
    private String img;
    private String type;
    private String synopsis;
    private String status;
    private String website;
    private String chaptersUrl;
}

package com.pzhu.novel.nosql.mongodb.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("novel_chapters")
@Data
public class NovelChapterListDocument {
    @Id
    private String _id;
    //小说 url
    private String novelUrl;
    // 小说列表
    private String chapterList;
}

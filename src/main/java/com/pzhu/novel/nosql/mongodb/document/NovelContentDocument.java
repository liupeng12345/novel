package com.pzhu.novel.nosql.mongodb.document;

import com.pzhu.novel.vo.NovelContent;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("novel_content")
@Data
public class NovelContentDocument {
    @Id
    private String _id;
    private String novelUrl;
    private String contentUrl;
    private NovelContent contentInfo;
}

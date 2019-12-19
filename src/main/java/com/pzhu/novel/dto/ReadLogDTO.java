package com.pzhu.novel.dto;

import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import lombok.Data;

@Data
public class ReadLogDTO {
    private ReadLog readLog;

    private NovelDocumnet novelDocumnet;

}

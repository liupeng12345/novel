package com.pzhu.novel.dto;

import com.pzhu.novel.mbg.model.NovelShelfRow;
import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import lombok.Data;

@Data
public class NovelShelfRowDTO {
    private NovelShelfRow novelShelfRow;

    private NovelDocumnet novelDocumnet;

    private ReadLog readLog;

}

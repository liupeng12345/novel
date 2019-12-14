package com.pzhu.novel.dto;

import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import lombok.Data;

import java.util.List;

@Data
public class NovelShelfDTO {
    private UserDTO userDTO;
    private List<NovelDocumnet> novelDocumnetList;
}

package com.pzhu.novel.dto;

import com.pzhu.novel.mbg.model.NovelShelf;
import com.pzhu.novel.mbg.model.NovelShelfRow;
import lombok.Data;

import java.util.List;

@Data
public class NovelShelfDTO {
    private NovelShelf novelShelf;
    private List<NovelShelfRow> novelShelfRowList;
}

package com.pzhu.novel.service;

import com.pzhu.novel.dto.NovelShelfRowDTO;
import com.pzhu.novel.mbg.model.NovelShelfRow;

import java.util.List;

public interface NovelShelfRowService {
    List<NovelShelfRowDTO> getRowsByShelfId(Long shelfId);

    void addRow(NovelShelfRow novelShelfRow);

    void deleteRowOfShelf(Long rowId);
}

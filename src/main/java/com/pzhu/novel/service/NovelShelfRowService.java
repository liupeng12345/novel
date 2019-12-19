package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.NovelShelfRow;

import java.util.List;

public interface NovelShelfRowService {
    List<NovelShelfRow> getRowsByShelfId(Integer shelfId);
}

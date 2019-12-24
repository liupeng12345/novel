package com.pzhu.novel.service;

import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.mbg.model.NovelShelf;

import java.util.List;

public interface NovelShelfService {
    void add(NovelShelf novelShelf);

    void update(NovelShelfDTO novelShelfDTO);

    NovelShelfDTO delete(Long shelfId);

    List<NovelShelf> getNovelShelfOfUser();
}

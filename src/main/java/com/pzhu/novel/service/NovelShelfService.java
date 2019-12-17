package com.pzhu.novel.service;

import com.pzhu.novel.dto.NovelShelfDTO;

import java.util.List;

public interface NovelShelfService {
    void add(NovelShelfDTO novelShelfDTO);

    void update(NovelShelfDTO novelShelfDTO);

    NovelShelfDTO delete(Integer shelfId);

    List<NovelShelfDTO> getNovelShelfOfUser(Integer userId);
}

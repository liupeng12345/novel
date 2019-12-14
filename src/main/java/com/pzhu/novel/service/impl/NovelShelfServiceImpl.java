package com.pzhu.novel.service.impl;

import com.pzhu.novel.dao.NovelShelfDao;
import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.mbg.mapper.NovelShelfMapper;
import com.pzhu.novel.mbg.model.NovelShelf;
import com.pzhu.novel.service.NovelShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelShelfServiceImpl implements NovelShelfService {

    @Autowired
    private NovelShelfMapper novelShelfMapper;

    @Autowired
    private NovelShelfDao novelShelfDao;

    @Override
    public void add(NovelShelf novelShelf) {

        novelShelfMapper.insertSelective(novelShelf);
    }

    @Override
    public void update(NovelShelf novelShelf) {

    }

    @Override
    public NovelShelf delete(Integer shelfId) {
        return null;
    }

    @Override
    public List<NovelShelfDTO> getNovelShelfOfUser(Integer userId) {
        return null;
    }
}

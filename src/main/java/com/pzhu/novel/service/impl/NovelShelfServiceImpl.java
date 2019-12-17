package com.pzhu.novel.service.impl;

import com.pzhu.novel.dao.NovelShelfDao;
import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.mbg.mapper.NovelShelfMapper;
import com.pzhu.novel.mbg.mapper.NovelShelfRowMapper;
import com.pzhu.novel.mbg.model.NovelShelf;
import com.pzhu.novel.mbg.model.NovelShelfRow;
import com.pzhu.novel.service.NovelShelfService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NovelShelfServiceImpl implements NovelShelfService {

    private final NovelShelfMapper novelShelfMapper;

    private final NovelShelfDao novelShelfDao;

    private final NovelShelfRowMapper novelShelfRowMapper;

    public NovelShelfServiceImpl(NovelShelfMapper novelShelfMapper, NovelShelfDao novelShelfDao, NovelShelfRowMapper novelShelfRowMapper) {
        this.novelShelfMapper = novelShelfMapper;
        this.novelShelfDao = novelShelfDao;
        this.novelShelfRowMapper = novelShelfRowMapper;
    }

    @Override
    public void add(NovelShelfDTO novelShelfDTO) {
        // 添加 书架
        NovelShelf novelShelf = novelShelfDTO.getNovelShelf();
        novelShelfMapper.insertSelective(novelShelf);
        // 添加 书籍
        List<NovelShelfRow> novelShelfRowList = novelShelfDTO.getNovelShelfRowList();
        novelShelfRowList.forEach(novelShelfRow -> {
            novelShelfRow.setNovelShelfId(novelShelf.getId());
            novelShelfRowMapper.insertSelective(novelShelfRow);
        });
    }

    @Override
    public void update(NovelShelfDTO novelShelfDTO) {
        // 更新 书架 信息
        NovelShelf novelShelf = novelShelfDTO.getNovelShelf();
        novelShelfMapper.updateByPrimaryKeySelective(novelShelf);
        List<NovelShelfRow> novelShelfRowList = novelShelfDTO.getNovelShelfRowList();
        // 更新书籍信息
        novelShelfRowList.forEach(novelShelfRow -> {
            if (novelShelfRow.getId() == null) {
                // 新加 书籍
                novelShelfRow.setNovelShelfId(novelShelf.getId());
                novelShelfRowMapper.insertSelective(novelShelfRow);
            } else {
                // 更新书籍
                novelShelfRowMapper.updateByPrimaryKeySelective(novelShelfRow);
            }

        });
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public NovelShelfDTO delete(Integer shelfId) {
        novelShelfRowMapper.deleteByPrimaryKey(shelfId);
        return null;
    }

    @Override
    public List<NovelShelfDTO> getNovelShelfOfUser(Integer userId) {
        return null;
    }
}

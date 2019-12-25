package com.pzhu.novel.service.impl;

import com.pzhu.novel.dao.NovelShelfDao;
import com.pzhu.novel.dto.NovelShelfDTO;
import com.pzhu.novel.mbg.mapper.NovelShelfMapper;
import com.pzhu.novel.mbg.mapper.NovelShelfRowMapper;
import com.pzhu.novel.mbg.mapper.ReadLogMapper;
import com.pzhu.novel.mbg.model.NovelShelf;
import com.pzhu.novel.mbg.model.NovelShelfExample;
import com.pzhu.novel.mbg.model.NovelShelfRow;
import com.pzhu.novel.service.NovelShelfService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NovelShelfServiceImpl implements NovelShelfService {

    private final NovelShelfMapper novelShelfMapper;

    private final NovelShelfDao novelShelfDao;

    private final NovelShelfRowMapper novelShelfRowMapper;

    private final ReadLogMapper readLogMapper;

    public NovelShelfServiceImpl(NovelShelfMapper novelShelfMapper, NovelShelfDao novelShelfDao, NovelShelfRowMapper novelShelfRowMapper, ReadLogMapper readLogMapper) {
        this.novelShelfMapper = novelShelfMapper;
        this.novelShelfDao = novelShelfDao;
        this.novelShelfRowMapper = novelShelfRowMapper;
        this.readLogMapper = readLogMapper;
    }

    @Override
    public void add(NovelShelf novelShelf) {
        // 添加 书架
        // 获取当前登录用户
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        //为书架 添加必要属性
        novelShelf.setOwner(username);
        novelShelf.setCreateTime(LocalDateTime.now());
        novelShelf.setUpdateTime(LocalDateTime.now());
        novelShelfMapper.insertSelective(novelShelf);
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
    public NovelShelfDTO delete(Long shelfId) {
        novelShelfRowMapper.deleteByPrimaryKey(shelfId);
        return null;
    }

    @Override
    public List<NovelShelf> getNovelShelfOfUser() {
        // 获取当前登录用户
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        NovelShelfExample novelShelfExample = new NovelShelfExample();
        NovelShelfExample.Criteria shelfExampleCriteria = novelShelfExample.createCriteria();
        shelfExampleCriteria.andOwnerEqualTo(username);
        List<NovelShelf> novelShelves = novelShelfMapper.selectByExample(novelShelfExample);
        return novelShelves;
    }
}

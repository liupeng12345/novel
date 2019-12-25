package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.NovelShelfRowMapper;
import com.pzhu.novel.mbg.model.NovelShelfRow;
import com.pzhu.novel.mbg.model.NovelShelfRowExample;
import com.pzhu.novel.service.NovelShelfRowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelShelfRowServiceImpl implements NovelShelfRowService {

    @Autowired
    private NovelShelfRowMapper novelShelfRowMapper;

    @Override
    public List<NovelShelfRow> getRowsByShelfId(Long shelfId) {
        NovelShelfRowExample novelShelfRowExample = new NovelShelfRowExample();
        NovelShelfRowExample.Criteria shelfRowExampleCriteria = novelShelfRowExample.createCriteria();
        shelfRowExampleCriteria.andNovelShelfIdEqualTo(shelfId);
        return novelShelfRowMapper.selectByExample(novelShelfRowExample);
    }

    @Override
    public void addRow(NovelShelfRow novelShelfRow) {
        novelShelfRowMapper.insertSelective(novelShelfRow);
    }
}

package com.pzhu.novel.service.impl;

import com.pzhu.novel.dto.NovelShelfRowDTO;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.mapper.NovelShelfRowMapper;
import com.pzhu.novel.mbg.mapper.ReadLogMapper;
import com.pzhu.novel.mbg.model.*;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.nosql.mongodb.repository.NovelDocumnetRepository;
import com.pzhu.novel.service.NovelShelfRowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NovelShelfRowServiceImpl implements NovelShelfRowService {

    private final NovelShelfRowMapper novelShelfRowMapper;

    private final NovelDocumnetRepository novelDocumnetRepository;

    @Autowired
    private ReadLogMapper readLogMapper;

    @Autowired
    private AdminMapper adminMapper;

    public NovelShelfRowServiceImpl(NovelShelfRowMapper novelShelfRowMapper, NovelDocumnetRepository novelDocumnetRepository) {
        this.novelShelfRowMapper = novelShelfRowMapper;
        this.novelDocumnetRepository = novelDocumnetRepository;
    }

    @Override
    public List<NovelShelfRowDTO> getRowsByShelfId(Long shelfId) {

        NovelShelfRowExample novelShelfRowExample = new NovelShelfRowExample();
        NovelShelfRowExample.Criteria shelfRowExampleCriteria = novelShelfRowExample.createCriteria();
        shelfRowExampleCriteria.andNovelShelfIdEqualTo(shelfId);
        List<NovelShelfRow> novelShelfRows = novelShelfRowMapper.selectByExample(novelShelfRowExample);
        List<NovelShelfRowDTO> novelShelfRowDTOS = novelShelfRows.stream().map(novelShelfRow -> {
            NovelShelfRowDTO novelShelfRowDTO = new NovelShelfRowDTO();
            novelShelfRowDTO.setNovelShelfRow(novelShelfRow);
            //优化 todo
            ReadLogExample readLogExample = new ReadLogExample();
            ReadLogExample.Criteria criteria = readLogExample.createCriteria();
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criterias = adminExample.createCriteria();
            criterias.andUsernameEqualTo(SecurityContextHolder.getContext().getAuthentication().getName());
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            criteria.andUserIdEqualTo(admins.get(0).getId());
            criteria.andNovelIdEqualTo(novelShelfRow.getNovelId());
            List<ReadLog> readLogList = readLogMapper.selectByExample(readLogExample);
            if (!readLogList.isEmpty()) {
                novelShelfRowDTO.setReadLog(readLogList.get(0));
            }
            Optional<NovelDocumnet> novelDocumnetOptional = novelDocumnetRepository.findById(novelShelfRow.getNovelId());
            if (novelDocumnetOptional.isPresent()) {
                novelShelfRowDTO.setNovelDocumnet(novelDocumnetOptional.get());
            }
            return novelShelfRowDTO;
        }).collect(Collectors.toList());
        return novelShelfRowDTOS;
    }

    @Override
    public void addRow(NovelShelfRow novelShelfRow) {
        NovelShelfRowExample novelShelfRowExample = new NovelShelfRowExample();
        NovelShelfRowExample.Criteria criteria = novelShelfRowExample.createCriteria();
        criteria.andNovelIdEqualTo(novelShelfRow.getNovelId());
        criteria.andNovelShelfIdEqualTo(novelShelfRow.getNovelShelfId());
        List<NovelShelfRow> novelShelfRows = novelShelfRowMapper.selectByExample(novelShelfRowExample);
        if (novelShelfRows.isEmpty()) {
            novelShelfRowMapper.insertSelective(novelShelfRow);
        }

    }

    @Override
    public void deleteRowOfShelf(Long rowId) {
        novelShelfRowMapper.deleteByPrimaryKey(rowId);
    }
}

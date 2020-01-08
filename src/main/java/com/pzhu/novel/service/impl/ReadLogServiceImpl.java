package com.pzhu.novel.service.impl;

import com.pzhu.novel.dto.ReadLogDTO;
import com.pzhu.novel.mbg.mapper.ReadLogMapper;
import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.mbg.model.ReadLogExample;
import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import com.pzhu.novel.nosql.mongodb.repository.NovelDocumnetRepository;
import com.pzhu.novel.service.ReadLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReadLogServiceImpl implements ReadLogService {

    private final ReadLogMapper readLogMapper;

    private final NovelDocumnetRepository novelDocumnetRepository;

    public ReadLogServiceImpl(ReadLogMapper readLogMapper, NovelDocumnetRepository novelDocumnetRepository) {
        this.readLogMapper = readLogMapper;
        this.novelDocumnetRepository = novelDocumnetRepository;
    }

    @Override
    public void add(ReadLog readLog) {
        readLogMapper.insert(readLog);
    }

    @Override
    public List<ReadLogDTO> query(Long userId) {
        ReadLogExample readLogExample = new ReadLogExample();
        readLogExample.setOrderByClause("update_time desc");
        ReadLogExample.Criteria criteria = readLogExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<ReadLog> readLogList = readLogMapper.selectByExample(readLogExample);
        List<ReadLogDTO> readLogDTOList = readLogList.stream().map(
                readLog -> {
                    ReadLogDTO readLogDTO = new ReadLogDTO();
                    readLogDTO.setReadLog(readLog);
                    Optional<NovelDocumnet> optional = novelDocumnetRepository.findById(readLog.getNovelId());
                    readLogDTO.setNovelDocumnet(optional.isPresent() ? optional.get() : null);
                    return readLogDTO;
                }).collect(Collectors.toList());
        return readLogDTOList;
    }

    @Override
    public void delete(Long readLogId) {
        readLogMapper.deleteByPrimaryKey(readLogId);
    }

    @Override
    public void update(ReadLog readLog) {
        readLogMapper.updateByPrimaryKeySelective(readLog);
    }
}

package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.ReadLogMapper;
import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.service.ReadLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadLogServiceImpl implements ReadLogService {

    private final ReadLogMapper readLogMapper;

    public ReadLogServiceImpl(ReadLogMapper readLogMapper) {
        this.readLogMapper = readLogMapper;
    }

    @Override
    public void add(ReadLog readLog) {
        readLogMapper.insert(readLog);
    }

    @Override
    public List<ReadLog> query() {
        return readLogMapper.selectByExample(null);
    }

    @Override
    public void delete(Integer readLogId) {
        readLogMapper.deleteByPrimaryKey(readLogId);
    }

    @Override
    public void update(ReadLog readLog) {
        readLogMapper.updateByPrimaryKeySelective(readLog);
    }
}

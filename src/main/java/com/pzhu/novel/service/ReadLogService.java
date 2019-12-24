package com.pzhu.novel.service;

import com.pzhu.novel.dto.ReadLogDTO;
import com.pzhu.novel.mbg.model.ReadLog;

import java.util.List;

public interface ReadLogService {
    void add(ReadLog readLog);

    List<ReadLogDTO> query(Long userId);

    void delete(Long readLogId);

    void update(ReadLog readLog);
}

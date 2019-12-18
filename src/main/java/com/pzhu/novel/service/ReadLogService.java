package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.ReadLog;

import java.util.List;

public interface ReadLogService {
    void add(ReadLog readLog);

    List<ReadLog> query();

    void delete(Integer readLogId);

    void update(ReadLog readLog);
}

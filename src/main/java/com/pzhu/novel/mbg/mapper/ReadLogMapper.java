package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.mbg.model.ReadLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadLogMapper {
    long countByExample(ReadLogExample example);

    int deleteByExample(ReadLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReadLog record);

    int insertSelective(ReadLog record);

    List<ReadLog> selectByExample(ReadLogExample example);

    ReadLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReadLog record, @Param("example") ReadLogExample example);

    int updateByExample(@Param("record") ReadLog record, @Param("example") ReadLogExample example);

    int updateByPrimaryKeySelective(ReadLog record);

    int updateByPrimaryKey(ReadLog record);
}
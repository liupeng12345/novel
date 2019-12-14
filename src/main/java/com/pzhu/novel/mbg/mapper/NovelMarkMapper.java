package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelMark;
import com.pzhu.novel.mbg.model.NovelMarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelMarkMapper {
    int countByExample(NovelMarkExample example);

    int deleteByExample(NovelMarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NovelMark record);

    int insertSelective(NovelMark record);

    List<NovelMark> selectByExample(NovelMarkExample example);

    NovelMark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NovelMark record, @Param("example") NovelMarkExample example);

    int updateByExample(@Param("record") NovelMark record, @Param("example") NovelMarkExample example);

    int updateByPrimaryKeySelective(NovelMark record);

    int updateByPrimaryKey(NovelMark record);
}
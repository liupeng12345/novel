package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelShelf;
import com.pzhu.novel.mbg.model.NovelShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelShelfMapper {
    long countByExample(NovelShelfExample example);

    int deleteByExample(NovelShelfExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NovelShelf record);

    int insertSelective(NovelShelf record);

    List<NovelShelf> selectByExampleWithBLOBs(NovelShelfExample example);

    List<NovelShelf> selectByExample(NovelShelfExample example);

    NovelShelf selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NovelShelf record, @Param("example") NovelShelfExample example);

    int updateByExampleWithBLOBs(@Param("record") NovelShelf record, @Param("example") NovelShelfExample example);

    int updateByExample(@Param("record") NovelShelf record, @Param("example") NovelShelfExample example);

    int updateByPrimaryKeySelective(NovelShelf record);

    int updateByPrimaryKeyWithBLOBs(NovelShelf record);

    int updateByPrimaryKey(NovelShelf record);
}
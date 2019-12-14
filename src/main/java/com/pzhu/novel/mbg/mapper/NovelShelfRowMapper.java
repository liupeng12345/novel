package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelShelfRow;
import com.pzhu.novel.mbg.model.NovelShelfRowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelShelfRowMapper {
    int countByExample(NovelShelfRowExample example);

    int deleteByExample(NovelShelfRowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NovelShelfRow record);

    int insertSelective(NovelShelfRow record);

    List<NovelShelfRow> selectByExample(NovelShelfRowExample example);

    NovelShelfRow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NovelShelfRow record, @Param("example") NovelShelfRowExample example);

    int updateByExample(@Param("record") NovelShelfRow record, @Param("example") NovelShelfRowExample example);

    int updateByPrimaryKeySelective(NovelShelfRow record);

    int updateByPrimaryKey(NovelShelfRow record);
}
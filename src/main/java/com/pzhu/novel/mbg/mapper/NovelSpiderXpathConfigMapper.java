package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelSpiderXpathConfig;
import com.pzhu.novel.mbg.model.NovelSpiderXpathConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelSpiderXpathConfigMapper {
    int countByExample(NovelSpiderXpathConfigExample example);

    int deleteByExample(NovelSpiderXpathConfigExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("searchUrl") String searchUrl);

    int insert(NovelSpiderXpathConfig record);

    int insertSelective(NovelSpiderXpathConfig record);

    List<NovelSpiderXpathConfig> selectByExample(NovelSpiderXpathConfigExample example);

    NovelSpiderXpathConfig selectByPrimaryKey(@Param("id") Integer id, @Param("searchUrl") String searchUrl);

    int updateByExampleSelective(@Param("record") NovelSpiderXpathConfig record, @Param("example") NovelSpiderXpathConfigExample example);

    int updateByExample(@Param("record") NovelSpiderXpathConfig record, @Param("example") NovelSpiderXpathConfigExample example);

    int updateByPrimaryKeySelective(NovelSpiderXpathConfig record);

    int updateByPrimaryKey(NovelSpiderXpathConfig record);
}
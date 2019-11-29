package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelSpiderChaptersXpathConfig;
import com.pzhu.novel.mbg.model.NovelSpiderChaptersXpathConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelSpiderChaptersXpathConfigMapper {
    int countByExample(NovelSpiderChaptersXpathConfigExample example);

    int deleteByExample(NovelSpiderChaptersXpathConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NovelSpiderChaptersXpathConfig record);

    int insertSelective(NovelSpiderChaptersXpathConfig record);

    List<NovelSpiderChaptersXpathConfig> selectByExample(NovelSpiderChaptersXpathConfigExample example);

    NovelSpiderChaptersXpathConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NovelSpiderChaptersXpathConfig record, @Param("example") NovelSpiderChaptersXpathConfigExample example);

    int updateByExample(@Param("record") NovelSpiderChaptersXpathConfig record, @Param("example") NovelSpiderChaptersXpathConfigExample example);

    int updateByPrimaryKeySelective(NovelSpiderChaptersXpathConfig record);

    int updateByPrimaryKey(NovelSpiderChaptersXpathConfig record);
}
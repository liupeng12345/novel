package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelSpiderContentXpathConfig;
import com.pzhu.novel.mbg.model.NovelSpiderContentXpathConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelSpiderContentXpathConfigMapper {
    int countByExample(NovelSpiderContentXpathConfigExample example);

    int deleteByExample(NovelSpiderContentXpathConfigExample example);

    int insert(NovelSpiderContentXpathConfig record);

    int insertSelective(NovelSpiderContentXpathConfig record);

    List<NovelSpiderContentXpathConfig> selectByExample(NovelSpiderContentXpathConfigExample example);

    int updateByExampleSelective(@Param("record") NovelSpiderContentXpathConfig record, @Param("example") NovelSpiderContentXpathConfigExample example);

    int updateByExample(@Param("record") NovelSpiderContentXpathConfig record, @Param("example") NovelSpiderContentXpathConfigExample example);
}
package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelSpiderSearchXpathConfig;
import com.pzhu.novel.mbg.model.NovelSpiderSearchXpathConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelSpiderSearchXpathConfigMapper {
    int countByExample(NovelSpiderSearchXpathConfigExample example);

    int deleteByExample(NovelSpiderSearchXpathConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NovelSpiderSearchXpathConfig record);

    int insertSelective(NovelSpiderSearchXpathConfig record);

    List<NovelSpiderSearchXpathConfig> selectByExample(NovelSpiderSearchXpathConfigExample example);

    NovelSpiderSearchXpathConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NovelSpiderSearchXpathConfig record, @Param("example") NovelSpiderSearchXpathConfigExample example);

    int updateByExample(@Param("record") NovelSpiderSearchXpathConfig record, @Param("example") NovelSpiderSearchXpathConfigExample example);

    int updateByPrimaryKeySelective(NovelSpiderSearchXpathConfig record);

    int updateByPrimaryKey(NovelSpiderSearchXpathConfig record);
}
package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelSpiderInfoXpathConfig;
import com.pzhu.novel.mbg.model.NovelSpiderInfoXpathConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelSpiderInfoXpathConfigMapper {
    int countByExample(NovelSpiderInfoXpathConfigExample example);

    int deleteByExample(NovelSpiderInfoXpathConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NovelSpiderInfoXpathConfig record);

    int insertSelective(NovelSpiderInfoXpathConfig record);

    List<NovelSpiderInfoXpathConfig> selectByExample(NovelSpiderInfoXpathConfigExample example);

    NovelSpiderInfoXpathConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NovelSpiderInfoXpathConfig record, @Param("example") NovelSpiderInfoXpathConfigExample example);

    int updateByExample(@Param("record") NovelSpiderInfoXpathConfig record, @Param("example") NovelSpiderInfoXpathConfigExample example);

    int updateByPrimaryKeySelective(NovelSpiderInfoXpathConfig record);

    int updateByPrimaryKey(NovelSpiderInfoXpathConfig record);
}
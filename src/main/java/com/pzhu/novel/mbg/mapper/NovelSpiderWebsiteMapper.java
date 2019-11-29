package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.NovelSpiderWebsite;
import com.pzhu.novel.mbg.model.NovelSpiderWebsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelSpiderWebsiteMapper {
    int countByExample(NovelSpiderWebsiteExample example);

    int deleteByExample(NovelSpiderWebsiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NovelSpiderWebsite record);

    int insertSelective(NovelSpiderWebsite record);

    List<NovelSpiderWebsite> selectByExample(NovelSpiderWebsiteExample example);

    NovelSpiderWebsite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NovelSpiderWebsite record, @Param("example") NovelSpiderWebsiteExample example);

    int updateByExample(@Param("record") NovelSpiderWebsite record, @Param("example") NovelSpiderWebsiteExample example);

    int updateByPrimaryKeySelective(NovelSpiderWebsite record);

    int updateByPrimaryKey(NovelSpiderWebsite record);
}
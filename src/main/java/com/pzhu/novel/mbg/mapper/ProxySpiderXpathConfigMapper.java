package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.ProxySpiderXpathConfig;
import com.pzhu.novel.mbg.model.ProxySpiderXpathConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxySpiderXpathConfigMapper {
    int countByExample(ProxySpiderXpathConfigExample example);

    int deleteByExample(ProxySpiderXpathConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProxySpiderXpathConfig record);

    int insertSelective(ProxySpiderXpathConfig record);

    List<ProxySpiderXpathConfig> selectByExample(ProxySpiderXpathConfigExample example);

    ProxySpiderXpathConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProxySpiderXpathConfig record, @Param("example") ProxySpiderXpathConfigExample example);

    int updateByExample(@Param("record") ProxySpiderXpathConfig record, @Param("example") ProxySpiderXpathConfigExample example);

    int updateByPrimaryKeySelective(ProxySpiderXpathConfig record);

    int updateByPrimaryKey(ProxySpiderXpathConfig record);
}
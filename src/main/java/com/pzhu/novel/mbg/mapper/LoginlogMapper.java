package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.Loginlog;
import com.pzhu.novel.mbg.model.LoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogMapper {
    long countByExample(LoginlogExample example);

    int deleteByExample(LoginlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Loginlog record);

    int insertSelective(Loginlog record);

    List<Loginlog> selectByExample(LoginlogExample example);

    Loginlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    int updateByExample(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    int updateByPrimaryKeySelective(Loginlog record);

    int updateByPrimaryKey(Loginlog record);
}
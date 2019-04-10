package com.pzhu.novel.dao;

import com.pzhu.novel.entiy.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface UserMapper {
    @Insert("insert user(username,password) value(#{record.username},#{record.password}) ")
    int insert(@Param("record") User record);
    int insertSelective(User record);
    @Select("select * from  user")
    List<User> quiryUser();

}
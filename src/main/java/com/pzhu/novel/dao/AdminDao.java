package com.pzhu.novel.dao;

import java.util.List;

import com.pzhu.novel.mbg.model.Permission;
import org.apache.ibatis.annotations.Param;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/4
 **/
public interface AdminDao {
    /**
     *  通过adminId 获取相关权限
     * @param id
     * @return
     */
    List<Permission> getPermissionsByAdminId(@Param("adminId") Long id);
}

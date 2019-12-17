package com.pzhu.novel.service;

import java.util.List;

import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.Permission;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/4
 **/

public interface AdminService
{
    Admin getAdminByUsername(String username);

    List<Permission> getPermissionList(Long id);

}

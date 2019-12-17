package com.pzhu.novel.service.impl;

import com.pzhu.novel.dao.AdminDao;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.mbg.model.Permission;
import com.pzhu.novel.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/4
 **/
@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);


    private final com.pzhu.novel.mbg.mapper.AdminMapper adminMapper;

    private final AdminDao admindto;

    public AdminServiceImpl(AdminMapper adminMapper, AdminDao admindto) {
        this.adminMapper = adminMapper;
        this.admindto = admindto;
    }

    @Override
    public Admin getAdminByUsername(String username) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.size() == 0 ? null : admins.get(0);
    }

    @Override
    public List<Permission> getPermissionList(Long id) {
        List<Permission> permissions = admindto.getPermissionsByAdminId(id);
        return permissions;
    }
}

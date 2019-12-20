package com.pzhu.novel.service.impl;

import com.alibaba.fastjson.JSON;
import com.pzhu.novel.dao.AdminDao;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.mbg.model.Permission;
import com.pzhu.novel.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/4
 **/
@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);


    private final com.pzhu.novel.mbg.mapper.AdminMapper adminMapper;

    private final AdminDao admindto;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final String USER_PREFIX = "user:username:";

    private static final String PERMISSION_PREFIX = "user:permissions:";

    public AdminServiceImpl(AdminMapper adminMapper, AdminDao admindto) {
        this.adminMapper = adminMapper;
        this.admindto = admindto;
    }

    @Override
    public Admin getAdminByUsername(String username) {
        String key = USER_PREFIX + username;
        String userJson = stringRedisTemplate.opsForValue().get(key);
        if (StringUtils.isNotBlank(userJson)) {
            logger.info("使用了缓存");
            return JSON.parseObject(userJson, Admin.class);
        } else {
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andUsernameEqualTo(username);
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            Admin admin = admins.size() == 0 ? null : admins.get(0);
            stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(admin));
            return admin;
        }

    }

    @Override
    public List<Permission> getPermissionList(Long id) {
        String key = PERMISSION_PREFIX + id;
        String permissionsJson = stringRedisTemplate.opsForValue().get(key);
        if (StringUtils.isNotBlank(permissionsJson)) {
            logger.info("权限使用了缓存");
            return JSON.parseArray(permissionsJson, Permission.class);
        } else {
            List<Permission> permissions = admindto.getPermissionsByAdminId(id);
            if (permissions != null) {
                stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(permissions));
            }
            return permissions;
        }
    }
}

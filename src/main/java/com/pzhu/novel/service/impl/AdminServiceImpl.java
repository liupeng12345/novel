package com.pzhu.novel.service.impl;

import java.util.Date;
import java.util.List;

import com.pzhu.novel.dao.Admindto;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.mbg.model.Permission;
import com.pzhu.novel.service.AdminService;
import com.pzhu.novel.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/4
 **/
@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private Admindto admindto;

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

    @Override
    public Admin register(Admin adminParam) {
        Admin Admin = new Admin();
        BeanUtils.copyProperties(adminParam, Admin);
        Admin.setCreateTime(new Date());
        Admin.setStatus(1);
        //查询是否有相同用户名的用户
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(Admin.getUsername());
        List<Admin> AdminList = adminMapper.selectByExample(example);
        if (AdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(Admin.getPassword());
        Admin.setPassword(encodePassword);
        adminMapper.insert(Admin);
        return Admin;

    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }
}

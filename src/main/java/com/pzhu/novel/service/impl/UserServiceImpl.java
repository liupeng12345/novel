package com.pzhu.novel.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pzhu.novel.dto.UserDTO;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.service.UserService;
import com.pzhu.novel.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final AdminMapper adminMapper;
    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil, PasswordEncoder passwordEncoder, AdminMapper adminMapper) {
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.passwordEncoder = passwordEncoder;
        this.adminMapper = adminMapper;
    }


    @Override
    public UserDTO getUserById(Long userId) {
        Admin admin = adminMapper.selectByPrimaryKey(userId);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(admin, userDTO);
        return userDTO;
    }

    @Override
    public List<UserDTO> getAllUser(UserDTO userDTO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        AdminExample adminExample = null;
        if (userDTO != null) {
            adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andUsernameLike("%" + userDTO.getUsername() + "%");
        }
        Page<Admin> admins = (Page<Admin>) adminMapper.selectByExample(adminExample);
        Page<UserDTO> userDTOS = new Page<>();
        BeanUtils.copyProperties(admins, userDTOS);
        for (Admin tAdmin : admins) {
            UserDTO userDTO1 = new UserDTO();
            BeanUtils.copyProperties(tAdmin, userDTO1);
            userDTOS.add(userDTO1);
        }
        return userDTOS;
    }

    @Override
    public int update(UserDTO userDTO) {
        Admin admin = new Admin();
        BeanUtils.copyProperties(userDTO, admin);
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int delete(Long userId) {
        Admin user = adminMapper.selectByPrimaryKey(userId);
        // 禁用
        user.setStatus(false);
        return adminMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Admin register(Admin adminParam) {
        Admin Admin = new Admin();
        BeanUtils.copyProperties(adminParam, Admin);
        Admin.setCreateTime(LocalDateTime.now());
        // 启用
        Admin.setStatus(true);
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

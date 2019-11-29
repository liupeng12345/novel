package com.pzhu.novel.service.impl;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pzhu.novel.dto.UserDTO;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AdminMapper adminMapper;

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
            criteria.andUsernameLike("%"+userDTO.getUsername()+"%");
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
        user.setStatus(0);
        return adminMapper.updateByPrimaryKeySelective(user);
    }
}

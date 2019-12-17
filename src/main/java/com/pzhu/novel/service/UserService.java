package com.pzhu.novel.service;

import com.pzhu.novel.dto.UserDTO;
import com.pzhu.novel.mbg.model.Admin;

import java.util.List;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
public interface UserService {



    Admin register(Admin adminParam);

    String login(String username, String password);

    /**
     * 通过 用户id获取用户信息
     *
     * @param userId
     * @return
     */
    UserDTO getUserById(Long userId);

    /**
     * 分页 条件查询 用户信息
     *
     * @param userDTO 查询条件
     * @param page    当前页
     * @param limit   分页大小
     * @return
     */
    List<UserDTO> getAllUser(UserDTO userDTO, Integer page, Integer limit);

    /**
     * 修改用户信息
     *
     * @param userDTO
     * @return
     */
    int update(UserDTO userDTO);

    /**
     * 根据用户id删除用户
     *
     * @param userId
     * @return
     */
    int delete(Long userId);
}

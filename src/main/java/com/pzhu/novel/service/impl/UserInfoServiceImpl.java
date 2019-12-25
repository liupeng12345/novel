package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.UserInfoMapper;
import com.pzhu.novel.mbg.model.UserInfo;
import com.pzhu.novel.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author lp
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private final UserInfoMapper userInfoMapper;


    public UserInfoServiceImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public void createUserInfo(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void deleteUserInfo(Long userInfoId) {
        userInfoMapper.deleteByPrimaryKey(userInfoId);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
}

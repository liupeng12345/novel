package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.UserInfo;

public interface UserInfoService {
    // 添加
    void createUserInfo(UserInfo userInfo);

    // 删除
    void deleteUserInfo(Long userInfoId);

    // 修改
    void updateUserInfo(UserInfo userInfo);
}

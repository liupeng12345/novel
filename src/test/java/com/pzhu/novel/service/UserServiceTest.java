package com.pzhu.novel.service;

import com.pzhu.novel.dao.UserMapper;
import com.pzhu.novel.entiy.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {

        User user = new User();
        user.setPassword("13243");
        user.setUsername("lpwqzdxsc");
        userMapper.insert(user);

    }

    @Test
    public void quireUser() {
        ArrayList<User>  users= (ArrayList<User>) userMapper.quiryUser();
        for (User u:users
             ) {
            System.out.println(u);
        }
    }
}
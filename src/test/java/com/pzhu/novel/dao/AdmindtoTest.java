package com.pzhu.novel.dao;

import java.util.List;

import com.pzhu.novel.mbg.model.Permission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdmindtoTest {

    @Autowired
    private AdminDao admindto;

    @Test
    public void getPermissionsByAdminId() {
        List<Permission> permissions = admindto.getPermissionsByAdminId(1L);
        permissions.stream().forEach(System.out::println);

    }
}

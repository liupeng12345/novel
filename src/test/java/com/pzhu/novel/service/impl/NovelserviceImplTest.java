package com.pzhu.novel.service.impl;


import java.util.Map;

import com.pzhu.novel.service.Novelservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class NovelserviceImplTest {

    @Autowired
    private Novelservice novelservice;

    @Test
    public void getTypes() {
        novelservice.getTypes();
    }

    @Test
    public void  Test(){
        Map<String, String> numberOfType = (Map<String, String>) novelservice.findNumberOfType();
        numberOfType.forEach((key,v)-> {
            System.out.println(key+"::"+v);
        });

    }
}

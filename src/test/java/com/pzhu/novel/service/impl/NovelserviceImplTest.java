package com.pzhu.novel.service.impl;


import com.pzhu.novel.service.Novelservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public void  Test() throws IOException {
//        novelservice.search("1","龙");
    }

    @Test
    public void  TestFor()
    {
        List<List<List<String>>>  lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (List list: lists
             ) {
            List<String> s=  new ArrayList<>();
            s.add("sada");
            list.add(s);
        }
        System.out.println(lists);
    }
}

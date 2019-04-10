package com.pzhu.novel.mongodao.impl;

import com.pzhu.novel.mongo.dao.NovelDao;
import com.pzhu.novel.mongo.entiy.Novel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NovelDaoImplTest {

    @Autowired
    private NovelDao  NovelDao;

    @Test
    public void getnovel() {

       List<Novel>  novels=  NovelDao.getNovel();
       for(Novel i :novels)
       {
           System.out.println(i);
       }
    }
}
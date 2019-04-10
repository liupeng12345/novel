package com.pzhu.novel.service.impl;

import com.pzhu.novel.service.NovelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Reference;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class NovelServiceImplTest {

    @Autowired
    private NovelServiceImpl novelService;

    @Test
    public void searchForNovels() {
        novelService.searchForNovels("asd");
    }
}
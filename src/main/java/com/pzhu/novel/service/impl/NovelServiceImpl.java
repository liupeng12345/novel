package com.pzhu.novel.service.impl;

import com.pzhu.novel.mongo.dao.NovelDao;
import com.pzhu.novel.mongo.entiy.Novel;
import com.pzhu.novel.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelServiceImpl implements NovelService {


    @Autowired
    private NovelDao NovelDao;

    public List<Novel> searchForNovels(String name) {
        return NovelDao.getNovel();
    }

}

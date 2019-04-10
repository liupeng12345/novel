package com.pzhu.novel.mongo.dao.impl;

import com.pzhu.novel.mongo.dao.NovelDao;
import com.pzhu.novel.mongo.entiy.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("novelDao")
public class NovelDaoImpl implements NovelDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Novel> getNovel() {

        List<Novel> novels = mongoTemplate.findAll(Novel.class);
        return novels;
    }

}

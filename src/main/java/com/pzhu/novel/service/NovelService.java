package com.pzhu.novel.service;

import com.pzhu.novel.mongo.entiy.Novel;


import java.util.List;

public interface NovelService {
    public List<Novel> searchForNovels(String name);
}

package com.pzhu.novel.nosql.mongodb.repository;

import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NovelDocumnetRepository extends MongoRepository<NovelDocumnet, String> {


    Page<NovelDocumnet> findAllByNameIsLikeAndAuthorIsLikeAndWebsiteIsAndTypeIs(String searchName, String author, String website, String name, PageRequest pageRequest);

    List<NovelDocumnet> findTop12By();

    List<NovelDocumnet> findTop5By();

    List<NovelDocumnet> findTop12ByOrderByUpdateTimeDesc();

    List<NovelDocumnet> findTop12ByOrderByWordCountDesc();

    List<NovelDocumnet> findAllByAuthorIsLikeOrNameIsLike(String s, String key, PageRequest page);

    List<NovelDocumnet> findAllByAuthorIsLikeOrNameIsLikeAndTypeEquals(String s, String key, String type);

    List<NovelDocumnet> findAllByTypeEquals(String type, PageRequest of);

    List<NovelDocumnet> findAllByChaptersUrlEquals(String chapterUrl);

}
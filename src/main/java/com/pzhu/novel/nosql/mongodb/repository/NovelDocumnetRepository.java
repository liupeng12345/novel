package com.pzhu.novel.nosql.mongodb.repository;

import java.util.List;

import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NovelDocumnetRepository extends MongoRepository<NovelDocumnet, String> {


    Page<NovelDocumnet> findAllByNameIsLike(String name, PageRequest pageRequest);

}
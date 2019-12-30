package com.pzhu.novel.nosql.mongodb.repository;

import com.pzhu.novel.nosql.mongodb.document.NovelContentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NovelContentDocumentRepository extends MongoRepository<NovelContentDocument, String> {
    NovelContentDocument findAllByContentUrl(String contentUrl);

    List<NovelContentDocument> findAllByNovelUrl(String NovelUrl);
}

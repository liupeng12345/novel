package com.pzhu.novel.nosql.mongodb.repository;

import com.pzhu.novel.nosql.mongodb.document.NovelChapterListDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NovelChapterListDocumentRepository extends MongoRepository<NovelChapterListDocument, String> {

    NovelChapterListDocument findAllByNovelUrl(String novelUrl);
}

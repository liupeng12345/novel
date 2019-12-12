package com.pzhu.novel.nosql.mongodb.repository;

import java.util.List;

import com.pzhu.novel.nosql.mongodb.document.NovelDocumnet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class NovelDocumnetRepositoryTest {
    @Autowired
    NovelDocumnetRepository novelDocumnetRepository;

    @Test
    public void findAll() {
        List<NovelDocumnet> all = novelDocumnetRepository.findAll();
        all.forEach(s->{
            System.out.println(s);
        });
    }
}

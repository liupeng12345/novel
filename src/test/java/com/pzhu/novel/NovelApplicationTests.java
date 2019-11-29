package com.pzhu.novel;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.pzhu.novel.vo.ChapterVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NovelApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {
        String chapterInfo = stringRedisTemplate.opsForValue().get("https://www.x23us.com/html/77/77964/");
        List<ChapterVO> chapterVOS = JSON.parseArray(chapterInfo, ChapterVO.class);
        chapterVOS.stream().forEach(chapterVO->{
            System.out.println(chapterVO.getName()+chapterVO.getUrl());
        });
    }
}

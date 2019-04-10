package com.pzhu.novel.controller.novel;

import com.pzhu.novel.mongo.entiy.Novel;
import com.pzhu.novel.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/novel")
public class novelController {

    @Autowired
    private NovelService novelService;

    @RequestMapping("index")
    public String searchForNovels()
    {

        return "/index";
    }

}

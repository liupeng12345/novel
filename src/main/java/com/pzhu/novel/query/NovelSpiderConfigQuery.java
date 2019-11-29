package com.pzhu.novel.query;

import com.pzhu.novel.mbg.model.*;
import lombok.Data;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/29
 **/
@Data
public class NovelSpiderConfigQuery {
    private NovelSpiderInfoXpathConfig novelSpiderInfoXpathConfig;
    private NovelSpiderChaptersXpathConfig novelSpiderChaptersXpathConfig;
    private NovelSpiderContentXpathConfig novelSpiderContentXpathConfig;
    private NovelSpiderWebsite novelSpiderWebsite;
    private NovelSpiderSearchXpathConfig novelSpiderSearchXpathConfig;
}

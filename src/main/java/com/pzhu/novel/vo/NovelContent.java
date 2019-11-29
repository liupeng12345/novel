package com.pzhu.novel.vo;

import lombok.Data;

/**
 * @author 刘鹏 liupeng
 * @date 2019/11/29
 **/
@Data
public class NovelContent {
    /**
     * 小说内容
     */
    private String content;

    /**
     * 上一页
     */
    private String prePage;

    /**
     * 下一页
     */
    private String nextPage;
}

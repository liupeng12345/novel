package com.pzhu.novel.enums;

import lombok.Getter;

/**
 * @author 刘鹏 liupeng
 * @date 2019/12/6
 **/
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_SPIDER_CANCEL("novel.spider.direct", "novel.spider.cancel", "novel.spider.cancel");
    /**
     * 交换名称
     */
    private String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}

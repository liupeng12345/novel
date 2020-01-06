package com.pzhu.novel.config;

import com.pzhu.novel.enums.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    /**
     * 爬行服务交换机
     */
    @Bean("spiderDirect")
    DirectExchange spiderDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_SPIDER_CANCEL.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 小说内容缓存处理交换机
     *
     * @return
     */
    @Bean("contentDirect")
    DirectExchange contentCacheDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_NOVEL_CONTENT_CACHE.getExchange())
                .durable(true)
                .build();
    }

    /**
     * readLog 交换机
     */
    @Bean("readLogDirect")
    DirectExchange readLogDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_READ_LOG_INSERT.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 爬虫消息队列
     *
     * @return
     */
    @Bean("spiderQueue")
    public Queue spiderQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_SPIDER_CANCEL.getName())
                .build();
    }

    /**
     * 小说内容缓存队列
     *
     * @return
     */
    @Bean("novelContentCacheQueue")
    public Queue ContentQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_NOVEL_CONTENT_CACHE.getName())
                .build();
    }

    /**
     * readLog插入队列
     */
    @Bean("readLogInsertQueue")
    public Queue readLogInsertQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_READ_LOG_INSERT.getName())
                .build();
    }

    @Bean("readLogUpdateQueue")
    public Queue readLogUpdateQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_READ_LOG_UPDATE.getName())
                .build();
    }


    /**
     * 将消息队列和交换机绑定
     */
    @Bean("spiderBinding")
    public Binding spiderBinding(@Qualifier("spiderQueue") Queue spiderQueue, @Qualifier("spiderDirect") DirectExchange spiderDirect) {
        return BindingBuilder
                .bind(spiderQueue)
                .to(spiderDirect)
                .with(QueueEnum.QUEUE_SPIDER_CANCEL.getRouteKey());
    }

    /**
     * 将 readLog 交换机和  readLog insert队列绑定
     */
    @Bean("readLogInsertBinding")
    public Binding readLogInsertBinding(@Qualifier("readLogInsertQueue") Queue readLogInsertQueue, @Qualifier("readLogDirect") DirectExchange readLogDirect) {
        return BindingBuilder
                .bind(readLogInsertQueue)
                .to(readLogDirect)
                .with(QueueEnum.QUEUE_READ_LOG_INSERT.getRouteKey());

    }

    @Bean("readLogUpdateBinding")
    public Binding readLogUpdateBinding(@Qualifier("readLogUpdateQueue") Queue readLogUpdateQueue, @Qualifier("readLogDirect") DirectExchange readLogDirect) {
        return BindingBuilder
                .bind(readLogUpdateQueue)
                .to(readLogDirect)
                .with(QueueEnum.QUEUE_READ_LOG_UPDATE.getRouteKey());
    }

    /**
     * 绑定队列和交换机
     */
    @Bean("contentUrlBinding")
    public Binding contentUrlBinding(@Qualifier("novelContentCacheQueue") Queue novelContentCacheQueue, @Qualifier("contentDirect") DirectExchange contentCacheDirect) {
        return BindingBuilder
                .bind(novelContentCacheQueue)
                .to(contentCacheDirect)
                .with(QueueEnum.QUEUE_NOVEL_CONTENT_CACHE.getRouteKey());
    }

}
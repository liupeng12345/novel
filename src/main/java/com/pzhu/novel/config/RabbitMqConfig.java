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
    public Binding spiderBinding(@Qualifier("spiderQueue") Queue spiderQueue,@Qualifier("spiderDirect") DirectExchange spiderDirect) {
        return BindingBuilder
                .bind(spiderQueue)
                .to(spiderDirect)
                .with(QueueEnum.QUEUE_SPIDER_CANCEL.getRouteKey());
    }

    /**
     * 将 readLog 交换机和  readLog insert队列绑定
     */
    @Bean("readLogInsertBinding")
    public Binding readLogInsertBinding(@Qualifier("readLogInsertQueue") Queue readLogInsertQueue,@Qualifier("readLogDirect") DirectExchange readLogDirect) {
        return BindingBuilder
                .bind(readLogInsertQueue)
                .to(readLogDirect)
                .with(QueueEnum.QUEUE_READ_LOG_INSERT.getRouteKey());

    }

    @Bean("readLogUpdateBinding")
    public Binding readLogUpdateBinding(@Qualifier("readLogUpdateQueue") Queue readLogUpdateQueue,@Qualifier("readLogDirect") DirectExchange readLogDirect) {
        return BindingBuilder
                .bind(readLogUpdateQueue)
                .to(readLogDirect)
                .with(QueueEnum.QUEUE_READ_LOG_UPDATE.getRouteKey());
    }


//    /**
//     * 订单延迟队列队列所绑定的交换机
//     */
//    @Bean
//    DirectExchange orderTtlDirect() {
//        return (DirectExchange) ExchangeBuilder
//                .directExchange(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange())
//                .durable(true)
//                .build();
//    }
//
//    /**
//     * 订单实际消费队列
//     */
//    @Bean
//    public Queue orderQueue() {
//        return new Queue(QueueEnum.QUEUE_ORDER_CANCEL.getName());
//    }
//
//    /**
//     * 订单延迟队列（死信队列）
//     */
//    @Bean
//    public Queue orderTtlQueue() {
//        return QueueBuilder
//                .durable(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getName())
//                .withArgument("x-dead-letter-exchange", QueueEnum.QUEUE_ORDER_CANCEL.getExchange())//到期后转发的交换机
//                .withArgument("x-dead-letter-routing-key", QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey())//到期后转发的路由键
//                .build();
//    }
//
//    /**
//     * 将订单队列绑定到交换机
//     */
//    @Bean
//    Binding orderBinding(DirectExchange orderDirect,Queue orderQueue){
//        return BindingBuilder
//                .bind(orderQueue)
//                .to(orderDirect)
//                .with(QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey());
//    }
//
//    /**
//     * 将订单延迟队列绑定到交换机
//     */
//    @Bean
//    Binding orderTtlBinding(DirectExchange orderTtlDirect,Queue orderTtlQueue){
//        return BindingBuilder
//                .bind(orderTtlQueue)
//                .to(orderTtlDirect)
//                .with(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey());
//    }

}
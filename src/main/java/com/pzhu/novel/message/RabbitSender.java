package com.pzhu.novel.message;

import com.pzhu.novel.enums.QueueEnum;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

@Slf4j
@Component
public class RabbitSender {
    private static Logger LOGGER = LoggerFactory.getLogger(RabbitSender.class);
    private final RabbitTemplate rabbitTemplate;

    public RabbitSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        //给延迟队列发送消息
        rabbitTemplate.convertAndSend(QueueEnum.QUEUE_SPIDER_CANCEL.getExchange(), QueueEnum.QUEUE_SPIDER_CANCEL.getRouteKey(), message.getBytes(Charset.forName("utf-8")));
        LOGGER.info("send delay message orderId:{}", message);
    }

}

package com.pzhu.novel.message;

import com.pzhu.novel.enums.QueueEnum;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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


    public void sendContentCache(String message) {
        rabbitTemplate.convertAndSend(QueueEnum.QUEUE_NOVEL_CONTENT_CACHE.getExchange()
                , QueueEnum.QUEUE_NOVEL_CONTENT_CACHE.getRouteKey(), message.getBytes(StandardCharsets.UTF_8));
    }

    public void sendReadLogInsert(String url, String userName) {
        QueueEnum readLogInsertQueue = QueueEnum.QUEUE_READ_LOG_INSERT;
        String msg = url + "," + userName;
        rabbitTemplate.convertAndSend(readLogInsertQueue.getExchange(), readLogInsertQueue.getRouteKey(), msg.getBytes(StandardCharsets.UTF_8));
    }

    public void sendReadLogUpdate(String url, String userName) {
        QueueEnum readLogInsertQueue = QueueEnum.QUEUE_READ_LOG_UPDATE;
        String msg = url + "," + userName;
        rabbitTemplate.convertAndSend(readLogInsertQueue.getExchange(), readLogInsertQueue.getRouteKey(), msg.getBytes(StandardCharsets.UTF_8));
    }

}

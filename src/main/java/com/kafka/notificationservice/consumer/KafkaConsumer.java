package com.kafka.notificationservice.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "notificationservice", groupId = "myGroup")

    public void consumeNotification(String message) {
        log.info(String.format("Consuming message to notification service %s", message));
    }
}

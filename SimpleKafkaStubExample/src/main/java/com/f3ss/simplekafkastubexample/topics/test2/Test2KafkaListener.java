package com.f3ss.simplekafkastubexample.topics.test2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test2KafkaListener {

    @KafkaListener(topics = "${kafka.topic2_in}", groupId = "kafka.group-id")
    public void receiveMessage(String message) {
        log.info("Got a message: {}", message);
    }
}

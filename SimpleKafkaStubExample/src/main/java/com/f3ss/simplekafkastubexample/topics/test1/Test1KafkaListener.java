package com.f3ss.simplekafkastubexample.topics.test1;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class Test1KafkaListener {
    Test1Service test1Service;

    @KafkaListener(topics = "TEST1_IN", groupId = "groupId")
    void listener(String message) {
        log.info("Got message from topic test1: {}", message);
        test1Service.send(message);
    }
}

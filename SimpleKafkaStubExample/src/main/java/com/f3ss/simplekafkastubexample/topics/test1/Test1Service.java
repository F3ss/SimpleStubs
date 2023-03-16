package com.f3ss.simplekafkastubexample.topics.test1;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class Test1Service {

    private final KafkaTemplate kafkaTemplate;

    public String send(String message) {
        kafkaTemplate.send("TEST1_OUT", message);
        log.info("Message: {}, sent to TEST1_OUT", message);

        return "Ok";
    }
}

package com.f3ss.simplekafkastubexample.topics.test2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Test2KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic;

    public Test2KafkaProducerService(
            KafkaTemplate<String, String> kafkaTemplate,
            @Value("${kafka.topic2_in}") String topic
    ) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public String sendMessage(String message) {
        kafkaTemplate.send(topic, message);
        log.info("Message sent to topic {}. Message: {}", topic, message);

        return "Ok";
    }
}

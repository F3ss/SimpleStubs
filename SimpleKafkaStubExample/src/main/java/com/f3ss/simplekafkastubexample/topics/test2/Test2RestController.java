package com.f3ss.simplekafkastubexample.topics.test2;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@AllArgsConstructor
@Slf4j
public class Test2RestController {

    Test2KafkaProducerService test2KafkaProducerService;

    @PostMapping("api/v1/test2")
    public ResponseEntity<String> pushMessageToTest1(@RequestBody String message) {
        log.info("Got message from rest api/v1/test2: {}", message);
        return ResponseEntity.ok(test2KafkaProducerService.sendMessage(message));
    }
}

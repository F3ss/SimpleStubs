package com.f3ss.simplekafkastubexample.topics.test1;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@AllArgsConstructor
@Slf4j
public class Test1RestController {

    Test1Service test1Service;

    @PostMapping("api/v1/test1")
    public ResponseEntity<String> pushMessageToTest1(@RequestBody String message) {
        log.info("Got message from rest {}: {}", "TEST1_OUT", message);
        return ResponseEntity.ok(test1Service.send(message));
    }
}

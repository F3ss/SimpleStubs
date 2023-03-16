package com.f3ss.IbmMqStubExample.topics.test1;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Test1RestController {

    private final Test1Producer test1Producer;

    @PostMapping("api/v1/test1")
    public ResponseEntity<String> sendMessageToTest1Topic(@RequestBody String message) {
        String status = test1Producer.sendMessage(message);

        if (status.equals("Ok")) {
            return ResponseEntity.ok("Ok");
        }

        return ResponseEntity.badRequest().body(status);
    }
}

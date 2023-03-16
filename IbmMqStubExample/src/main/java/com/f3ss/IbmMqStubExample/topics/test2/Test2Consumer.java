package com.f3ss.IbmMqStubExample.topics.test2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test2Consumer {

    @JmsListener(destination = "test2")
    public void receiveMessage(String message) {
        log.info("Received message from test2: {}", message);
    }
}
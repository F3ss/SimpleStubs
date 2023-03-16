package com.f3ss.IbmMqStubExample.topics.test1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test1Consumer {

    @JmsListener(destination = "test1")
    public void receiveMessage(String message) {
        log.info("Received message from test1: {}", message);
    }
}
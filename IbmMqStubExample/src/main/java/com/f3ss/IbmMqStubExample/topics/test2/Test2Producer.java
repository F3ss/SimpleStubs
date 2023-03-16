package com.f3ss.IbmMqStubExample.topics.test2;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class Test2Producer {

    private final JmsTemplate jmsTemplate;

    public String sendMessage(String message) {
        try {
            jmsTemplate.convertAndSend("test2", message);
        } catch (Exception e) {
            log.info("Sent message to test2: {}", message);
            return e.getMessage();
        }
        log.info("Sent message: {}", message);
        return "Ok";
    }

}


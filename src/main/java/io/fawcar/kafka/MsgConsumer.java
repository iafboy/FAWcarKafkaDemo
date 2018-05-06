package io.fawcar.kafka;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MsgConsumer {
    private static final Logger log = LoggerFactory.getLogger(MsgConsumer.class);
    @KafkaListener(topics = {"fawcartopic"})
    public void processMessage(String content) {
        log.info("消息被消费"+content);
    }

}
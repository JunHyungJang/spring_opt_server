package com.example.spring_opt_test.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics="opt_test3")
    public void listener(String kafkaMessage) {
        log.info("kafka listener");
        log.info((String) kafkaMessage);
        System.out.println(kafkaMessage);
    }

}

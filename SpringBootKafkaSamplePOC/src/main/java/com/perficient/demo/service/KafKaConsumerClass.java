package com.perficient.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.perficient.demo.utils.KafkaMessageConstants;



@Service
public class KafKaConsumerClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumerClass.class);

    @KafkaListener(topics = KafkaMessageConstants.TOPIC_NAME,
                    groupId = KafkaMessageConstants.GROUP_ID)
    public void consume(String message){
        LOGGER.info(String.format("Message received by kafka consumer -> %s", message));
    }
}
package com.perficient.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.perficient.demo.utils.KafkaMessageConstants;


@Service
public class KafkaProducerClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerClass.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent by kafka provider -> %s", message));
        kafkaTemplate.send(KafkaMessageConstants.TOPIC_NAME, message);
    }
}
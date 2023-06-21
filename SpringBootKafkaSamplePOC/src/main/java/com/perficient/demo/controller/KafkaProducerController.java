package com.perficient.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.perficient.demo.service.KafkaProducerClass;

@Controller
@RequestMapping("/kafka")
public class KafkaProducerController {

    private KafkaProducerClass kafkaProducer;

    public KafkaProducerController(KafkaProducerClass kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}
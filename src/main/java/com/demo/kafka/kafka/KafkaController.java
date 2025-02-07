package com.demo.kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public String sendMessage(@RequestParam String message) {
        kafkaProducer.sendMessage("exampleTopic", message);
        return "Message sent to Kafka topic!";
    }

    @PostMapping("/publisha")
    public String sendAMessage(@RequestParam String message) {
        kafkaProducer.sendMessage("exampleTopics", message);
        return "Message sent to Kafka topic!";
    }

}

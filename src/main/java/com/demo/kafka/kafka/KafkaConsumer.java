package com.demo.kafka.kafka;

import com.demo.kafka.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class KafkaConsumer {

        @Autowired
        private EmailService emailService;

        @KafkaListener(topics = "exampleTopic", groupId = "myGroup")
        public void listen(String message) {
            emailService.sendEmailBlast(
                            List.of("danielmichael07062902851@gmail.com"), // List of recipients
                            message,
                            "The Email was successfully sent."
                    );
            System.out.println("Received message: " + message);
        }

    @KafkaListener(topics = "exampleTopics", groupId = "myGroup")
    public void listenA(String message) {
        emailService.sendEmailBlast(
                List.of("daniel.michael@accello.ng"), // List of recipients
                message,
                "The Email was successfully sent."
        );
        System.out.println("Received message: " + message);
    }


    }



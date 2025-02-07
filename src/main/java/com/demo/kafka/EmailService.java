package com.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {


    @Autowired
    private JavaMailSender mailSender;

    public void sendEmailBlast(List<String> recipients, String subject, String messageBody) {
        for (String recipient : recipients) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(recipient);
            message.setSubject(subject);
            message.setText(messageBody);
            message.setFrom("danielmichael07062902851@gmail.com"); // Sender email
          //  message.setFrom("daniel.michael@accello.ng"); // Sender email
            mailSender.send(message);
        }
    }

}

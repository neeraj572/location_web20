package com.location.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
      String email, String subject, String body) {
        
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("neerajkumaravijit3@gmail.com");
        message.setTo(email); 
        message.setSubject(subject); 
        message.setText(body);
        emailSender.send(message);
        
    }
}
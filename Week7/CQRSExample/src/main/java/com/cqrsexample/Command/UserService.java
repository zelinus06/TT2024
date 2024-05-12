package com.cqrsexample.Command;

import com.cqrsexample.Component.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private KafkaProducer kafkaProducer;

    public void sendCommand(User user) {
        kafkaProducer.sendMessage("myTopic", user);
    }
}
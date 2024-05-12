package com.cqrsexample.Component;

import com.cqrsexample.Repo.UserRepo;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @Autowired
    private UserRepo userRepo;
    @KafkaListener(topics = "myTopic", groupId = "my-group")
    public void listen(ConsumerRecord<String, String> record) {
        String message = record.value();
        System.out.printf(message);
    }
}
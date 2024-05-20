package com.cqrsexample.Component;

import com.cqrsexample.Command.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private static final String TOPIC_NAME = "myTopic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String TOPIC_NAME, User user) {
        kafkaTemplate.send(TOPIC_NAME, user);
    }
}

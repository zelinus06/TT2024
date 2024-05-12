package com.cqrsexample.Query;

import com.cqrsexample.Command.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class QueryService {
    @KafkaListener(topics = "command_topic", groupId = "group_id")
    public void consumeCommand(User user) {
        // process command and update QueryEntity
    }
}
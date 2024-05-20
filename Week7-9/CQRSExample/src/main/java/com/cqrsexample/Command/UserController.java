package com.cqrsexample.Command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService commandService;

    @PostMapping("/send")
    public ResponseEntity<String> sendCommand(@RequestBody User user) {
        commandService.sendCommand(user);
        return ResponseEntity.ok("Command sent successfully");
    }
}
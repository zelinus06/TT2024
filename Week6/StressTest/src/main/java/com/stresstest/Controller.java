package com.stresstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private CounterService counterService;
        @GetMapping("/count")
        public String getCount() {
            return "Total count: " + counterService.incrementCount();
        }
}

package com.stresstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public List<Object[]> getAllData() {
        return dataService.getAllData();
    }

    @GetMapping("/clear")
    public void clearData() {
        dataService.clearCache();
    }
}


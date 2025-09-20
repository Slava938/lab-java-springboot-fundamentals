package com.example.demo.controller;

import com.example.demo.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDayOfWeek() {
        return timeService.getDayOfWeek();
    }

    @GetMapping("/all")
    public Map<String, String> getAll() {
        Map<String, String> map = new HashMap<>();
        map.put("time", timeService.getCurrentTime());
        map.put("date", timeService.getCurrentDate());
        map.put("day", timeService.getDayOfWeek());
        return map;
    }
}

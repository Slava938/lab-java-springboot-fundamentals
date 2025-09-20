package com.example.demo.controller;

import com.example.demo.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int getTemperature() {
        return weatherService.getTemperature();
    }

    @GetMapping("/condition")
    public String getCondition() {
        return weatherService.getCondition();
    }

    @GetMapping("/wind")
    public int getWindSpeed() {
        return weatherService.getWindSpeed();
    }

    @GetMapping("/all")
    public Map<String, Object> getAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("temperature", weatherService.getTemperature());
        map.put("condition", weatherService.getCondition());
        map.put("windSpeed", weatherService.getWindSpeed());
        return map;
    }
}

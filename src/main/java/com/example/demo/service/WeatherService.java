package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class WeatherService {
    private final Random random = new Random();

    // -10..40
    public int getTemperature() {
        return random.nextInt(51) - 10;
    }

    public String getCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    // 0..100 km/h (or any unit)
    public int getWindSpeed() {
        return random.nextInt(101);
    }
}

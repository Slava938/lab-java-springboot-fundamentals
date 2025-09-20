package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class TimeService {

    public String getCurrentTime() {
        return LocalDateTime.now().toLocalTime().toString();
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getDayOfWeek() {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        return day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}

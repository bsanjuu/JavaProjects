package com.bsanju.weatherapp.scheduler;

import com.bsanju.weatherapp.service.WeatherService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class WeatherScheduler {
    private final WeatherService weatherService;

    public WeatherScheduler(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Scheduled(fixedRate = 600000) // Every 10 minutes
    public void fetchWeatherForCities() {
        List<String> cities = List.of("New York", "London", "Paris", "Hyderabad", "Mumbai");
        for (String city : cities) {
            weatherService.getWeather(city);
        }
    }
}

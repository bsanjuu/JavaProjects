package com.bsanju.weatherapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bsanju.weatherapp.dto.WeatherResponse;
import com.bsanju.weatherapp.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // Get Weather by City Name
    @GetMapping("/{city}")
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String city) {
        WeatherResponse response = weatherService.getWeather(city);
        return ResponseEntity.ok(response);
    }

    // Get Weather by Latitude & Longitude
    @GetMapping
    public ResponseEntity<WeatherResponse> getWeatherByCoordinates(@RequestParam double lat, @RequestParam double lon) {
        WeatherResponse response = weatherService.getWeatherByCoordinates(lat, lon);
        return ResponseEntity.ok(response);
    }

    // Get Weather for the Current Location using IP
    @GetMapping("/current")
    public ResponseEntity<WeatherResponse> getWeatherForCurrentLocation() {
        String city = weatherService.getCurrentCity();
        WeatherResponse response = weatherService.getWeather(city);
        return ResponseEntity.ok(response);
    }
}

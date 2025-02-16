package com.bsanju.weatherapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;  // ✅ Use Controller instead of RestController
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsanju.weatherapp.dto.WeatherResponse;
import com.bsanju.weatherapp.service.WeatherService;

@Controller  // ✅ Change from @RestController to @Controller
@RequestMapping("/")
public class WeatherUIController {
    private final WeatherService weatherService;

    public WeatherUIController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public String home(Model model) {
        List<String> majorCities = List.of("New York", "London", "Paris", "Tokyo", "Hyderabad", "Mumbai", "Sydney", "Toronto", "Dubai", "Berlin");
        model.addAttribute("majorCities", majorCities);
        return "index";  // ✅ Loads src/main/resources/templates/index.html
    }

    @GetMapping("/getWeather")
    public String getWeather(@RequestParam("city") String city, Model model) {
        WeatherResponse weather = weatherService.getWeather(city);
        model.addAttribute("weather", weather);
        model.addAttribute("majorCities", List.of("New York", "London", "Paris", "Tokyo", "Hyderabad", "Mumbai", "Sydney", "Toronto", "Dubai", "Berlin"));
        return "index";  // ✅ Return index.html after fetching data
    }
}

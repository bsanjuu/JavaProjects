package com.bsanju.weatherapp.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bsanju.weatherapp.dto.WeatherResponse;
import com.bsanju.weatherapp.model.WeatherData;
import com.bsanju.weatherapp.repository.WeatherRepository;

@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;
    private final String API_KEY = "425b53e22ec84c86ae370732251402";
    private final String BASE_URL = "http://api.weatherapi.com/v1/current.json?key={apiKey}&q={city}";

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public WeatherResponse getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        
        try {
            Map<String, Object> apiResponse = restTemplate.getForObject(BASE_URL, Map.class, API_KEY, city);

            if (apiResponse == null || !apiResponse.containsKey("current")) {
                throw new RuntimeException("Invalid API response");
            }

            Map<String, Object> currentWeather = (Map<String, Object>) apiResponse.get("current");

            WeatherResponse response = new WeatherResponse();
            response.setCityName(city);
            response.setTemperature(Double.parseDouble(currentWeather.get("temp_c").toString()));
            response.setHumidity(Integer.parseInt(currentWeather.get("humidity").toString()));
            response.setWeatherDescription(currentWeather.get("condition") != null ? ((Map<String, Object>) currentWeather.get("condition")).get("text").toString() : "Unknown");

            // Save data in DB
            WeatherData weatherData = new WeatherData();
            weatherData.setCityName(city);
            weatherData.setTemperature(response.getTemperature());
            weatherData.setHumidity(response.getHumidity());
            weatherData.setWeatherDescription(response.getWeatherDescription());
            weatherData.setTimestamp(LocalDateTime.now());
            weatherRepository.save(weatherData);

            return response;

        } catch (Exception e) {
            e.printStackTrace();
            return new WeatherResponse();
        }
    }
}

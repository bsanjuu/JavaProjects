package com.bsanju.weatherapp.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bsanju.weatherapp.config.ApiConfig;
import com.bsanju.weatherapp.dto.WeatherResponse;
import com.bsanju.weatherapp.model.WeatherData;
import com.bsanju.weatherapp.repository.WeatherRepository;

@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;
    private final ApiConfig apiConfig;
    private final RestTemplate restTemplate;

    public WeatherService(WeatherRepository weatherRepository, ApiConfig apiConfig, RestTemplate restTemplate) {
        this.weatherRepository = weatherRepository;
        this.apiConfig = apiConfig;
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeather(String city) {
        String url = apiConfig.getUrl() + "?key=" + apiConfig.getKey() + "&q=" + city;

        try {
            Map<String, Object> apiResponse = restTemplate.getForObject(url, Map.class);

            if (apiResponse == null || !apiResponse.containsKey("current")) {
                throw new RuntimeException("Invalid API response");
            }

            Map<String, Object> currentWeather = (Map<String, Object>) apiResponse.get("current");

            WeatherResponse response = new WeatherResponse();
            response.setCityName(city);
            response.setTemperature(Double.parseDouble(currentWeather.get("temp_c").toString()));
            response.setHumidity(Integer.parseInt(currentWeather.get("humidity").toString()));
            response.setWeatherDescription(((Map<String, Object>) currentWeather.get("condition")).get("text").toString());

            // Save Data
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

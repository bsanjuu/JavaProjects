package com.bsanju.weatherapp.dto;

import lombok.Data;

@Data
public class WeatherResponse {
    private String cityName;
    private double temperature;
    private int humidity;
    private String weatherDescription;

    public Double getTemperature() {
        return temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

}

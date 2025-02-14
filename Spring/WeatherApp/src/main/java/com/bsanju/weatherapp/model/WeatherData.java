package com.bsanju.weatherapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;
    private double temperature;
    private int humidity;
    private String weatherDescription;
    private LocalDateTime timestamp;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


}

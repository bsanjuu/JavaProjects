package com.bsanju.weatherapp.repository;

import com.bsanju.weatherapp.model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WeatherRepository extends JpaRepository<WeatherData, Long> {
    List<WeatherData> findByCityName(String cityName);
}

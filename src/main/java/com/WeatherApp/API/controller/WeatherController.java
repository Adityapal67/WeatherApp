package com.WeatherApp.API.controller;

import com.WeatherApp.API.dto.WeatherForecast;
import com.WeatherApp.API.dto.WeatherResource;
import com.WeatherApp.API.service.WetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class WeatherController {
    @Autowired
    private WetherService service;

    @GetMapping("/my/{city}")
    public WeatherResource getWeather(@PathVariable String city){
        return service.getData(city);
    }
    @GetMapping("/forecast")
    public WeatherForecast getforecast(@RequestParam String city , @RequestParam int days){
        return service.getForecast(city, days);
    }
}

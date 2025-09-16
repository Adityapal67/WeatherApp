package com.WeatherApp.API.dto;

import java.util.List;

public class WeatherForecast {
     private WeatherResource weatherResource;
     private List<DayTemp> dayTemps;

    public WeatherForecast(WeatherResource weatherResource, List<DayTemp> dayTemps) {
        this.weatherResource = weatherResource;
        this.dayTemps = dayTemps;
    }

    public WeatherForecast() {
    }

    public WeatherResource getWeatherResource() {
        return weatherResource;
    }

    public void setWeatherResource(WeatherResource weatherResource) {
        this.weatherResource = weatherResource;
    }

    public List<DayTemp> getDayTemps() {
        return dayTemps;
    }

    public void setDayTemps(List<DayTemp> dayTemps) {
        this.dayTemps = dayTemps;
    }
}


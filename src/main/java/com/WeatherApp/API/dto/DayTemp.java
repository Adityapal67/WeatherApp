package com.WeatherApp.API.dto;

public class DayTemp {
    private String date;
    private Double maxtemp;
    private Double avgTemp;
    private Double minTemp;

    public DayTemp(String date, Double maxtemp, Double avgTemp, Double minTemp) {
        this.date = date;
        this.maxtemp = maxtemp;
        this.avgTemp = avgTemp;
        this.minTemp = minTemp;
    }

    public DayTemp() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(Double maxtemp) {
        this.maxtemp = maxtemp;
    }

    public Double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(Double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }
}

package com.WeatherApp.API.dto;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

public class WeatherResource {
private String name;
private String region;
private String country;
private double temp;
private String condition;

    public WeatherResource() {
    }

    public WeatherResource(String name, String region, String country, double temp, String condition) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.temp = temp;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String  getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


}

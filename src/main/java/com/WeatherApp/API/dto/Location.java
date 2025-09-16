package com.WeatherApp.API.dto;


public class Location{
        public String name;
        public String region;
        public String country;

    public Location(String name, String region, String country) {
        this.name = name;
        this.region = region;
        this.country = country;
    }

    public Location() {
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
}



package com.WeatherApp.API.service;

import com.WeatherApp.API.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WetherService {

    private final String apikey = "e9cea69dcd7d4ec89fe171443252108";


    private final String apiurl = "https://api.weatherapi.com/v1/current.json";
    private final String apiForecasturl = "http://api.weatherapi.com/v1/forecast.json";

    private RestTemplate template = new RestTemplate();

    public WeatherResource getData(String city) {
        String url = apiurl + "?key=" + apikey + "&q=" + city;
        Root res = template.getForObject(url, Root.class);
        WeatherResource weatherResource = new WeatherResource();
        weatherResource.setName(res.getLocation().name);
        weatherResource.setRegion(res.getLocation().region);
        weatherResource.setCountry(res.getLocation().country);
        weatherResource.setTemp(res.getCurrent().temp_c);
        String condition = res.getCurrent().getCondition().getText();
        weatherResource.setCondition(condition);

        return weatherResource;
    }

    public WeatherForecast getForecast(@RequestParam String city, @RequestParam int days) {
        WeatherResource weatherResource = getData(city);
        WeatherForecast weatherForecast = new WeatherForecast();
        weatherForecast.setWeatherResource(weatherResource);

        List<DayTemp> dayTempList = new ArrayList<>();

        String url = apiForecasturl + "?key=" + apikey + "&q=" + city + "&days=" + days;
        Root rs = template.getForObject(url, Root.class);

        Forecast forecast = rs.getForecast();
        ArrayList<Forecastday> forecastday = forecast.getForecastday();
        for (Forecastday fs : forecastday) {
            DayTemp d = new DayTemp();
            d.setDate(fs.getDate());
            d.setMinTemp(fs.getDay().mintemp_c);
            d.setAvgTemp(fs.getDay().avgtemp_c);
            d.setMaxtemp(fs.getDay().maxtemp_c);
            dayTempList.add(d);
        }
        weatherForecast.setDayTemps(dayTempList);
        return weatherForecast;
    }
}

package com.WeatherApp.API.dto;

import java.util.ArrayList;

public class Forecastday {

        public String date;
        public int date_epoch;
        public day day;
        public ArrayList<Hour> hour;

    public Forecastday(String date, int date_epoch, day day, ArrayList<Hour> hour) {
        this.date = date;
        this.date_epoch = date_epoch;
        this.day = day;
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDate_epoch() {
        return date_epoch;
    }

    public void setDate_epoch(int date_epoch) {
        this.date_epoch = date_epoch;
    }

    public day getDay() {
        return day;
    }

    public void setDay(day day) {
        this.day = day;
    }

    public ArrayList<Hour> getHour() {
        return hour;
    }

    public void setHour(ArrayList<Hour> hour) {
        this.hour = hour;
    }
}

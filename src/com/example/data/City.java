package com.example.data;

import javax.swing.*;

public enum City {
    KOLKATA("Kolkata"),
    DELHI("Delhi");

    private String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}

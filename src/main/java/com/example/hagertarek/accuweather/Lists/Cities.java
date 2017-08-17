package com.example.hagertarek.accuweather.Lists;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class Cities {
    private String cityName;
    private String temp;
    private String mode;

    public Cities(String cityName, String temp, String mode) {
        this.cityName = cityName;
        this.temp = temp;
        this.mode = mode;
    }
    public Cities(String cityName) {
        this.cityName = cityName;

    }

    public String getCityName() {
        return cityName;
    }

    public String getTemp() {
        return temp;
    }

    public String getMode() {
        return mode;
    }
}

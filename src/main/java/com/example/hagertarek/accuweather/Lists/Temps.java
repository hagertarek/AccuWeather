package com.example.hagertarek.accuweather.Lists;

/**
 * Created by HagEr TaReK on 31/07/2017.
 */
public class Temps {
    private String day;
    private String max;
    private String min;

    public Temps(String day, String max, String min) {
        this.day = day;
        this.max = max;
        this.min = min;
    }

    public String getDay() {
        return day;
    }

    public String getMax() {
        return max;
    }

    public String getMin() {
        return min;
    }
}

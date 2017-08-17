package com.example.hagertarek.accuweather.Lists;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class TempsV {
    private String day;
    private String max;
    private String min;

    public TempsV(String day, String max, String min) {
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

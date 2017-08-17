package com.example.hagertarek.accuweather.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.hagertarek.accuweather.Adapters.AdapterCities;
import com.example.hagertarek.accuweather.Lists.Cities;
import com.example.hagertarek.accuweather.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class ActivityCities extends AppCompatActivity {
    private RecyclerView recyclerViewCity;
    private RecyclerView.LayoutManager mLayoutManagerCity;
    private AdapterCities adapterCities;
    private List<Cities> citiesData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        recyclerViewCity = (RecyclerView) findViewById(R.id.rvCities);
        citiesData = new ArrayList<>();
        //fitch data to Cities RecycleView
        for (int i = 0; i < 2; i++) {
            Cities CityTemp = new Cities("Mansoura", "25°", "Mostly sunny");
            citiesData.add(CityTemp);

        }
        mLayoutManagerCity = new LinearLayoutManager(ActivityCities.this,LinearLayoutManager.VERTICAL,false);
        recyclerViewCity.setLayoutManager(mLayoutManagerCity);
        adapterCities = new AdapterCities(ActivityCities.this, citiesData);
        recyclerViewCity.setAdapter(adapterCities);


    }

    public void addCity(View view) {
        startActivity(new Intent(ActivityCities.this, ActivityAddCity.class));

    }
}

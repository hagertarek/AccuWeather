package com.example.hagertarek.accuweather.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hagertarek.accuweather.Adapters.AdapterTemp;
import com.example.hagertarek.accuweather.Adapters.AdapterVertical;
import com.example.hagertarek.accuweather.Lists.Temps;
import com.example.hagertarek.accuweather.Lists.TempsV;
import com.example.hagertarek.accuweather.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class ActivityMain extends AppCompatActivity {
    private RecyclerView recyclerViewH,recyclerViewV;
    private RecyclerView.LayoutManager mLayoutManagerH,mLayoutManagerV;
    private AdapterTemp adapter;
    private AdapterVertical adapterVertical;
    private List<Temps> tempsDataH;
    private List<TempsV> tempsDataV;
    TextView currentCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize
        recyclerViewH = (RecyclerView) findViewById(R.id.rvItemH);
        recyclerViewV = (RecyclerView) findViewById(R.id.rvItemV);
        tempsDataH = new ArrayList<>();
        tempsDataV = new ArrayList<>();
        //fitch data to horizontal RecycleView
        for (int i = 0; i < 10; i++) {
            Temps myTemp = new Temps("Now", "25°", "");
            tempsDataH.add(myTemp);

        }
        mLayoutManagerH = new LinearLayoutManager(ActivityMain.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewH.setLayoutManager(mLayoutManagerH);
        adapter = new AdapterTemp(ActivityMain.this, tempsDataH);
        recyclerViewH.setAdapter(adapter);

        //fitch data to Vertical RecycleView
        for (int i = 0; i < 5; i++) {
            TempsV myTempV = new TempsV("Tomorrow,Aug 9", "25°/23°", "");
            tempsDataV.add(myTempV);

        }
        mLayoutManagerV = new LinearLayoutManager(ActivityMain.this,LinearLayoutManager.VERTICAL,false);
        recyclerViewV.setLayoutManager(mLayoutManagerV);
        adapterVertical = new AdapterVertical(ActivityMain.this, tempsDataV);
        recyclerViewV.setAdapter(adapterVertical);


    }

    //open cities Activity
    public void clickCity(View view) {
        startActivity(new Intent(ActivityMain.this,ActivityCities.class));
    }
    //open setting Activity
    public void clickSet(View view) {
        startActivity(new Intent(ActivityMain.this,ActivitySetting.class));

    }
}

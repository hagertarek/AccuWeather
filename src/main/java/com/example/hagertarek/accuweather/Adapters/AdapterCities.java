package com.example.hagertarek.accuweather.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hagertarek.accuweather.Lists.Cities;
import com.example.hagertarek.accuweather.R;

import java.util.List;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class AdapterCities extends RecyclerView.Adapter<AdapterCities.ViewHolder> {

    private Context context;
    private List<Cities> mitems;


    /* construct a new OrderAdapter.......*/
    public AdapterCities(Context context, List<Cities> mitems) {
        this.context = context;
        this.mitems = mitems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cities, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.cityName.setText(mitems.get(position).getCityName());
        holder.temp.setText(mitems.get(position).getTemp());
        holder.mode.setText(mitems.get(position).getMode());

    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView cityName;
        public TextView temp;
        public TextView mode;

        public ViewHolder(View itemView) {
            super(itemView);
            cityName = (TextView) itemView.findViewById(R.id.city);
            temp= (TextView) itemView.findViewById(R.id.city_temp);
            mode = (TextView) itemView.findViewById(R.id.city_mode);


        }

    }
}

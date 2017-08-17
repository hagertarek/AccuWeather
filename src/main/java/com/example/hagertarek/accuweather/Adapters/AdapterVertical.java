package com.example.hagertarek.accuweather.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hagertarek.accuweather.R;
import com.example.hagertarek.accuweather.Lists.TempsV;

import java.util.List;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class AdapterVertical extends RecyclerView.Adapter<AdapterVertical.ViewHolder> {

    private Context context;
    private List<TempsV> mitems;


    /* construct a new OrderAdapter.......*/
    public AdapterVertical(Context context, List<TempsV> mitems) {
        this.context = context;
        this.mitems = mitems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itemv, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.time.setText(mitems.get(position).getDay());
        holder.timeTemp.setText(mitems.get(position).getMax());
        //holder.timeIcon.setBackground();

    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView time;
        public TextView timeTemp;
        public ImageView timeIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            time = (TextView) itemView.findViewById(R.id.timeV);
            timeTemp= (TextView) itemView.findViewById(R.id.time_tempV);
            timeIcon = (ImageView) itemView.findViewById(R.id.time_iconV);


        }

    }
}

package com.example.credai.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Adapters.Lists.Popular;
import com.example.credai.Adapters.Lists.Trending;
import com.example.credai.R;

import java.util.List;

public class PopularAdaptertwo extends RecyclerView.Adapter<PopularAdaptertwo.View_popular_Holder>{
    Context context;
    List<Popular>populars;
    LayoutInflater layoutInflater;


    public PopularAdaptertwo(Context context, List<Popular> populars) {
        this.context = context;
        this.populars = populars;
    }

    @NonNull
    @Override
    public View_popular_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.popular_main,parent,false);
        return new View_popular_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_popular_Holder holder, int position) {
        Popular popular=populars.get(position);
        holder.imageView.setImageResource(popular.getImageResource());
        holder.name.setText(popular.getName());
        holder.price.setText(popular.getPrice());
        holder.location.setText(popular.getLocation());
        holder.date.setText(popular.getDate());

    }

    @Override
    public int getItemCount() {
        return populars.size();
    }

    public static class View_popular_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, location, price, date;
        ImageButton viewdetails;

        public View_popular_Holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name_popular);
            location=itemView.findViewById(R.id.text_location_popular);
            price=itemView.findViewById(R.id.price_text_popular);
            date=itemView.findViewById(R.id.possession_text_popular);
            imageView=itemView.findViewById(R.id.image_popular);


        }
    }
}

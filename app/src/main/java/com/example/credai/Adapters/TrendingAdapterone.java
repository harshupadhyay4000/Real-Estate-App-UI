package com.example.credai.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Adapters.Lists.Trending;
import com.example.credai.Pages.DetailsActivity;
import com.example.credai.R;

import java.util.List;

public class TrendingAdapterone extends RecyclerView.Adapter<TrendingAdapterone.View_trend_Holder>{

    Context context;
    List<Trending>trendings;
    LayoutInflater layoutInflater;

    public TrendingAdapterone(Context context, List<Trending> trendings) {
        this.context = context;
        this.trendings = trendings;
    }

    @NonNull
    @Override
    public View_trend_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.trends_main,parent,false);
        return new View_trend_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_trend_Holder holder, int position) {
        Trending trending=trendings.get(position);

        holder.imageView.setImageResource(trending.getImageResource());
        holder.name.setText(trending.getName());
        holder.location.setText(trending.getLocation());
        holder.price.setText(trending.getPrice());
        holder.date.setText(trending.getDate());
        holder.brochure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailsActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return trendings.size();
    }

    public static class View_trend_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, location, price, date;
        ImageButton brochure;
            public View_trend_Holder(@NonNull View itemView) {
                super(itemView);

                imageView=itemView.findViewById(R.id.image_trending);
                name=itemView.findViewById(R.id.name_trending);
                date=itemView.findViewById(R.id.possesion_text_trending);
                location=itemView.findViewById(R.id.description_text_trending);
                price=itemView.findViewById(R.id.price_text_trending);
                brochure=itemView.findViewById(R.id.brochure_btn_trending);

            }
    }
}

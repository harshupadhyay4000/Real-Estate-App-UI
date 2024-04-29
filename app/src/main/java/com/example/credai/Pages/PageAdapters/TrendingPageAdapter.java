package com.example.credai.Pages.PageAdapters;

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

import com.example.credai.Adapters.Lists.Trending;
import com.example.credai.Pages.DetailsActivity;
import com.example.credai.R;

import java.util.List;

public class TrendingPageAdapter extends RecyclerView.Adapter<TrendingPageAdapter.View_tendp_Holder>{

    Context context;
    List<Trending>trendings;
    LayoutInflater layoutInflater;

    public TrendingPageAdapter(Context context, List<Trending> trendings) {
        this.context = context;
        this.trendings = trendings;
    }

    @NonNull
    @Override
    public View_tendp_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.trendingp,parent,false);
        return new View_tendp_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_tendp_Holder holder, int position) {
        Trending trending=trendings.get(position);

        holder.imageView.setImageResource(trending.getImageResource());
        holder.name.setText(trending.getName());
        holder.address.setText(trending.getLocation());
        holder.price.setText(trending.getPrice());
        holder.date.setText(trending.getDate());
        holder.Brochure.setOnClickListener(new View.OnClickListener() {
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

    public static class View_tendp_Holder extends RecyclerView.ViewHolder {
        TextView name, address, price, date;
        ImageView imageView;
        ImageButton Brochure;

        public View_tendp_Holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.residency_name_trendingp);
            address=itemView.findViewById(R.id.address_text_trendingp);
            price=itemView.findViewById(R.id.price_text_trendingp);
            date=itemView.findViewById(R.id.possession_text_trendingp);
            imageView=itemView.findViewById(R.id.image_trendingp);
            Brochure=itemView.findViewById(R.id.brochure_btn_trend_adapter);
        }
    }
}

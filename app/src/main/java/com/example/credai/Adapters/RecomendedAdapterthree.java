package com.example.credai.Adapters;

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

import com.example.credai.Adapters.Lists.Recomended;
import com.example.credai.Pages.DetailsActivity;
import com.example.credai.R;

import java.util.List;

public class RecomendedAdapterthree extends RecyclerView.Adapter<RecomendedAdapterthree.View_recomend_Holder>{
    Context context;
    List<Recomended>recomendeds;
    LayoutInflater layoutInflater;

    public RecomendedAdapterthree(Context context, List<Recomended> recomendeds) {
        this.context = context;
        this.recomendeds = recomendeds;
    }

    @NonNull
    @Override
    public View_recomend_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recomended,parent,false);
        return new View_recomend_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_recomend_Holder holder, int position) {
        Recomended recomended=recomendeds.get(position);
        holder.imageView.setImageResource(recomended.getImageResource());
        holder.name.setText(recomended.getName());
        holder.location.setText(recomended.getLocation());
        holder.price.setText(recomended.getPrice());
        holder.date.setText(recomended.getDate());
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
        return recomendeds.size();
    }

    public static class View_recomend_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, location, price, date;
        ImageButton Brochure;
        public View_recomend_Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_recomended);
            name=itemView.findViewById(R.id.name_recomended);
            date=itemView.findViewById(R.id.possesion_text_recomended);
            location=itemView.findViewById(R.id.description_text_recomended);
            price=itemView.findViewById(R.id.price_text_recomended);
            Brochure=itemView.findViewById(R.id.brochure_btn_recomended);
        }
    }
}

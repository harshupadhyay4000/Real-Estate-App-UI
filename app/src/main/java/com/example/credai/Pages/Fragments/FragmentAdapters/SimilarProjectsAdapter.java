package com.example.credai.Pages.Fragments.FragmentAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Adapters.Lists.Recomended;
import com.example.credai.R;

import java.util.List;

public class SimilarProjectsAdapter extends RecyclerView.Adapter<SimilarProjectsAdapter.View_similar_Holder>{
    Context context;
    List<Recomended>recomendeds;
    LayoutInflater layoutInflater;

    public SimilarProjectsAdapter(Context context, List<Recomended> recomendeds) {
        this.context = context;
        this.recomendeds = recomendeds;
    }

    @NonNull
    @Override
    public View_similar_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.similar,parent,false);
        return new View_similar_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_similar_Holder holder, int position) {
        Recomended recomended=recomendeds.get(position);
        holder.imageView.setImageResource(recomended.getImageResource());
        holder.name.setText(recomended.getName());
        holder.price.setText(recomended.getPrice());
        holder.location.setText(recomended.getLocation());
        holder.date.setText(recomended.getDate());
    }

    @Override
    public int getItemCount() {
        return recomendeds.size();
    }

    public static class View_similar_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, location, price, date;
        public View_similar_Holder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_similarprojects_adapter);
            location=itemView.findViewById(R.id.text_location_similarprojects);
            price=itemView.findViewById(R.id.price_text_similarprojects);
            date=itemView.findViewById(R.id.possession_text_similarprojects);
            imageView=itemView.findViewById(R.id.image_similarprojects_adapter);
        }
    }
}

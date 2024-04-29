package com.example.credai.Pages.Fragments.FragmentAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Gallery;
import com.example.credai.R;

import java.util.List;

public class MeasurementAdapter extends RecyclerView.Adapter<MeasurementAdapter.View_measurements_Holder>{
    Context context;
    List<Gallery>galleries;
    LayoutInflater layoutInflater;

    public MeasurementAdapter(Context context, List<Gallery> galleries) {
        this.context = context;
        this.galleries = galleries;
    }

    @NonNull
    @Override
    public View_measurements_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.measure,parent,false);
        return new View_measurements_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_measurements_Holder holder, int position) {
        Gallery gallery=galleries.get(position);
        holder.imageView.setImageResource(gallery.getImageResource1());

    }

    @Override
    public int getItemCount() {
        return galleries.size();
    }

    public static class View_measurements_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public View_measurements_Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_for_floorplan);
        }
    }
}

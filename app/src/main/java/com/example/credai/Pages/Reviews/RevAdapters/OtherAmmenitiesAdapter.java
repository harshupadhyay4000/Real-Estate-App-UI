package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Reviews.Ammenities;
import com.example.credai.Pages.Reviews.RevAdapters.List.Ammenitiees;
import com.example.credai.R;

import java.util.List;

public class OtherAmmenitiesAdapter extends RecyclerView.Adapter<OtherAmmenitiesAdapter.View_othera_Holder>{
    Context context;
    List<Ammenitiees>ammenitiees;
    LayoutInflater layoutInflater;

    public OtherAmmenitiesAdapter(Context context, List<Ammenitiees> ammenitiees) {
        this.context = context;
        this.ammenitiees = ammenitiees;
    }

    @NonNull
    @Override
    public View_othera_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.other_facilities,parent,false);
        return new View_othera_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_othera_Holder holder, int position) {
        Ammenitiees ammenitiees1=ammenitiees.get(position);

        holder.imageView.setImageResource(ammenitiees1.getImageResource1());
        holder.name.setText(ammenitiees1.getName());

    }

    @Override
    public int getItemCount() {
        return ammenitiees.size();
    }

    public static class View_othera_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        public View_othera_Holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.games_name_text_adapter);
            imageView=itemView.findViewById(R.id.image_for_otherfacilities);
        }
    }
}

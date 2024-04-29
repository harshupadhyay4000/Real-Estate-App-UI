package com.example.credai.Pages.Fragments.FragmentAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Adapters.Lists.Popular;
import com.example.credai.R;

import java.util.List;

public class NearbyProjectsAdapter extends RecyclerView.Adapter<NearbyProjectsAdapter.View_nearproj_Holder>{
    Context context;
    List<Popular>populars;
    LayoutInflater layoutInflater;

    public NearbyProjectsAdapter(Context context, List<Popular> populars) {
        this.context = context;
        this.populars = populars;
    }

    @NonNull
    @Override
    public View_nearproj_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.nearbyproject,parent,false);
        return new View_nearproj_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_nearproj_Holder holder, int position) {
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

    public static class View_nearproj_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, location, price, date;
        public View_nearproj_Holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name_nearbyprojects_adapter);
            location=itemView.findViewById(R.id.text_location_nearbyprojects);
            price=itemView.findViewById(R.id.price_text_nearbyprojects);
            date=itemView.findViewById(R.id.possession_text_nearbyprojects);
            imageView=itemView.findViewById(R.id.image_nearbyprojects_adapter);
        }
    }
}

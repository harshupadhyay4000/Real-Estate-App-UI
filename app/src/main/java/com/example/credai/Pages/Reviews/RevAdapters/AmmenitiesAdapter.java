package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Reviews.RevAdapters.List.Things;
import com.example.credai.R;

import java.util.List;

public class AmmenitiesAdapter extends RecyclerView.Adapter<AmmenitiesAdapter.View_ammenities_Holder>{
    Context context;
    List<Things>things;

    LayoutInflater layoutInflater;

    public AmmenitiesAdapter(Context context, List<Things> things) {
        this.context = context;
        this.things = things;
    }

    @NonNull
    @Override
    public View_ammenities_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.amenities,parent,false);
        return new View_ammenities_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_ammenities_Holder holder, int position) {
        Things things1=things.get(position);
        holder.imageView.setImageResource(things1.getImageResource1());
        holder.name.setText(things1.getName());

    }

    @Override
    public int getItemCount() {
        return things.size();
    }

    public static class View_ammenities_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        public View_ammenities_Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.ammenities_icon_adapter);
            name=itemView.findViewById(R.id.ammenity_name_adapter);

        }
    }
}

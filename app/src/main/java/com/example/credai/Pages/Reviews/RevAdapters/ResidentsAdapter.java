package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Reviews.RevAdapters.List.Reviews;
import com.example.credai.R;

import java.util.List;

public class ResidentsAdapter extends RecyclerView.Adapter<ResidentsAdapter.View_residents_Holder>{
    Context context;
    List<Reviews>reviews;
    LayoutInflater layoutInflater;

    public ResidentsAdapter(Context context, List<Reviews> reviews) {
        this.context = context;
        this.reviews = reviews;
    }

    @NonNull
    @Override
    public View_residents_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.residents_review,parent,false);
        return new View_residents_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_residents_Holder holder, int position) {
        Reviews reviews1=reviews.get(position);
        holder.name.setText(reviews1.getName());
        holder.parapositive.setText(reviews1.getParaone());
        holder.paranegative.setText(reviews1.getParatwo());

    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public static class View_residents_Holder extends RecyclerView.ViewHolder {
        TextView name, parapositive, paranegative;
        public View_residents_Holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name_reviewername);
            parapositive=itemView.findViewById(R.id.positive_para);
            paranegative=itemView.findViewById(R.id.negative_para);

        }
    }
}

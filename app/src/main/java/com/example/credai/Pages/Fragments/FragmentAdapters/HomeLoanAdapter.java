package com.example.credai.Pages.Fragments.FragmentAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Images;
import com.example.credai.R;

import java.util.List;

public class HomeLoanAdapter extends RecyclerView.Adapter<HomeLoanAdapter.View_home_Holder>{
    Context context;
    List<Images>images;
    LayoutInflater layoutInflater;

    public HomeLoanAdapter(Context context, List<Images> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public View_home_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.home_loan,parent,false);
        return new View_home_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_home_Holder holder, int position) {
            Images images1=images.get(position);

            holder.imageView.setImageResource(images1.getImageResource1());
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public static class View_home_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public View_home_Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.home_loan_bankimg);
        }
    }
}

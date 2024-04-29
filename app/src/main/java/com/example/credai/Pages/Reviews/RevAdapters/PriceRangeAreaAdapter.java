package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Reviews.RevAdapters.List.PriceRange;
import com.example.credai.R;

import java.util.List;

public class PriceRangeAreaAdapter extends RecyclerView.Adapter<PriceRangeAreaAdapter.View_pricea_Holder>{
    Context context;
    List<PriceRange> priceRangeList;
    LayoutInflater layoutInflater;

    public PriceRangeAreaAdapter(Context context, List<PriceRange> priceRangeList) {
        this.context = context;
        this.priceRangeList = priceRangeList;
    }

    @NonNull
    @Override
    public View_pricea_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.pricerang_area,parent,false);
        return new View_pricea_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_pricea_Holder holder, int position) {
        PriceRange priceRange=priceRangeList.get(position);
        holder.heading.setText(priceRange.getType());
        holder.price.setText(priceRange.getPrice());


    }

    @Override
    public int getItemCount() {
        return priceRangeList.size();
    }

    public static class View_pricea_Holder extends RecyclerView.ViewHolder {
        TextView heading, price;
        public View_pricea_Holder(@NonNull View itemView) {
            super(itemView);
            heading=itemView.findViewById(R.id.type_text_pricerange);
            price=itemView.findViewById(R.id.price_text_pricerange_adapter);
        }
    }
}

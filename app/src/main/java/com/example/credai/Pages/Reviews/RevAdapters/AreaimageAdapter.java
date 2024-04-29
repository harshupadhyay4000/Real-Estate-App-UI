package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Reviews.RevAdapters.List.ImageArea;
import com.example.credai.R;

import java.util.List;

public class AreaimageAdapter extends RecyclerView.Adapter<AreaimageAdapter.View_imga_Holder>{
    Context context;
    List<ImageArea>imageAreas;
    LayoutInflater layoutInflater;

    public AreaimageAdapter(Context context, List<ImageArea> imageAreas) {
        this.context = context;
        this.imageAreas = imageAreas;
    }

    @NonNull
    @Override
    public View_imga_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.areaimagesadapter,parent,false);
        return new View_imga_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_imga_Holder holder, int position) {
        ImageArea imageArea=imageAreas.get(position);

        holder.imageView.setImageResource(imageArea.getImageresource());
    }

    @Override
    public int getItemCount() {
        return imageAreas.size();
    }

    public static class View_imga_Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public View_imga_Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview_areaimg_adapter);

        }
    }
}

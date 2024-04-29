package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Reviews.RevAdapters.List.More_desc;
import com.example.credai.R;

import java.util.List;

public class AreaDescriptionAdapter extends RecyclerView.Adapter<AreaDescriptionAdapter.View_desca_Holder>{
    Context context;
    List<More_desc>moreDescs;
    LayoutInflater layoutInflater;

    public AreaDescriptionAdapter(Context context, List<More_desc> moreDescs) {
        this.context = context;
        this.moreDescs = moreDescs;
    }

    @NonNull
    @Override
    public View_desca_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.more_desc_area,parent,false);
        return new View_desca_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_desca_Holder holder, int position) {
            More_desc moreDesc=moreDescs.get(position);

            holder.heading1.setText(moreDesc.getHeadingone());
            holder.description1.setText(moreDesc.getOnedescription());
            holder.heading2.setText(moreDesc.getHeadingtwo());
            holder.description2.setText(moreDesc.getTwodescription());
            holder.heading3.setText(moreDesc.getHeadingthree());
            holder.description3.setText(moreDesc.getThreedescription());
            holder.imageView.setImageResource(moreDesc.getImageResourece());
    }

    @Override
    public int getItemCount() {
        return moreDescs.size();
    }

    public static class View_desca_Holder extends RecyclerView.ViewHolder {
        TextView mainheading, heading1, heading2, heading3, description1, description2, description3;
        ImageView imageView;
        public View_desca_Holder(@NonNull View itemView) {
            super(itemView);
            mainheading=itemView.findViewById(R.id.whatsgreat_heading);
            heading1=itemView.findViewById(R.id.heading_one_adapter);
            description1=itemView.findViewById(R.id.description_one_adapter_heading);
            heading2=itemView.findViewById(R.id.commercial_hub_heading_adapter);
            description2=itemView.findViewById(R.id.description_two_adapter);
            heading3=itemView.findViewById(R.id.ready_tomove_heading_adapter);
            description3=itemView.findViewById(R.id.description_three_adapter);
            imageView=itemView.findViewById(R.id.icon_area_adapter);


        }
    }
}

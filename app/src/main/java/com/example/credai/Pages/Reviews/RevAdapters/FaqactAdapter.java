package com.example.credai.Pages.Reviews.RevAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Faqs;
import com.example.credai.R;

import java.util.List;

public class FaqactAdapter extends RecyclerView.Adapter<FaqactAdapter.View_afaq_Holder>{
    Context context;
    List<Faqs>faqs;
    LayoutInflater layoutInflater;

    public FaqactAdapter(Context context, List<Faqs> faqs) {
        this.context = context;
        this.faqs = faqs;
    }

    @NonNull
    @Override
    public View_afaq_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.act_faq,parent,false);
        return new View_afaq_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_afaq_Holder holder, int position) {
        Faqs faqs1=faqs.get(position);

        holder.username.setText(faqs1.getName());
        holder.postdate.setText(faqs1.getDate());
        holder.text.setText(faqs1.getReview());
    }

    @Override
    public int getItemCount() {
        return faqs.size();
    }

    public static class View_afaq_Holder extends RecyclerView.ViewHolder {
        TextView username, postdate, text;
        ImageButton showmore;
        public View_afaq_Holder(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.user_name_faq_adapter_act);
            postdate=itemView.findViewById(R.id.posted_date_faqs_act);
            text=itemView.findViewById(R.id.faqs_by_theuser_act);
            showmore=itemView.findViewById(R.id.show_morebtn_faq_act);
        }
    }
}

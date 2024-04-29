package com.example.credai.Pages.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.credai.Pages.Reviews.ReviewByResidents;
import com.example.credai.R;


public class Review_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review_, container, false);

        CardView cardView=view.findViewById(R.id.card_frag_review);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ReviewByResidents.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
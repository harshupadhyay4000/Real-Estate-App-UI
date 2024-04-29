package com.example.credai.Pages.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.credai.Pages.GalleryActivity;
import com.example.credai.R;


public class Gallery_Fragment extends Fragment {


    ImageView viewall;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery_, container, false);


        viewall=view.findViewById(R.id.view_all_images_gallery);

        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), GalleryActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
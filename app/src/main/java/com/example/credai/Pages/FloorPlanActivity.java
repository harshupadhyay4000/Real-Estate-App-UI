package com.example.credai.Pages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Gallery;
import com.example.credai.Pages.Fragments.FragmentAdapters.MeasurementAdapter;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class FloorPlanActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_floor_plan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        back=findViewById(R.id.back_btn_floorplan);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FloorPlanActivity.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        recyclerView=findViewById(R.id.recycle_floorplan_floor);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);


        List<Gallery>galleries=new ArrayList<>();
        galleries.add(new Gallery(R.drawable.living_dine));
        galleries.add(new Gallery(R.drawable.kitchen));
        galleries.add(new Gallery(R.drawable.bedroom));
        galleries.add(new Gallery(R.drawable.toilet));
        galleries.add(new Gallery(R.drawable.bedroom_two));
        galleries.add(new Gallery(R.drawable.toilet));
        galleries.add(new Gallery(R.drawable.balcony));

        MeasurementAdapter measurementAdapter=new MeasurementAdapter(this,galleries);
        recyclerView.setAdapter(measurementAdapter);


    }
}
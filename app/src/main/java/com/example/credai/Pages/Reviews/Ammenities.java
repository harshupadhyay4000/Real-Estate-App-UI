package com.example.credai.Pages.Reviews;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Pages.DetailsActivity;
import com.example.credai.Pages.Reviews.RevAdapters.AmmenitiesAdapter;
import com.example.credai.Pages.Reviews.RevAdapters.List.Ammenitiees;
import com.example.credai.Pages.Reviews.RevAdapters.List.Things;
import com.example.credai.Pages.Reviews.RevAdapters.OtherAmmenitiesAdapter;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class Ammenities extends AppCompatActivity {
    ImageButton backbtn;
    RecyclerView recyclerView, recyclerView2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ammenities);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        recyclerView=findViewById(R.id.recycle_ammenities);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView2=findViewById(R.id.recycle_other_facilities);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager);


        List<Things>things=new ArrayList<>();
        things.add(new Things(R.drawable.swim_icon,"Swimming"));
        things.add(new Things(R.drawable.volleyball_court,"Volley Ball"));
        things.add(new Things(R.drawable.elevators,"Elevators"));
        things.add(new Things(R.drawable.gardern,"Gardern"));
        things.add(new Things(R.drawable.cricket,"Cricket Pitch"));
        things.add(new Things(R.drawable.piped_gas,"Piped Gas"));

        AmmenitiesAdapter ammenitiesAdapter=new AmmenitiesAdapter(this,things);
        recyclerView.setAdapter(ammenitiesAdapter);

        backbtn=findViewById(R.id.back_btn_ammenities_ammenities);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Ammenities.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        List<Ammenitiees>ammenitiees=new ArrayList<>();
        ammenitiees.add(new Ammenitiees(R.drawable.carrom,"Indoor Games"));
        ammenitiees.add(new Ammenitiees(R.drawable.security_icon,"24/7 Security"));
        ammenitiees.add(new Ammenitiees(R.drawable.yoga,"Yoga/Meditation Area"));
        ammenitiees.add(new Ammenitiees(R.drawable.jog,"Jogging Track"));
        ammenitiees.add(new Ammenitiees(R.drawable.cctv_camera,"CCTV Camera Security"));


        OtherAmmenitiesAdapter otherAmmenitiesAdapter=new OtherAmmenitiesAdapter(this,ammenitiees);
        recyclerView2.setAdapter(otherAmmenitiesAdapter);


    }
}
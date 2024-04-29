package com.example.credai.Pages;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.credai.Adapters.Lists.Trending;
import com.example.credai.MainActivity;
import com.example.credai.Pages.PageAdapters.TrendingPageAdapter;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class Trending_Page extends AppCompatActivity {
    RecyclerView recyclerView;

    ImageButton backbtn, filter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.recycle_trending_page);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Trending>trendings=new ArrayList<>();
        trendings.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        trendings.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        trendings.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        trendings.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));

        TrendingPageAdapter trendingPageAdapter=new TrendingPageAdapter(this,trendings);
        recyclerView.setAdapter(trendingPageAdapter);

        backbtn=findViewById(R.id.back_btn_trending_page);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Trending_Page.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        filter=findViewById(R.id.filter_btn_trendingp);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Trending_Page.this, Filter.class);
                startActivity(intent);
            }
        });


    }
}
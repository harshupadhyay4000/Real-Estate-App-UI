package com.example.credai;

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

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.credai.Adapters.Lists.Popular;
import com.example.credai.Adapters.Lists.Recomended;
import com.example.credai.Adapters.Lists.Trending;
import com.example.credai.Adapters.PopularAdaptertwo;
import com.example.credai.Adapters.RecomendedAdapterthree;
import com.example.credai.Adapters.TrendingAdapterone;
import com.example.credai.Pages.Trending_Page;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    ImageButton viewall1, viewall2,viewall3;

    int url1 = R.drawable.scroll_img_one;
    int url2 = R.drawable.scroll_img_one;
    int url3 = R.drawable.scroll_img_one;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageSlider sliderView=findViewById(R.id.slider);

        List<SlideModel> imageList = new ArrayList<>(); // Create image list

        imageList.add(new SlideModel(url1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(url2,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(url3,ScaleTypes.CENTER_CROP));


        sliderView.setImageList(imageList, ScaleTypes.CENTER_CROP);

        sliderView.setSlideAnimation(AnimationTypes.ZOOM_OUT);

        recyclerView1=findViewById(R.id.recycle_one_main);
        recyclerView2=findViewById(R.id.recycle_two_main);
        recyclerView3=findViewById(R.id.recycle_three_main);

        viewall1=findViewById(R.id.viewall_one_main);
        viewall2=findViewById(R.id.viewall_two_main);
        viewall3=findViewById(R.id.viewall_three_main);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager);


        LinearLayoutManager layoutManager1=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager1);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(layoutManager2);



        List<Trending> trending=new ArrayList<>();
        trending.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        trending.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        trending.add(new Trending("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));

        TrendingAdapterone trendingAdapterone=new TrendingAdapterone(this,trending);
        recyclerView1.setAdapter(trendingAdapterone);


        List<Popular>populars=new ArrayList<>();
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.property_two,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.property_three,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.property_two,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.property_three,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));


        PopularAdaptertwo popularAdaptertwo=new PopularAdaptertwo(this, populars);
        recyclerView2.setAdapter(popularAdaptertwo);


        List<Recomended> recomendeds=new ArrayList<>();
        recomendeds.add(new Recomended("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        recomendeds.add(new Recomended("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));
        recomendeds.add(new Recomended("New Pine \nResidency Appartme..",R.drawable.flat_img,"Possesion from Jun 2024","2BHK, Bopal, Ahmedabad","88.69 Lac - 2.28 Crore"));


        RecomendedAdapterthree recomendedAdapterthree=new RecomendedAdapterthree(this,recomendeds);
        recyclerView3.setAdapter(recomendedAdapterthree);


        viewall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Trending_Page.class);
                startActivity(intent);
            }
        });
        viewall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Trending_Page.class);
                startActivity(intent);
            }
        });
        viewall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Trending_Page.class);
                startActivity(intent);
            }
        });

    }
}
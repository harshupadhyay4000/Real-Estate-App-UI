package com.example.credai.Pages.Reviews;

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

import com.example.credai.Pages.DetailsActivity;
import com.example.credai.Pages.Reviews.RevAdapters.AreaDescriptionAdapter;
import com.example.credai.Pages.Reviews.RevAdapters.AreaimageAdapter;
import com.example.credai.Pages.Reviews.RevAdapters.List.ImageArea;
import com.example.credai.Pages.Reviews.RevAdapters.List.More_desc;
import com.example.credai.Pages.Reviews.RevAdapters.List.PriceRange;
import com.example.credai.Pages.Reviews.RevAdapters.PriceRangeAreaAdapter;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class AreaActivity extends AppCompatActivity {
    RecyclerView recyclerView, recyclerView2, recyclerView3;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_area);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back=findViewById(R.id.back_btn_aboutarea);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AreaActivity.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerView=findViewById(R.id.recycle_area_act);
        recyclerView2=findViewById(R.id.recycle_avg_propertyprices);
        recyclerView3=findViewById(R.id.recycle_whatsgreat);


        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);

        LinearLayoutManager layoutManager3=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(layoutManager3);


        List<ImageArea> imageAreas=new ArrayList<>();
        imageAreas.add(new ImageArea(R.drawable.gota_imgone));
        imageAreas.add(new ImageArea(R.drawable.gota_imgtwo));
        imageAreas.add(new ImageArea(R.drawable.gota_imgthree));

        AreaimageAdapter areaimageAdapter=new AreaimageAdapter(this, imageAreas);
        recyclerView.setAdapter(areaimageAdapter);

        List<PriceRange>priceRangeList=new ArrayList<>();
        priceRangeList.add(new PriceRange("Avg. Property Rates","7,200/- sq.ft."));
        priceRangeList.add(new PriceRange("4 BHK","2.45 Cr - 4.4 Cr"));
        priceRangeList.add(new PriceRange("Farmhouses","4 Cr - 5.5 Cr"));
        priceRangeList.add(new PriceRange("Duplexes","7,200/- sq.ft."));

        PriceRangeAreaAdapter priceRangeAreaAdapter=new PriceRangeAreaAdapter(this,priceRangeList);
        recyclerView2.setAdapter(priceRangeAreaAdapter);

        List<More_desc>moreDescs=new ArrayList<>();

        moreDescs.add(new More_desc(R.drawable.icon_one_area,"What's great","Mid Segment Budget","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Commercial Hub ","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Ready to Move Projects","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo "));
        moreDescs.add(new More_desc(R.drawable.icon_two_area,"What needs to be done!","Potholes","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Slum area ","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Textile Manufacturing","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo "));
        moreDescs.add(new More_desc(R.drawable.icon_one_area,"What's great","Mid Segment Budget","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Commercial Hub ","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Ready to Move Projects","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo "));
        moreDescs.add(new More_desc(R.drawable.icon_two_area,"What needs to be done!","Potholes","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Slum area ","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo ","Textile Manufacturing","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et \ndolore magna aliqua. Utenimcididunt ut labo "));

        AreaDescriptionAdapter areaDescriptionAdapter=new AreaDescriptionAdapter(this,moreDescs);
        recyclerView3.setAdapter(areaDescriptionAdapter);



    }
}
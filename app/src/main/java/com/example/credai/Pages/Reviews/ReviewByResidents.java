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
import com.example.credai.Pages.Reviews.RevAdapters.List.Reviews;
import com.example.credai.Pages.Reviews.RevAdapters.ResidentsAdapter;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class ReviewByResidents extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_review_by_residents);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back=findViewById(R.id.back_btn_residents_review);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ReviewByResidents.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerView=findViewById(R.id.recycle_review_residents_act);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        List<Reviews>reviews=new ArrayList<>();
        reviews.add(new Reviews("Mr. Khalas Makhija","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua.","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua."));
        reviews.add(new Reviews("Mr. Khalas Makhija","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua.","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua."));
        reviews.add(new Reviews("Mr. Khalas Makhija","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua.","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua."));
        reviews.add(new Reviews("Mr. Khalas Makhija","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua.","Lorem ipsum dolor sit amet, consectetur adipiscing \nelit, sed do eiusmod tempor incididunt ut labore et  \ndolore magna aliqua."));

        ResidentsAdapter residentsAdapter=new ResidentsAdapter(this,reviews);
        recyclerView.setAdapter(residentsAdapter);

    }
}
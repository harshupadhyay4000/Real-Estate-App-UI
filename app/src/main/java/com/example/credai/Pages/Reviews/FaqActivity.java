package com.example.credai.Pages.Reviews;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
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
import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Faqs;
import com.example.credai.Pages.Reviews.RevAdapters.FaqactAdapter;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class FaqActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageButton back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back=findViewById(R.id.backbtn_faq_act);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FaqActivity.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerView=findViewById(R.id.recycle_faq_activity);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Faqs> faqs=new ArrayList<>();
        faqs.add(new Faqs("Pankaj Shah","Posted 6 months ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));
        faqs.add(new Faqs("Shrishti Mandhera","Posted 2 Years ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));
        faqs.add(new Faqs("Pankaj Shah","Posted 6 months ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));
        faqs.add(new Faqs("Shrishti Mandhera","Posted 2 Years ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));

        FaqactAdapter faqactAdapter=new FaqactAdapter(this,faqs);
        recyclerView.setAdapter(faqactAdapter);


    }
}
package com.example.credai.Pages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.credai.Pages.Fragments.Description_Fragment;
import com.example.credai.Pages.Fragments.Gallery_Fragment;
import com.example.credai.Pages.Fragments.Review_Fragment;
import com.example.credai.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DetailsActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    ImageButton backbtn, floorplan;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        floorplan=findViewById(R.id.floor_plan_btn);
        floorplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailsActivity.this, FloorPlanActivity.class);
                startActivity(intent);
            }
        });
        tabLayout=findViewById(R.id.tabLayoutdetails);
        viewPager=findViewById(R.id.viewPagerdetails);
        backbtn=findViewById(R.id.back_btn_new);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailsActivity.this, Trending_Page.class);
                startActivity(intent);
                finish();
            }
        });
        FragmentStateAdapter pagerAdapter = new FragmentStateAdapter(this) {
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0:
                        return new Description_Fragment();
                    case 1:
                        return new Gallery_Fragment();
                    case 2:
                        return new Review_Fragment();
                    default:
                        return null;
                }
            }

            @Override
            public int getItemCount() {
                return 3; // Number of fragments
            }
        };

        // Set the adapter
        viewPager.setAdapter(pagerAdapter);

        // Link the TabLayout with the ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Description");
                    break;
                case 1:
                    tab.setText("Gallery");
                    break;
                case 2:
                    tab.setText("Review");
                    break;
            }
        }).attach();
    }
}



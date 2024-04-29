package com.example.credai.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.credai.Pages.Fragments.Bedroom;
import com.example.credai.Pages.Fragments.Description_Fragment;
import com.example.credai.Pages.Fragments.Gallery_Fragment;
import com.example.credai.Pages.Fragments.Hall;
import com.example.credai.Pages.Fragments.Review_Fragment;
import com.example.credai.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class GalleryActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        back=findViewById(R.id.back_act_gallery);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GalleryActivity.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        tabLayout=findViewById(R.id.tabLayoutdetails_actgallery);
        viewPager=findViewById(R.id.viewPagerdetails_actgallery);

        FragmentStateAdapter pagerAdapter= new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0:
                        return new Hall();
                    case 1:
                        return new Bedroom();
                    case 2:
                        return new Hall();
                    case 3:
                        return new Bedroom();
                    case 4:
                        return new Hall();
                    default:
                        return null;
                }
            }

            @Override
            public int getItemCount() {
                return 5;
            }
        };

        viewPager.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Hall");
                    break;
                case 1:
                    tab.setText("Bedroom");
                    break;
                case 2:
                    tab.setText("Kitchen");
                    break;
                case 3:
                    tab.setText("Bathroom");
                    break;
                case 4:
                    tab.setText("Balcony");
                    break;

            }
        }).attach();

    }
}
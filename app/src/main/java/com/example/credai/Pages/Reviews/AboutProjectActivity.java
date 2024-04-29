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
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.credai.Pages.DetailsActivity;
import com.example.credai.Pages.Fragments.AboutProject;
import com.example.credai.Pages.Fragments.Description_Fragment;
import com.example.credai.Pages.Fragments.Gallery_Fragment;
import com.example.credai.Pages.Fragments.Review_Fragment;
import com.example.credai.Pages.Fragments.Specifications;
import com.example.credai.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AboutProjectActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_project);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back=findViewById(R.id.back_btn_abtproject_act);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AboutProjectActivity.this, DetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        tabLayout=findViewById(R.id.tabLayoutaboutproperty_details);
        viewPager=findViewById(R.id.viewPagerabtproperty_details);

        FragmentStateAdapter pagerAdapter = new FragmentStateAdapter(this) {
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0:
                        return new AboutProject();
                    case 1:
                        return new AboutProject();
                    default:
                        return null;
                }
            }

            @Override
            public int getItemCount() {
                return 2; // Number of fragments
            }
        };
        viewPager.setAdapter(pagerAdapter);

        // Link the TabLayout with the ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("About Project");
                    break;
                case 1:
                    tab.setText("Specifications");
                    break;
            }
        }).attach();
    }
}
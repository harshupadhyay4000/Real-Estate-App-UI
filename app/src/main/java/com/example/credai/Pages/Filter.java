package com.example.credai.Pages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.credai.R;
import com.google.android.material.slider.RangeSlider;

public class Filter extends AppCompatActivity {
    ImageButton back;
    RangeSlider seekBar;
    TextView startText, endText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        seekBar = findViewById(R.id.seekbar_filter);
        startText = findViewById(R.id.start_text_budge_filter);
        endText = findViewById(R.id.end_text_amt_filter);

        seekBar.addOnSliderTouchListener(new RangeSlider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull RangeSlider slider) {
                // Not needed
            }

            @Override
            public void onStopTrackingTouch(@NonNull RangeSlider slider) {
                // Not needed
            }
        });

        seekBar.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                int startPrice = slider.getValues().get(0).intValue();
                int endPrice = slider.getValues().get(1).intValue();
                startText.setText(String.format("%d", startPrice));
                endText.setText(String.format("%d crore", endPrice));
            }
        });

        back=findViewById(R.id.backbtn_filter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Filter.this, Trending_Page.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
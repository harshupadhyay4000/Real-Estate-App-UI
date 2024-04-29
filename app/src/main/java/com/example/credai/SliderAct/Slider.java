package com.example.credai.SliderAct;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;

public class Slider extends AppCompatActivity {

    String url11 = "https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png";
    String url22 = "https://qphs.fs.quoracdn.net/main-qimg-8e203d34a6a56345f86f1a92570557ba.webp";
    String url33 = "https://bizzbucket.co/wp-content/uploads/2020/08/Life-in-The-Metro-Blog-Title-22.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slider);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // initializing the slider view.


        ImageSlider sliderView = findViewById(R.id.slider_new);



        List<SlideModel> imageList = new ArrayList<>(); // Create image list

        imageList.add(new SlideModel(url11,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(url22,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(url33,ScaleTypes.CENTER_CROP));


        sliderView.setImageList(imageList, ScaleTypes.CENTER_CROP);

        sliderView.setSlideAnimation(AnimationTypes.ZOOM_OUT);



    }
}
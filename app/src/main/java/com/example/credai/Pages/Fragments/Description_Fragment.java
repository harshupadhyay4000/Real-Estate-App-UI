package com.example.credai.Pages.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.credai.Adapters.Lists.Popular;
import com.example.credai.Adapters.Lists.Recomended;
import com.example.credai.Pages.ContactBuilderActivity;
import com.example.credai.Pages.Fragments.FragmentAdapters.FaqsAdapter;
import com.example.credai.Pages.Fragments.FragmentAdapters.HomeLoanAdapter;
import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Faqs;
import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Gallery;
import com.example.credai.Pages.Fragments.FragmentAdapters.Lists.Images;
import com.example.credai.Pages.Fragments.FragmentAdapters.NearbyAdapter;
import com.example.credai.Pages.Fragments.FragmentAdapters.NearbyProjectsAdapter;
import com.example.credai.Pages.Fragments.FragmentAdapters.SimilarProjectsAdapter;
import com.example.credai.Pages.Reviews.AboutProjectActivity;
import com.example.credai.Pages.Reviews.AboutTheBuilderActivity;
import com.example.credai.Pages.Reviews.Ammenities;
import com.example.credai.Pages.Reviews.AreaActivity;
import com.example.credai.Pages.Reviews.FaqActivity;
import com.example.credai.Pages.Trending_Page;
import com.example.credai.R;

import java.util.ArrayList;
import java.util.List;


public class Description_Fragment extends Fragment {

    RecyclerView recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description_, container, false);
        // Show bottom sheet when the ImageButton is clicked
        ImageButton viewnearbyplace = view.findViewById(R.id.view_all_nearbybtn_descrip_frag_new);
        viewnearbyplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBottomSheetFragment bottomSheetFragment = new MyBottomSheetFragment();
                bottomSheetFragment.show(getParentFragmentManager(), bottomSheetFragment.getTag());
            }
        });

        ImageButton viewallfaq = view.findViewById(R.id.viewall_for_faqs);
        viewallfaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), FaqActivity.class);
                startActivity(intent);
            }
        });

        ImageButton similarprojects = view.findViewById(R.id.viewall_for_similar_projects_descfrag);
        similarprojects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Trending_Page.class);
                startActivity(intent);
            }
        });
        ImageButton viewnearbyprojects = view.findViewById(R.id.viewall_nearby_projects_desc);
        viewnearbyprojects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Trending_Page.class);
                startActivity(intent);
            }
        });



        ImageButton contactbuilder= view.findViewById(R.id.contact_builder_btn);

        contactbuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContactBuilderActivity.class);
                startActivity(intent);
            }
        });

        ImageView viewamenities = view.findViewById(R.id.view_all_ammenities_description);
        viewamenities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Ammenities.class);
                startActivity(intent);
            }
        });

        ImageButton areaaddressbtn = view.findViewById(R.id.address_btn_fragment);
        areaaddressbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), AreaActivity.class);
                startActivity(intent);
            }
        });

        ImageView aboutproject = view.findViewById(R.id.view_more_abtproject_desc);
        aboutproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), AboutProjectActivity.class);
                startActivity(intent);
            }
        });

        ImageView aboutbuilder = view.findViewById(R.id.view_more_abtbuilder_descfragment);
        aboutbuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), AboutTheBuilderActivity.class);
                startActivity(intent);
            }
        });
        recyclerView=view.findViewById(R.id.recycle_nearby_places);
        recyclerView2=view.findViewById(R.id.nearby_projects_rec_descfrag);
        recyclerView3=view.findViewById(R.id.recycle_similarprojects_desc_frag);
        recyclerView4=view.findViewById(R.id.recycle_for_faqs_description);
        recyclerView5=view.findViewById(R.id.recycle_homeloan_description);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);

        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(layoutManager3);

        LinearLayoutManager layoutManager4 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(layoutManager4);

        LinearLayoutManager layoutManager5 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(layoutManager5);

        List<Gallery>galleries=new ArrayList<>();
        galleries.add(new Gallery(R.drawable.hariyali_gardern));
        galleries.add(new Gallery(R.drawable.city_hospital));
        galleries.add(new Gallery(R.drawable.jkls_school));
        galleries.add(new Gallery(R.drawable.five_star));
        galleries.add(new Gallery(R.drawable.hp_petrol));
        galleries.add(new Gallery(R.drawable.temple));
        galleries.add(new Gallery(R.drawable.atm_nearby));
        galleries.add(new Gallery(R.drawable.ahm_airport));

        NearbyAdapter nearbyAdapter=new NearbyAdapter(getContext(), galleries);
        recyclerView.setAdapter(nearbyAdapter);

        List<Popular>populars=new ArrayList<>();
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        populars.add(new Popular("New Pine Residency Apart..",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));

        NearbyProjectsAdapter nearbyProjectsAdapter=new NearbyProjectsAdapter(getContext(),populars);
        recyclerView2.setAdapter(nearbyProjectsAdapter);

        List<Recomended> recomendeds=new ArrayList<>();
        recomendeds.add(new Recomended("Himalaya heights Society",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        recomendeds.add(new Recomended("Himalaya heights Society",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        recomendeds.add(new Recomended("Himalaya heights Society",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));
        recomendeds.add(new Recomended("Himalaya heights Society",R.drawable.new_pine_proj,"Possession from June 2024","2, 3, 4 BHK Appartments, Rheha Studios in Gift City, Gandhinagar, Ahmedabad","88.69 Lac - 2.28 Crore"));

        SimilarProjectsAdapter similarProjectsAdapter=new SimilarProjectsAdapter(getContext(),recomendeds);
        recyclerView3.setAdapter(similarProjectsAdapter);

        List<Faqs>faqs=new ArrayList<>();
        faqs.add(new Faqs("Pankaj Shah","Posted 6 months ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));
        faqs.add(new Faqs("Shrishti Mandhera","Posted 2 Years ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));
        faqs.add(new Faqs("Pankaj Shah","Posted 6 months ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));
        faqs.add(new Faqs("Shrishti Mandhera","Posted 2 Years ago","The FAQs posted appears here so that it is visible \nto all the users with similar common questions at \ntheir earliest..."));

        FaqsAdapter faqsAdapter=new FaqsAdapter(getContext(),faqs);
        recyclerView4.setAdapter(faqsAdapter);


        List<Images>images=new ArrayList<>();
        images.add(new Images(R.drawable.sbi_bank));
        images.add(new Images(R.drawable.axis_bank));
        images.add(new Images(R.drawable.hdfc));
        images.add(new Images(R.drawable.yes_bank));
        images.add(new Images(R.drawable.bob));
        images.add(new Images(R.drawable.iifl));

        HomeLoanAdapter homeLoanAdapter=new HomeLoanAdapter(getContext(),images);
        recyclerView5.setAdapter(homeLoanAdapter);



        return view;
    }

}
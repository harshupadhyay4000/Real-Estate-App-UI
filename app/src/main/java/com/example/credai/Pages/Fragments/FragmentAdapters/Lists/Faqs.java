package com.example.credai.Pages.Fragments.FragmentAdapters.Lists;

public class Faqs {

    private String name;
    private String date;
    private String review;

    public Faqs(String name, String date, String review) {
        this.name = name;
        this.date = date;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getReview() {
        return review;
    }
}

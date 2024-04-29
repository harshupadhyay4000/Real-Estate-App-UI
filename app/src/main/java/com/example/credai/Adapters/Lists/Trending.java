package com.example.credai.Adapters.Lists;

public class Trending {
    private String name;
    private int imageResource;
    private String date;
    private String location;

    private String price;


    public Trending(String name, int imageResource, String date, String location, String price) {
        this.name = name;
        this.imageResource = imageResource;
        this.date = date;
        this.location = location;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }
}

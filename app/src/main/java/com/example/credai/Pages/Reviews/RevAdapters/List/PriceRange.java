package com.example.credai.Pages.Reviews.RevAdapters.List;

public class PriceRange {

    private String type;
    private String price;

    public PriceRange(String type, String price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }
}

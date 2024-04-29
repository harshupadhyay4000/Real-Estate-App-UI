package com.example.credai.Pages.Reviews.RevAdapters.List;

public class Reviews {
    private String name;
    private String paraone;
    private String paratwo;

    public Reviews(String name, String paraone, String paratwo) {
        this.name = name;
        this.paraone = paraone;
        this.paratwo = paratwo;
    }

    public String getName() {
        return name;
    }

    public String getParaone() {
        return paraone;
    }

    public String getParatwo() {
        return paratwo;
    }
}

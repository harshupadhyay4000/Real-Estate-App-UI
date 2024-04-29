package com.example.credai.Pages.Reviews.RevAdapters.List;

public class More_desc {
    private int imageResourece;
    private String mainheadings;
    private String headingone;
    private String onedescription;

    private String headingtwo;
    private String twodescription;

    private String headingthree;
    private String threedescription;
    public More_desc(int imageResourece, String mainheadings, String headingone, String onedescription, String headingtwo, String twodescription, String headingthree, String threedescription) {
        this.imageResourece = imageResourece;
        this.mainheadings = mainheadings;
        this.headingone = headingone;
        this.onedescription = onedescription;
        this.headingtwo = headingtwo;
        this.twodescription = twodescription;
        this.headingthree = headingthree;
        this.threedescription = threedescription;
    }


    public int getImageResourece() {
        return imageResourece;
    }

    public String getMainheadings() {
        return mainheadings;
    }

    public String getHeadingone() {
        return headingone;
    }

    public String getOnedescription() {
        return onedescription;
    }

    public String getHeadingtwo() {
        return headingtwo;
    }

    public String getTwodescription() {
        return twodescription;
    }

    public String getHeadingthree() {
        return headingthree;
    }

    public String getThreedescription() {
        return threedescription;
    }
}

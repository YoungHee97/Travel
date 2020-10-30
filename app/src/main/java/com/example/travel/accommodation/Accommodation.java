package com.example.travel.accommodation;

public class Accommodation {
    int a_picture;
    String name2, explantation2;

    public Accommodation(int a_picture, String name2, String explantation2){
        this.a_picture = a_picture;
        this.name2 = name2;
        this.explantation2 = explantation2;
    }

    public int getA_picture() {
        return a_picture;
    }

    public void setA_picture(int a_picture) {
        this.a_picture = a_picture;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getExplantation2() {
        return explantation2;
    }

    public void setExplantation2(String explantation2) {
        this.explantation2 = explantation2;
    }
}

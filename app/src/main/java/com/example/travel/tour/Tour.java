package com.example.travel.tour;

public class Tour {
    int tno;
    String name, country,  explanation;

    public Tour(String name, String country, String explanation) {
        this.tno = tno;
        this.name = name;
        this.country = country;
        this.explanation = explanation;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

}

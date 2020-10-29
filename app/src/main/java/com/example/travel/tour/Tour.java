package com.example.travel.tour;

public class Tour {
    int tour_picture, tno;
    String name, country,  explanation, link;

    public Tour(int tour_picture, String name, String country, String link, String explanation, int tno) {
        this.tour_picture = tour_picture;
        this.name = name;
        this.country = country;
        this.link = link;
        this.explanation = explanation;
        this.tno = tno;
    }

    public int getTour_picture() {
        return tour_picture;
    }

    public void setTour_picture(int tour_picture) {
        this.tour_picture = tour_picture;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }
}

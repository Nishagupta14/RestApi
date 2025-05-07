package com.example.RestaurantService.dto;

import java.io.Serializable;
import java.util.List;

public class Restaurant implements Serializable {
    private  int id;
    private String name;

    private String location;
    private Menu menu;
    private String Review;
    Restaurant(){}
    public Restaurant(int id, String name, String location, Menu menu) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.review = review;
        this.menu = this.menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    private String review;




    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", menu=" + menu +
                ", review='" + review + '\'' +
                '}';
    }

}

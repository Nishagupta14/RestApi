package com.example.RestaurantService.dto;

public class CategoryItems {
    String name;
    int price;

    CategoryItems(){}


    public CategoryItems(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CategoryItems{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}

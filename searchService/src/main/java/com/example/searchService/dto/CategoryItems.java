package com.example.searchService.dto;

public class CategoryItems {
    String name;
    int price;



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

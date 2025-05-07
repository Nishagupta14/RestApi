package com.example.RestaurantService.dto;

public class MenuCategory {
    String name;
    CategoryItems items;


    MenuCategory(){}


    public CategoryItems getItems() {
        return items;
    }

    public void setItems(CategoryItems items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuCategory(CategoryItems items, String name) {
        this.items = items;
        this.name=name;
    }
    @Override
    public String toString() {
        return "MenuCategory{" +
                "name=" + name +
                ", items='" + items + '\'' +
                '}';
    }


}

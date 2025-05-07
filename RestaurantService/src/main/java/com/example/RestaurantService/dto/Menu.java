package com.example.RestaurantService.dto;

public class Menu {
    MenuCategory category;
    Menu(){}

    public MenuCategory getCategory() {
        return category;
    }

    public void setCategory(MenuCategory category) {
        this.category = category;
    }



    public Menu(MenuCategory category) {
        this.category = category;
    }



    @Override
    public String toString() {
        return "Menu{" +
                "category=" + category +
                '}';
    }
}

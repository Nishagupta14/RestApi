package com.example.searchService.util;

import com.example.searchService.dto.CategoryItems;
import com.example.searchService.dto.Menu;
import com.example.searchService.dto.MenuCategory;
import com.example.searchService.dto.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Utility {
    public static List<Restaurant> createRest(){
        List<Restaurant> list=new ArrayList<>();
        CategoryItems categoryItems =new CategoryItems("Paneer Momo",70);
        MenuCategory menuCategory=new MenuCategory(categoryItems,"Nisha");
        Menu menu=new Menu(menuCategory);
        Restaurant restaurant=new Restaurant(1,"WOW MOMOS","DELHI",menu);
        list.add(restaurant);
        return list;

    }
}

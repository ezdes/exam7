package com.example.demo.Model;

import lombok.Data;

@Data
public class Restaurant implements AbstractSomething {
    private String name;
    private String address;
    private String site;
    private String dish;

    private static Restaurant restaurant;

    private Restaurant(){
        dish = "dish";
        name = "navat";
        address = "navat";
        site = "navat.com";
    }

    public static Restaurant getInstance(){
        if(restaurant == null){
            restaurant = new Restaurant();
        }
        return restaurant;
    }
}

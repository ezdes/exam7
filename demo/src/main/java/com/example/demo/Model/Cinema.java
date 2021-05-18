package com.example.demo.Model;

import lombok.Data;

@Data
public class Cinema implements AbstractSomething {

    private String name;
    private String address;
    private String site;
    private Integer capacity;

    private static Cinema cinema;

    private Cinema(){
        capacity = 500;
        name = "cinema";
        site = "cinema.com";
        address = "cinema";
    }

    public static Cinema getInstance(){
        if(cinema == null){
            cinema = new Cinema();
        }
        return cinema;
    }
}

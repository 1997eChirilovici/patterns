package com.example.patterns.behavioralPatterns.Strategy;

import lombok.Getter;

@Getter
public class Item {

    private String upcCode;
    private int price;

    public Item(String upc, int cost) {
        this.upcCode = upc;
        this.price = cost;
    }

}

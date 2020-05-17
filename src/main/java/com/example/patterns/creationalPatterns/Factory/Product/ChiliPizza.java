package com.example.patterns.creationalPatterns.Factory.Product;

public class ChiliPizza implements Pizza {

    @Override
    public void bakePizza() {
        System.out.println("Baking hot chili pizza");
    }
}

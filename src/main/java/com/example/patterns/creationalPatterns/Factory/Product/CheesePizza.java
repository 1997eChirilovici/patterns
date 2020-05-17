package com.example.patterns.creationalPatterns.Factory.Product;

public class CheesePizza implements Pizza {

    @Override
    public void bakePizza() {
        System.out.println("Baking Cheese Pizza");
    }
}

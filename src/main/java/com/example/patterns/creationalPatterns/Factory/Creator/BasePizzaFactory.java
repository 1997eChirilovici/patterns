package com.example.patterns.creationalPatterns.Factory.Creator;

import com.example.patterns.creationalPatterns.Factory.Product.Pizza;

public interface BasePizzaFactory {
    public Pizza createPizza(String type);
}

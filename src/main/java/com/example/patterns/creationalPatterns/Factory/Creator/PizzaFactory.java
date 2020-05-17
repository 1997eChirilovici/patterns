package com.example.patterns.creationalPatterns.Factory.Creator;

import com.example.patterns.creationalPatterns.Factory.Product.CheesePizza;
import com.example.patterns.creationalPatterns.Factory.Product.ChiliPizza;
import com.example.patterns.creationalPatterns.Factory.Product.Pizza;

public class PizzaFactory implements BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                pizza.bakePizza();
                return pizza;
            case "chili":
                pizza = new ChiliPizza();
                pizza.bakePizza();
                return pizza;
            default:
                throw new IllegalArgumentException("no such pizza");
        }
    }
}

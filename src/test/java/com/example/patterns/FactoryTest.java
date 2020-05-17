package com.example.patterns;

import com.example.patterns.creationalPatterns.Factory.Creator.BaseCakeFactory;
import com.example.patterns.creationalPatterns.Factory.Creator.BasePizzaFactory;
import com.example.patterns.creationalPatterns.Factory.Creator.CakeFactory;
import com.example.patterns.creationalPatterns.Factory.Creator.PizzaFactory;
import com.example.patterns.creationalPatterns.Factory.Product.Cake;
import com.example.patterns.creationalPatterns.Factory.Product.Pizza;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void makeMeals(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza chiliePizza = pizzaFactory.createPizza("chili");

        BaseCakeFactory cakeFactory = new CakeFactory();
        Cake appleCake = cakeFactory.createCake("apple");
        Cake cherryCake = cakeFactory.createCake("cherry");
    }

}

package com.example.patterns;

import com.example.patterns.behavioralPatterns.Strategy.CreditCardStrategy;
import com.example.patterns.behavioralPatterns.Strategy.Item;
import com.example.patterns.behavioralPatterns.Strategy.PaypalStrategy;
import com.example.patterns.behavioralPatterns.Strategy.ShoppingCart;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    public void pay() {

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678",40);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("mail@randommail.com", "password"));
// or
        cart.pay(new CreditCardStrategy("Will Smith", "1234567890123456", "786", "12/22"));
    }
}

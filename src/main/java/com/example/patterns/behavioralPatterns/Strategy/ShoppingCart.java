package com.example.patterns.behavioralPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(items.stream()
                               .mapToInt(Item::getPrice)
                               .sum());
    }

}

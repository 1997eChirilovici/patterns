package com.example.patterns.creationalPatterns.Factory.Product;

public class AppleCake implements Cake{
    @Override
    public void bakeCake() {
        System.out.println("Baking apple cake");
    }
}

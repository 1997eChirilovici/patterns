package com.example.patterns.creationalPatterns.Factory.Creator;

import com.example.patterns.creationalPatterns.Factory.Product.AppleCake;
import com.example.patterns.creationalPatterns.Factory.Product.Cake;
import com.example.patterns.creationalPatterns.Factory.Product.CherryCake;

public class CakeFactory implements BaseCakeFactory {
    @Override
    public Cake createCake(String type) {
        Cake cake;
        switch (type) {
            case "apple" :
                cake = new AppleCake();
                break;
            case "cherry":
                cake = new CherryCake();
                break;
            default:
                throw new IllegalArgumentException("no such cake");
        }
        cake.bakeCake();
        return cake;
    }
}

package com.example.patterns.creationalPatterns.Factory.Creator;

import com.example.patterns.creationalPatterns.Factory.Product.Cake;

public interface BaseCakeFactory {
    public Cake createCake(String type);
}

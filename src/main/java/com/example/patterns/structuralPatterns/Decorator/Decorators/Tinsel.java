package com.example.patterns.structuralPatterns.Decorator.Decorators;

import com.example.patterns.structuralPatterns.Decorator.ChristmasTree;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsel();
    }

    private String decorateWithTinsel() {
        return " with Tinsel";
    }
}

package com.example.patterns;

import com.example.patterns.structuralPatterns.Decorator.ChristmasTree;
import com.example.patterns.structuralPatterns.Decorator.ChristmasTreeImpl;
import com.example.patterns.structuralPatterns.Decorator.Decorators.BubbleLights;
import com.example.patterns.structuralPatterns.Decorator.Decorators.Tinsel;
import com.example.patterns.structuralPatterns.Decorator.Decorators.TreeTopper;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    public void decorateTree() {
        ChristmasTree tree2 = new TreeTopper(new BubbleLights(new Tinsel(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());
    }
}

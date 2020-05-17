package com.example.patterns;

import com.example.patterns.creationalPatterns.Singleton.Singleton;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void oneInstance() {
        Singleton singleton = Singleton.getInstance("Compu");
        Singleton singleton1 = Singleton.getInstance("Dava");
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}

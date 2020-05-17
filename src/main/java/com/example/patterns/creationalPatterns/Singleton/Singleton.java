package com.example.patterns.creationalPatterns.Singleton;

import lombok.Getter;

public class Singleton {
    private volatile static Singleton instance;

    @Getter
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}

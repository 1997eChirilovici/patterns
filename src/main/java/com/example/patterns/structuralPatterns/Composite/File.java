package com.example.patterns.structuralPatterns.Composite;

public class File implements AbstractType {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("-wxr-xr-x\t" + CompositeDemo.compositeBuilder + name);
    }

}

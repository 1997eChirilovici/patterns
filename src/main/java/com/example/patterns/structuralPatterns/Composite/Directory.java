package com.example.patterns.structuralPatterns.Composite;

import java.util.ArrayList;

public class Directory implements AbstractType {
    private String name;
    private ArrayList<AbstractType> includedFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractType type) {
        includedFiles.add(type);
    }

    public void ls() {
        System.out.println("dwxr-xr-x\t" + CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("\t");
        for (AbstractType includedFile : includedFiles) {
            includedFile.ls();
        }
    }
}

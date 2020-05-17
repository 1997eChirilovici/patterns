package com.example.patterns.behavioralPatterns.Command;

public class OpenTextFileOperation implements TextFileOperation {
    private TextFile file;

    public OpenTextFileOperation(TextFile file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return file.open();
    }
}

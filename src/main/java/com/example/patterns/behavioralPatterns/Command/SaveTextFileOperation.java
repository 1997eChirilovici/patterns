package com.example.patterns.behavioralPatterns.Command;

public class SaveTextFileOperation implements TextFileOperation {
    private TextFile file;

    public SaveTextFileOperation(TextFile file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return file.save();
    }
}

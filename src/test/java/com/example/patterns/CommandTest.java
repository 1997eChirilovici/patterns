package com.example.patterns;

import com.example.patterns.behavioralPatterns.Command.OpenTextFileOperation;
import com.example.patterns.behavioralPatterns.Command.SaveTextFileOperation;
import com.example.patterns.behavioralPatterns.Command.TextFile;
import com.example.patterns.behavioralPatterns.Command.TextFileOperationExecutor;
import org.junit.jupiter.api.Test;

public class CommandTest {
    @Test
    public void readFile() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
    }
}

package com.example.patterns;

import com.example.patterns.creationalPatterns.Builder.Computer;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void makeComputer() {
        Computer myPC = new Computer.ComputerBuilder()
                                    .setRAM("16GB")
                                    .setSDD("256GB")
                                    .setHDD("1TB")
                                    .setGraphicCard("RTX 2080TI")
                                    .build();

        System.out.println(myPC);
    }
}
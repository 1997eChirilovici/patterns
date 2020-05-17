package com.example.patterns;

import com.example.patterns.structuralPatterns.Composite.Directory;
import com.example.patterns.structuralPatterns.Composite.File;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void justDoIt() {
        Directory music = new Directory("MUSIC");
        Directory scorpions = new Directory("SCORPIONS");
        Directory dio = new Directory("DIO");

        File track1 = new File("Don't wary, be happy.mp3");
        File track2 = new File("track2.mp3");
        File track3 = new File("Wind of change.mp3");
        File track4 = new File("Big city night.mp3");
        File track5 = new File("Rainbow in the dark.mp3");

        music.add(track1);
        music.add(track2);
        music.add(scorpions);
        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);
        dio.add(track5);
        music.ls();
    }

}

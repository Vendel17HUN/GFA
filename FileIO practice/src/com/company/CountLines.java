package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Írj egy függvényt, ami fogad egy fájlnevet stringként,
        // majd visszadja a fájlban található sorok számát.
        // Ha nem tudja megnyitni a fájlt adjon vissza nullát és
        // ne jelezzen semmilyen hibát.

        System.out.println(countLines("lorem_ipsum.txt"));
    }

    public static int countLines(String fileName) {
        Path path = Paths.get(fileName);
        List<String> filesContent;
        try {
            filesContent = Files.readAllLines(path);
        } catch (IOException exception) {
            return 0;
        }

        return filesContent.size();
    }

}
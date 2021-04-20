package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        try { // A Files.readAllLines(filePath) metódus miatt szükséges;
            // Az `assets` mappában levő `lorem-ipsum.txt`-ből a tartalmat
            // String listába olvassa be
            Path filePath = Paths.get("lorem_ipsum.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0)); // Kiprinteli a szövegfájl első sorát
        } catch (Exception e) {
            System.out.println("Hoppá... fájlt nem sikerült beolvasni!");
        }
    }
}

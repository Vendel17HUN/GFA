package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("First line of my file");
        try { // A Files.write(filePath, content) metódus miatt szükséges;
            // Csinál egy új fájlt, ha nincs, ha van, akkor a tartalmát felülírja
            // A `content` elemei lesznek a text fájl sorai
            Path filePath = Paths.get("new-file.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}
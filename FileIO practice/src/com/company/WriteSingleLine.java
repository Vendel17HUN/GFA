package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Hozz létre egy függvényt, ami képes fájlokat mainpulálni:
        // a fájlba beleírja a nevedet, egy sorba.
        // A fájlnak a neve "my-file.txt" legyen.
        // Ha a program nem tudja megnyitni a fájlt,
        // akkor a következő üzenetet kell kiírnia: "Unable to write file: my-file.txt"

        Path path = Paths.get("my-file.txt");
        appendMyName("Vendel Jaromi", path);
    }

    static void appendMyName(String name, Path path) {
        try {
            Files.write(path, Arrays.asList(name), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write file: " + path.getFileName());
        }
    }
}
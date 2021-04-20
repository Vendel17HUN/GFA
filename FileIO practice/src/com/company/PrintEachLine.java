package com.company;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Írj egy programot, ami megnyitja a "my-file.txt"-t,
        // aztán kiprinteli minden egyes sorát.
        // Ha a program nem tudja megnyitni a fájlt (mert nem létezik),
        // akkor a következő üzenetet printelje ki: "Unable to read file: my-file.txt"

        Path filePath = Paths.get("lorem_ipsum.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("Unable to read file: " + filePath.getFileName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

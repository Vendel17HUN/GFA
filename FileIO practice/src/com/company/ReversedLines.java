package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Hozz létre egy metódust, ami visszafejti a reversed-lines.txt-t
        reverse("reversed-lines.txt");
    }

    public static void reverse(String file) {
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            String linesReversed = "";
            for (String s : lines) {
                for (int i = 0; i < s.length(); i++) {
                    linesReversed += s.charAt(s.length() - i - 1);
                }
                linesReversed += "\n";
            }
            System.out.println(linesReversed);
        } catch (Exception e) {
            System.out.println("We got a problem.");
        }
    }
}
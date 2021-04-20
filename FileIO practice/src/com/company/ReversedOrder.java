package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Hozz létre egy metódust, ami visszafejti a reverse-ordet.txt-t

        reversedOrder("reversed-order.txt");
    }

    public static void reversedOrder(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            List<String> linesRev = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                linesRev.add(i, lines.get(lines.size() - i - 1));
            }
            System.out.println(linesRev);
            Path filePathTo = Paths.get("reversed-order-to.txt");
            Files.write(filePathTo, linesRev);
        } catch (Exception e) {
            System.out.println("Valami hiba van!");
        }
    }
}
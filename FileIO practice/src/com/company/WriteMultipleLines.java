package com.company;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Készíts egy függvényt, ami 3 paramétert vár: egy elérési utat, egy szót
        // és egy számot. Tudjon írni fájlba.
        // Az elérési út legyen egy string, ami leírja az írandó fájl helyét.
        // A szó szintén legyen string és kerüljön be a fájlba egyenként külön sorba.
        // A szám paraméter jelöli, hogy hány sora legyen a fájnak.
        // Ha a szó 'alma' és a szám 5, akkor 5 sort írjon a fájlba
        // és minden sorban az legyen írva: 'alma'.
        // Ha a függvény nem tud írni a fájlba, ne dobjon semmilyen hibaüzenetet.

        writeMultipleLines("multi-write.txt", "alma", 5);
    }

    public static void writeMultipleLines(String path, String word, int number) {
        try {
            Path filePath = Paths.get(path);
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                list.add(i, word);
            }
            Files.write(filePath, list);
        } catch (AccessDeniedException e) {
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

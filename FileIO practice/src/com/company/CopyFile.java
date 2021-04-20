package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    // Írj egy függvényt, ami átmásolja egy fájl tartalmát egy másikba
    // A két fájl nevét paraméterként kapja meg
    // És visszaad egy boolean értéket, attól függően,
    // hogy sikeres volt-e a másolás

    public static void main(String[] args) {
        System.out.println(copyFile("lorem_ipsum.txt", "copiedfile-lorem.txt"));
    }

    public static boolean copyFile(String file1, String file2) {
        try {
            Path fileFrom = Paths.get(file1);
            Path fileTo = Paths.get(file2);
            Files.copy(fileFrom, fileTo);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
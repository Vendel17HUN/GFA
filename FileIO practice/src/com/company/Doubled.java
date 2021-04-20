package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Hozz létre egy metódust, ami kiszedi a fájl duplikált karaktereit.
        reDup("DuplicatedChars.txt", "ReDuplicatedChars.txt");
    }

    public static void reDup(String file1, String file2) {
        try {
            Path file1Path = Paths.get(file1);
            Path file2Path = Paths.get(file2);
            List<String> file1List = Files.readAllLines(file1Path);
            String file2S = "";
            for (String s : file1List) {
                for (int i = 0; i < s.length(); i += 2) {
                    file2S += s.charAt(i);
                }
                file2S += "\n";
            }
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(file2S));
            Files.write(file2Path, arrayList);
        } catch (Exception e) {
            System.out.println("Valami hiba van");
        }
    }
}
package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    // Olvasd ki az összes adatot a 'log.txt' fájlból.
    // Minden sor egy üzenetet jelöl egy webszervertől
    // Írj egy függvényt, ami visszaad egy tömböt az egyedi IP címekkel
    // Írj egy függvényt, ami visszaadja a GET / POST kérések arányát
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("log.txt");
        List<String> lines = Files.readAllLines(filePath);
        System.out.println("Egyedi IP címek: " + Arrays.toString(unique(lines)));
        System.out.println("GET/POST arány: " + getPost(lines));
    }

    public static String[] unique(List lines) {
        String[] ips = new String[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            ips[i] = lines.get(i).toString().substring(27, 38);
        }
        Arrays.sort(ips);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(ips));
        for (int i = 1; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                arrayList.remove(i);
                i--;
            }
        }
        String[] returnStringArray = new String[arrayList.size()];
        for (int i = 0; i < returnStringArray.length; i++) {
            returnStringArray[i] = arrayList.get(i);
        }
        return returnStringArray;
    }

    public static double getPost(List lines) {
        int get = 0;
        int post = 0;
        for (int i = 0; i < lines.size(); i++) {
            String oneLine = (lines.get(i)).toString();
            if (oneLine.substring(41, 42).equals("P")) {
                post++;
            } else {
                get++;
            }
        }
        return (double) get / post;
    }

}
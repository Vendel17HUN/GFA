package com.greenfoxacademy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ClimateChange {
    public static void main(String[] args) {
        Path myfile = Paths.get("assets/temperatureResults.txt");
        Path resultPath = Paths.get("assets/averageTemperatureOutput.txt");
        HashMap<String, List<Integer>>temperatures =new HashMap<>();
        TreeMap<Integer, Integer> firstCountry = new TreeMap<>();
        TreeMap<Integer, Integer> secondCountry = new TreeMap<>();
        TreeMap<Integer, Integer> thirdCountry = new TreeMap<>();
        String[] countryList= new String[4];
        try {
            Path filePath = Paths.get(String.valueOf(myfile));
            List<String> lines = Files.readAllLines(filePath);
            countryList=lines.get(0).split(" ");
            for (int i = 1; i < lines.size(); i++) {
                String[] lineSplit =lines.get(i).split(" ");
                firstCountry.put(Integer.parseInt(lineSplit[0]),Integer.parseInt(lineSplit[3]));
                secondCountry.put(Integer.parseInt(lineSplit[1]),Integer.parseInt(lineSplit[3]));
                thirdCountry.put(Integer.parseInt(lineSplit[2]),Integer.parseInt(lineSplit[3]));
            }

            System.out.println(firstCountry);

        } catch (Exception e) {
            System.out.println(0);
        }
        StringBuilder sbfirstCountry = new StringBuilder();
        sbfirstCountry.append(countryList[0]).append(" => ").append(firstCountry.firstEntry().getValue()).append(", ").append(firstCountry.lastEntry().getValue());
        StringBuilder sbSecondCountry = new StringBuilder();
        sbSecondCountry.append(countryList[1]).append(" => ").append(secondCountry.firstEntry().getValue()).append(", ").append(secondCountry.lastEntry().getValue());
        StringBuilder sbThirdCountry = new StringBuilder();
        sbThirdCountry.append(countryList[1]).append(" => ").append(thirdCountry.firstEntry().getValue()).append(", ").append(thirdCountry.lastEntry().getValue());
        List<StringBuilder> lines = new ArrayList<>(Arrays.asList(sbfirstCountry, sbSecondCountry, sbThirdCountry));
        try {
            Files.write(resultPath, lines, StandardOpenOption.APPEND);
        }
        catch (Exception e) {
            System.out.println("");
        }
        System.out.println(lines);
    }
}

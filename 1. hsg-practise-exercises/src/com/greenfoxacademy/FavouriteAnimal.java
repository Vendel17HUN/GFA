package com.greenfoxacademy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FavouriteAnimal {
    public static void main(String[] args) {
        Path myfile = Paths.get("assets/favourites.txt");
        Path resultFile = Paths.get("assets/favouriteAnimal.json");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(myfile);
        } catch (Exception e) {
            System.out.println(0);
        }
        int number = 0;
        Map<String, Integer> stringsCount = new HashMap<>();
        for(String s: lines)
        {
            Integer c = stringsCount.get(s);
            if(c == null) c = 0;
            c++;
            stringsCount.put(s,c);
        }
        Map.Entry<String,Integer> mostRepeated = null;
        for(Map.Entry<String, Integer> e: stringsCount.entrySet())
        {
            if(mostRepeated == null || mostRepeated.getValue()<e.getValue())
                mostRepeated = e;
        }
        assert mostRepeated != null;
        Animal animal = new Animal(mostRepeated.getKey(), mostRepeated.getValue());
        List<String>favouriteAnimal= new ArrayList<>();
        favouriteAnimal.add(animal.toString());
        try {
            Files.write(resultFile, favouriteAnimal, StandardOpenOption.APPEND);
        }
        catch (Exception e) {
            System.out.println("");
        }
    }
}

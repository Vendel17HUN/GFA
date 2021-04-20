package com.gfa.exam;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrashStatistics {
  public static void main(String[] args) {
    getCrashStatistics("./crash-incidents.csv");
  }

  public static void getCrashStatistics(String filename){
    List<String> goodWeather = new ArrayList<>(Arrays.asList("CLOUDY", "CLEAR"));
    List<String> badWeather = new ArrayList<>(Arrays.asList("RAIN", "FREEZING RAIN", "SNOW", "FOG", "SEVERE CROSSWINDS"));

    Path path = Paths.get(filename);
    if(!Files.exists(path)){
      throw new IllegalArgumentException("File nem létezik: " + filename);
    }

    int goodWeatherCounter = 0;
    int badWeatherCounter = 0;
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(path);
      for (String line : lines) {
        List<String> data = new ArrayList<>(Arrays.asList(line.split(";")));
        if(goodWeather.contains(data.get(5))){
          goodWeatherCounter ++;
        }else if(badWeather.contains(data.get(5))){
          badWeatherCounter ++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("The amount of crashes at good weather conditions: " + goodWeatherCounter);
    System.out.println("The amount of crashes at bad weather conditions: " + badWeatherCounter);
  }
}

package com.gfa.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentWords {
  public static void main(String[] args) throws IOException {
    getFrequentWords("resources/input.txt", 2);
  }

  public static void getFrequentWords(String filename, int frequency) throws IOException {
    if (filename == null || filename.equals("")) {
      throw new IllegalArgumentException("Illegal filename.");
    }

    if (frequency <= 0) {
      throw new IllegalArgumentException("Frequency can't be 0 or lower.");
    }

    if (!Files.exists(Paths.get(filename))) {
      System.out.println("File nem létezik: " + filename);
      return;
    }

    Path path = Paths.get(filename);
    Path outputPath = Paths.get("output.txt");

    List<String> lines = Files.readAllLines(path);
    Map<String, Integer> counter = new HashMap<>();
    for (String line : lines) {
      String[] words = line.split(" ");
      for (String word : words) {
        if (counter.containsKey(word)) {
          counter.put(word, counter.get(word) + 1);
        } else {
          counter.put(word, 1);
        }
      }
    }

    StringBuilder builder = new StringBuilder();
    counter.entrySet().stream()
        .filter(entry -> entry.getValue() == frequency)
        .sorted(Map.Entry.comparingByKey())
        .forEach(entry -> builder.append(entry.getKey()).append(", "));

    Files.write(outputPath, Collections.singleton(builder.substring(0, builder.length() - 2)));
  }
}

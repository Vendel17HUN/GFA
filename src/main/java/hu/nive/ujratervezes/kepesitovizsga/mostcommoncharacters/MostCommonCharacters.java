package hu.nive.ujratervezes.kepesitovizsga.mostcommoncharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostCommonCharacters {
    public String getMostCommonCharacters(String pathStr) {
        if (pathStr == null) {
            throw new NullPointerException();
        }
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(pathStr));
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> count = new HashMap<>();
        for (String line : lines) {
            for (char c : line.toCharArray()) {
                count.put(c, count.containsKey(c) ? count.get(c) + 1 : 1);
            }
        }
        List<Map.Entry<Character, Integer>> collect =
                count.entrySet().stream()
                        .filter(characterIntegerEntry -> Character.isLetter(characterIntegerEntry.getKey()))
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(2)
                        .collect(Collectors.toList());
        return "{\n" + "  \"" + collect.get(0).getKey() + "\": "
                + collect.get(0).getValue() + ",\n"
                + "  \"" + collect.get(1).getKey() + "\": "
                + collect.get(1).getValue() + "\n" + "}";
    }
}

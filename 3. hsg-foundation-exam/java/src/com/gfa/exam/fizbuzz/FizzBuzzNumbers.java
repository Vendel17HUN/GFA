package com.gfa.exam.fizbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzNumbers {
  public static void main(String[] args) {
    // program belépési pontja
    // innen tudod kipróbálni az általad írt kódot
    System.out.println(generateFizzBuzzNumbers(20));
  }

  public static List<Integer> generateFizzBuzzNumbers(int limit) {
    if (limit < 1) {
      throw new IllegalArgumentException("Limit can't be smaller than 1.");
    }

    List<Integer> result = new ArrayList<>();
    for (int i = 1; i <= limit; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        result.add(i);
      }
    }
    return result;
  }
}

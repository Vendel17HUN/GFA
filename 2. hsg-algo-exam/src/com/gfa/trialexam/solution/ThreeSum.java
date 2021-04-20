package com.gfa.trialexam.solution;

import java.util.Arrays;

public class ThreeSum {
  public static void main(String[] args) {
    /*
    Készíts egy `threeSum` nevű publikus függvényt, ami
    - egy integer (egész szám) tömböt (`array`) vár inputként,
    - visszatér a tömb 3 legkisebb elemének összegével (integer-ként)
    - -1-gyel tér vissza, ha a tömb mérete kisebb, mint 3
    - (figyelj arra, hogy a 3 legkisebb elem a tömb 3 különböző eleme legyen,
    azaz nem a legkisebb számot kell megszorozni hárommal)

    Példák:

    threeSum(new int[] { 1, 2, 3, 4, 5 });

    Amivel vissza kell térnie: `6`, mert `1`, `2` és `3`
    adja a legkisebb összeget.

    threeSum(new int[] { 100, 450, 200, 5 });

    Amivel vissza kell térnie: `305`, mert `100`, `200` és `5`
    adja a legkisebb összeget.

    threeSum(new int[] { 1, 2 });

    Amivel vissza kell térnie: `-1`, mert nincs 3 elem a tömbben.
    */
  }

  public static int threeSum(int[] input) {
    if (input.length < 3) {
      return -1;
    }

    Arrays.sort(input);

    return input[0] + input[1] + input[2];
  }
}

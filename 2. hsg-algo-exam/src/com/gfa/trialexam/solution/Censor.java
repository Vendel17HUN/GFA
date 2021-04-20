package com.gfa.trialexam.solution;

public class Censor {
  public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `censor` névvel,
    amely három string-et (karakterláncot) kér paraméterként és egy string-gel tér vissza.
    Az első string (`text`) az a szöveg, amit a függvénynek meg kell majd változtatnia.
    A második string (`originalWord`) lesz az,
    amit minden előfordulása során a harmadik string-re (`newWord`) kell megváltoztatni.
    A függvénynek térjen vissza a módosított string-el.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:

    censor("A kedvenc gyümölcsöm a(z) alma", "alma", "banán");

    Amivel vissza kell térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */
  }

  public static String censor(String text, String originalWord, String newWord) {
    int findIndex = text.indexOf(originalWord);
    while (findIndex != -1) {
      String firstHalf = text.substring(0, findIndex);
      String secondHalf = new String();
      if (findIndex + originalWord.length() != text.length()) {
        secondHalf = text.substring(findIndex + originalWord.length());
      }

      StringBuilder buildBack = new StringBuilder();
      buildBack.append(firstHalf)
          .append(newWord)
          .append(secondHalf);

      text = buildBack.toString();
      findIndex = text.indexOf(originalWord);
    }
    return text;
  }
}

package com.gfa.trialexam.solution;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;

public class GrammarCheck {
  public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `grammarCheck` névvel,
    amely egy string-et (`text`) vár paraméterként,
    és ellenőrzi, hogy a kapott string-ben a `.` írásjelek után
    az első betűk mindenhol nagybetűk-e.
    A választ a függvény egy boolean (logikai) értékként adja vissza.

    Példák:

    grammarCheck("Ez egy jó példa. Ez egy jó példa.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("Ez egy rossz példa. itt nincs nagybetű.");

    Amivel vissza kell térnie: `false`.
    */
  }

  public static boolean grammarCheck(String input) {
    String[] sentences = input.split("\\.");

    if (sentences.length < 2) {
      return true;
    }

    for (int i = 1; i < sentences.length; i++) {
      int j = 0;

      if (sentences[i].length() == 0) {
        continue;
      }

      while (j < sentences[i].length() - 1 && !isLetter(sentences[i].charAt(j)))/*notLetter*/ {
        j++;
      }

      if (!isLetter(sentences[i].charAt(j))) {
        continue;
      }

      if (!isUpperCase(sentences[i].charAt(j)))/*notUpperCase*/ {
        return false;
      }
    }
    return true;
  }
}

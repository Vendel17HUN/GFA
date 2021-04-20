package com.gfa.exam.getmostcommoncharacter;

import java.util.HashMap;
import java.util.Map;

public class GetMostCommonCharacter {
  public static void main(String[] args) {
    System.out.println(getMostCommonCharacter("apple"));
  }

  public static Character getMostCommonCharacter(String str){

    if(str.equals("")){
      throw new IllegalArgumentException();
    }

    Map<Character, Integer> characters = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if(characters.containsKey(str.charAt(i))){
        characters.put(str.charAt(i), characters.get(str.charAt(i)) +1 );
      }else{
        characters.put(str.charAt(i), 1);
      }
    }

    Character maxCharacter = '0';
    Integer max = 0;
    for (Map.Entry<Character, Integer> characterEntry : characters.entrySet()) {
      if(characterEntry.getValue()>max){
        max = characterEntry.getValue();
        maxCharacter = characterEntry.getKey();
      }
    }

    return maxCharacter;
  }
}

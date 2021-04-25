package com.company;

public class EndWithS {
    public static void main(String[] args) {
        countWordsEndsWithS("ends with s s chars cats");
    }

    public static void countWordsEndsWithS(String string) {
        int endsWithS = 0;
        String[] word = string.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].endsWith("s")) {
                endsWithS++;
            }
        }
        System.out.println(endsWithS);
    }
}

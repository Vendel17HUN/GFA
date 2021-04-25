package com.company;

import java.util.Arrays;

public class MargeArrays {
    public static void main(String[] args) {
        String[] marge = mergeElements(new String[]{"apple", "pear", "banana", "orange"}, new String[]{"dog", "cat"});
        System.out.println(Arrays.toString(marge));
    }

    public static String[] mergeElements(String[] words1, String[] words2) {

        String[] mergedWords = new String[words1.length + words2.length];
        String[] smallerWords = words1.length >= words2.length ? words2 : words1;
        String[] otherWords = smallerWords == words2 ? words1 : words2;

        int index = 0;
        for (index = 0; index < smallerWords.length; index++) {
            mergedWords[2 * index] = otherWords[index];
            mergedWords[2 * index + 1] = smallerWords[index];
        }

        for (int mergedIndex = 2 * index; index < otherWords.length; index++, mergedIndex++) {
            mergedWords[mergedIndex] = otherWords[index];
        }


        return mergedWords;
    }


}

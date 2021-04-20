package com.gfa.exam.mergematrix;

import java.util.Arrays;

public class MergeMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeMatrix(new int[][]{{2, 1}, {0, 1}}, new int[][]{{0, 3}, {-1, 1}})));
    }

    public static int[][] mergeMatrix(int[][] a, int[][] b) {
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < b.length; column++) {
                if (a[row][column] > b[row][column]) {
                    a[row][column] = a[row][column];
                } else {
                    a[row][column] = b[row][column];
                }

            }
        }

        return a;
    }

}



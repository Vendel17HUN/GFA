package com.company;

import java.util.Arrays;


public class MultiplyMatrixItems {
    public static void main(String[] args) {
        int [][] test;
        test= new int[][] {{1, 3, 6, 2},{4, 5, 6, 1},{3, 3, 1, 5},{9, 0, 5, 2}};
        print(multiplyMatrixItems(test));
    }

    public static int[][] multiplyMatrixItems(int[][] matrix) {
        print(matrix);
        System.out.println();
        int x= matrix.length;
        int y= matrix[0].length;
        for (int i=1; i<x; i+=2) {
            for (int j=0; j<y; j++) {
                if (matrix[i][j]%2==0) {
                    matrix[i][j]*=2;
                }
            }
        }
        return matrix;
    }

    public static void print (int[][] matrix) {
        int x= matrix.length;
        int y= matrix[0].length;
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                System.out.print(matrix[i][j]+" ");
                if (j==(y-1)) {
                    System.out.println();
                }
            }
        }
    }
}
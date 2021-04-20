package com.gfa.exam.drawantenna;

import java.lang.invoke.StringConcatFactory;

public class DrawAntenna {
    public static void main(String[] args) {
        drawAntenna(4);
    }

    public static void drawAntenna(int number) {
        if (number < 4) {
            return;
        }
        for (int i = number - 1; i >= 1; i--) {
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = number - 1; j >= i; j--) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int l = number - 1; l > 1; l--) { ;
            System.out.print(" ");
        }
        System.out.print("*");
    }
    }


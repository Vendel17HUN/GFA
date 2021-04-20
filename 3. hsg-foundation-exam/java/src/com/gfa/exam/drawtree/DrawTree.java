package com.gfa.exam.drawtree;

public class DrawTree {
  public static void main(String[] args) {
    // program belépési pontja
    // innen tudod kipróbálni az általad írt kódot
    drawTree(6);
  }

  public static void drawTree(int height) {
    if (height < 4) {
      throw new IllegalArgumentException("Height can't be smaller than 4.");
    }

    for (int i = 0; i < height - 1; i++) {
      for (int j = height - i - 2; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int j = height - 2; j > 0; j--) {
      System.out.print(" ");
    }
    System.out.print("*");
  }
}

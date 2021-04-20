package com.gfa.exam.drawcrosshair;

public class DrawCrosshair {
  public static void main(String[] args) {
    drawCrosshair(5);
  }

  public static void drawCrosshair(int numOfRows){

    if(numOfRows<3 || numOfRows%2 == 0){
      throw new IllegalArgumentException();
    }

    int crossRow = numOfRows/2;
    StringBuilder answer = new StringBuilder("");

    for (int i = 0; i < numOfRows; i++) {
      if(i == crossRow){
        for (int j = 0; j < numOfRows; j++) {
          answer.append("*");
        }
        answer.append("\n");
      }else{
        for (int j = 0; j < crossRow; j++) {
          answer.append(" ");
        }
        answer.append("*\n");
      }
    }

    System.out.println(answer.toString());

  }
}

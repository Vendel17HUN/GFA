package com.company;

public class PrintEven {
    public static void main(String[] args) {
    // Írj egy programot, ami kiírja az összes páros számot 0 és 500 között
        int a = 0;
        while (a < 501) {
            if (a % 2 == 0){
                System.out.println(a);}
            a += 1;
        }
}
}


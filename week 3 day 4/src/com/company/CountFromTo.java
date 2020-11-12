package com.company;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5

        System.out.println("Írj be egy számot.");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Írj be egy másik számot.");
        Scanner scanner2 = new Scanner(System.in);
        int n2 = scanner2.nextInt();
        if (n1 > n2){
            System.out.println("A második számnak nagyobbnak kell lennie!");}
            else if (n2 > n1){
                System.out.println(n1);
                n1 += 1;
            }

            //while (n1 ) {
              //      System.out.println(n1);}
                //n1 += 1;

    }
    }


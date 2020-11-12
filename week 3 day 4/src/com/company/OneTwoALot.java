package com.company;

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
        if (number <= 0){
            System.out.println("Nem Elég");}
        if (number == 1){
            System.out.println("Egy");}
        if (number == 2){
            System.out.println("Kettő");}
        if (number > 2){
            System.out.println("Sok");}


    }
}


package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
    // Írj egy olyan programot, ami egy számot (használj double-t) kér
    // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
    // majd ezt átszámítja és kiírja a távolságot kilométerben
        //
        System.out.println("írd be mennyi mérföld.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = 0.62137;
        System.out.println(a /= b);
}
}


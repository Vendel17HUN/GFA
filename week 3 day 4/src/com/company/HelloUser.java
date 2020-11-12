package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét
        System.out.println("Mi a felhasználó neved?");
        Scanner scanner = new Scanner(System.in);
        String HelloUser1 = scanner.nextLine();
        System.out.println("Hello " + HelloUser1 + "!");
    }
}

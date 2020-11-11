package com.company;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)
        String welcome = "My name isn't Rob!";
        System.out.println(welcome);

        String nickname = "Vendel";
        System.out.printf(nickname);

        String familyname  = " Jaromi";
        System.out.println(familyname);

        int age = 20;
        System.out.println(age);

        float f = 1.75f;
        System.out.println(f);

        boolean married = false;
        System.out.println(married);


    }
}

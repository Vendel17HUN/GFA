package com.company;

public class Variables {public static void main(String[] args) {
    // Változó létrehozása és egyből érték adás
    // String
    String welcome = "Hello, Világ";
    System.out.println(welcome);

    // Boolean
    boolean isAwesome = true;
    System.out.println(isAwesome);

    // Integer
    // int (32 bit; min: -2 147 483 648; max: 2 147 483 647)
    int theMeaningOfLifeAndTheUniverseAndEverything = 42;
    System.out.println(theMeaningOfLifeAndTheUniverseAndEverything);

    // Floating point number
    // Double (64 bit, double precision IEEE 754)
    double pi = 3.141592;
    System.out.println(pi);

    // Más, már említett típusok
    byte b = 2;     // Byte (8 bit; min:-128; max: +127)
    short s = 567;  // Short (16 bit; min: -32768 ; max: +32 767)
    long l = 30000000000000L; // long (64 bit; min: -9 223 372 036 854 775 808 ;max: 9 223 372 036 854 775 807)
    float f = 1.3f;
    float f2 = 45f; // Float (32 bit single precision IEEE 754)

    // Változó létrehozása (típus és név meghatározása értékadás nélkül)
    int number;

    // Változóhoz tartozó érték hozzárendelése
    number = 12;

    // Már létező változó értékének a megváltoztatása
    number = 23;


}
}

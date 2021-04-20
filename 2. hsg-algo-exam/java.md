## Feladatok

### **1. Censor**

```java
public class Censor {
  public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `censor` névvel,
    amely három string-et (karakterláncot) kér paraméterként és egy string-gel tér vissza.
    Az első string (`text`) az a szöveg, amit a függvénynek meg kell majd változtatnia.
    A második string (`originalWord`) lesz az,
    amit minden előfordulása során a harmadik string-re (`newWord`) kell megváltoztatni.
    A függvénynek térjen vissza a módosított string-el.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:

    censor("A kedvenc gyümölcsöm a(z) alma", "alma", "banán");

    Amivel vissza kell térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */
  }
}
```

### **2. ThreeSum**

```java
public class ThreeSum {
  public static void main(String[] args) {
    /*
    Készíts egy `threeSum` nevű publikus függvényt, ami
    - egy integer (egész szám) tömböt (`array`) vár inputként,
    - visszatér a tömb 3 legkisebb elemének összegével (integer-ként)
    - -1-gyel tér vissza, ha a tömb mérete kisebb, mint 3
    - (figyelj arra, hogy a 3 legkisebb elem a tömb 3 különböző eleme legyen,
    azaz nem a legkisebb számot kell megszorozni hárommal)

    Példák:

    threeSum(new int[] { 1, 2, 3, 4, 5 });

    Amivel vissza kell térnie: `6`, mert `1`, `2` és `3`
    adja a legkisebb összeget.

    threeSum(new int[] { 100, 450, 200, 5 });

    Amivel vissza kell térnie: `305`, mert `100`, `200` és `5`
    adja a legkisebb összeget.

    threeSum(new int[] { 1, 2 });

    Amivel vissza kell térnie: `-1`, mert nincs 3 elem a tömbben.
    */
  }
}
```

### **3. Grammar check**

```java
public class GrammarCheck {
  public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `grammarCheck` névvel,
    amely egy string-et (`text`) vár paraméterként,
    és ellenőrzi, hogy a kapott string-ben a `.` írásjelek után
    az első betűk mindenhol nagybetűk-e.
    A választ a függvény egy boolean (logikai) értékként adja vissza.

    Példák:

    grammarCheck("Ez egy jó példa. Ez egy jó példa.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("Ez egy rossz példa. itt nincs nagybetű.");

    Amivel vissza kell térnie: `false`.
    */
  }
}
```

### **4. Average of every `n`th element**

```java
public class AverageOfEveryNth {
    public static void main(String[] args) {
        /*
        Készíts egy `averageOfEveryNth` nevű publikus függvényt, ami két paramétert vár:

        - egy `numbers` nevű tömböt pozitív integer-ekkel,
        - egy `n` nevű pozitív integer-t.

        A függvény térjen vissza a kapott tömb minden `n`-edik elemének átlagával.

        Példák:

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 3)

        Amivel vissza kell térnie: `13`, mert `10` és `16` átlaga `13`.

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 2)

        Amivel vissza kell térnie: `18.75`, mert `4`, `34`, `16`, `21` átlaga `18.75`.

        averageOfEveryNth(new int[] {2, 4, 10, 34, 3, 16, 3, 21 }, 10)

        Amivel vissza kell térnie: `0`, mert nincs érvényes elem.
    */
    }
}
```

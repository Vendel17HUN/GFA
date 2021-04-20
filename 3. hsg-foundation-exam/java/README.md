# Java specifikus információk

- `com.gfa.exam` package-en belül dolgozz. (Minden feladatnak létrehoztunk egy külön package-et egy különálló belépési ponttal.)

# Feladatok

## 1. Feladat: Rajzoljunk egy fát csillagokból! (20 pont)

Készíts egy `drawTree` publikus statikus metódust, amely egy fát rajzol ki a console-ra:
- egyetlen `int` paramétert vár, ami az eredmény sorainak számát fogja tartalmazni
- a bemeneti paraméter értéke 4 vagy annál nagyobb
- annyi sort irat ki, mint amennyi a bemeneti paratméterben lett megadva

A `DrawTree` osztályba dolgozz!
Figyelj a bemeneti paraméter validálására is!
  
### 1. Példa

#### Bemenet
```java
drawTree(4);
```

#### Console kimenet

```text
  *
 ***
*****
  *
```

### 2. Példa

#### Bemenet
```java
drawTree(5);
```

#### Console kimenet

```text
   *
  ***
 *****
*******
   *
```

## 2. feladat: FizzBuzz számok listája (35 pont)

Készíts egy `generateFizzBuzzNumbers()` publikus statikus metódust,
ami visszaadja 1-től számolva a 3-mal vagy 5-tel osztható számot a paraméterben
megadott számig (inclusive):
- Egyetlen pozitív egész szám paramétert vár (int)
- egy **szám listával (List<Integer>) tér vissza**, ami tartalmazza
  1-től a 3-mal vagy 5-tel osztható számokat a metódus paraméterében megadott számig
- Ha nem talált egyetlen ilyen számot se, akkor üres listával tér vissza.

A `FizzBuzzNumbers` osztályba dolgozz!
Figyelj a bemeneti paraméter validálására is!
  
### 1. Példa

#### Bemenet

```java
generateFizzBuzzNumbers(2);
```

#### Visszatérési érték

```java
[]
```

### 2. Példa

#### Bemenet

```java
generateFizzBuzzNumbers(20);
```

#### Visszatérési érték

```java
[3, 5, 6, 9, 10, 12, 15, 18, 20]
```

A `FizzBuzzNumbers` osztályba dolgozz!
Figyelj a bemeneti paraméter validálására is!

## 3. feladat: Bookshelf (könyvespolc) (45 pont)

Készíts egy programot, ami könyveket tud tárolni egy könyvespolcban.

2 típusú könyv létezik: keménykötésű (Hardcover) és papírkötésű (Paperback).

A feladat megoldása tartalmazzon öröklődést is!

#### Book (könyv)

- Az osztály neve legyen: `Book`
- Minden könyvnek legyen:
  - címe (`title`)
  - szerzője (`author`)
  - kiadási éve (`releaseYear`)
  - oldalak száma (`numberOfPages`)
  - tömege gramban mérve (`weightInGram`), ami egy számolt érték.
- Az osztály rendelkezzen egy olyan konstruktorral melynek segítségével 
  az összes előre megadott tulajdonságát be tudjuk állítani a fent megadott sorrendben. (cím, szerző, stb.)
- Legyen egy `getBookInfo()` metódusa, ami egy stringgel tér vissza
  a következő formátumban: `<author>: <title> (<releaseYear>)`
  - Példa: `J. K. Rowling: Harry Potter and the Philosopher's Stone (1997)`
  

#### Keménykötésű könyv (HardcoverBook)

- Az osztály neve legyen: `HardcoverBook`
- a `constructor` a következő sorrendben várja a paramtéreket:
  - cím (`title`)
  - szerző (`author`)
  - kiadási év (`releaseYear`)
  - oldalak száma (`numberOfPages`)
- 1 oldal tömege: 10 gram
- A keménykötésű borító tömege: 100 gram
- A keménykötésű könyv tömegét az oldalak tömegének összege
  és a keménykötésű borító tömegének összege alapján kapjuk meg

#### Papírkötésű könyv (PaperbackBook)

- Az osztály neve legyen: `PaperbackBook`
- a `constructor` a következő sorrendben várja a paramtéreket:
  - cím (`title`)
  - szerző (`author`)
  - kiadási év (`releaseYear`)
  - oldalak száma (`numberOfPages`)
- 1 oldal tömege: 10 gram
- A papírkötésű borító tömege: 20 gram
- A papírkötésű könyv tömegét az oldalak tömegének összege
  és a papírkötésű borító tömegének összege alapján kapjuk meg

#### Könyvespolc (Bookshelf)

- Az osztály neve legyen `Bookshelf`
- Legyen egy `addBook()` függvénye, aminek segítségével a paraméterben 
  megadott könyvet el lehet tárolni a polcban
- Legyen egy `getBooks()` függvénye, aminek legyen egy `year` paramétere.
  Azon könyveket adja vissza egy listában,
  amik a `year` évében lettek kiadva.
- Legyen egy `getLightestAuthor()` függvénye,
  ami visszaadja annak a szerzőnek a nevét,
  aki a legkönnyebb könyvet írta.
- Legyen egy `getAuthorOfMostWrittenPages()` függvénye,
  ami visszaadja annak a szerzőnek a nevét, aki a legtöbb oldalt írta.
- Legyen egy `printBooks()` függvénye, ami kiírja az összes könyv adatát.
  Soronként kiírja a könyvek `getBookInfo()` visszatérési értékét

Figyelj a bemeneti paraméter validálására is!

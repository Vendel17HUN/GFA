# Java specifikus információk

- `com.gfa.exam` package-en belül dolgozz. (Minden feladatnak létrehoztunk egy külön package-et egy különálló belépési ponttal.)
- Ha a projekt importálása után nem tudod futtatni a megfelelő belépési pontokat, akkor ezt `File > Project Structure... > Modules > Sources` IDEA beállításoknál tudod megjavítani.

# Feladatok

## 1. Feladat: Rajzoljunk egy célkeresztet csillagokból! (20 pont)

Készíts egy `drawCrosshair` függvényt,
amely egy célkeresztet rajzol ki csillagokból:
- egyetlen szám (int) paramétert vár,
  ami az eredmény sorainak számát fogja tartalmazni
- a bemeneti paraméter értéke akkor érvényes (valid), ha:
   - 3 vagy annál nagyobb
   - páratlan szám
- dobjon hibát, ha a bemeneti paraméter nem érvényes.
- annyi sort irat ki,
  mint amennyi a függvény bemeneti paratméterében lett megadva

A `DrawCrosshair` osztályba dolgozz. Figyelj a bemeneti paraméter validálására is (dobj beépített hibát)! Figyelj rá, hogy a sorok elején és végén ne legyenek felesleges spacek.
  
### 1. Példa

#### Bemenet

```java
drawCrosshair(3);
```

#### Console kimenet

```text
 *
***
 *
```

### 2. Példa

#### Bemenet
```java
drawCrosshair(5);
```

#### Console kimenet

```text
  *
  *
*****
  *
  *
```

## 2. feladat: Leggyakrabban előforduló karakter (35 pont)

Írj egy `getMostCommonCharacter()` függvényt, ami paraméterként egy stringet vár,
és a leggyakrabban előforduló karakterrel tér vissza.

- Azonos karakter-előfordulás esetén bármelyik karakterrel visszatérhet.
- A bemeneti string nem lehet üres, dobjon hibát ebben az esetben.

A `GetMostCommonCharacter` osztályba dolgozz.
Tipp: használd a `String.toCharArray()` metódust az induláshoz!

Példa eset:
```java
getMostCommonCharacter("apple");
```

Példa visszatérési érték:
```text
p
```

## 3. feladat: BookStore (könyvkereskedés) (45 pont)

Készíts egy programot, ami könyveket tud tárolni egy könyvesboltban.

2 típusú könyv létezik: Elektronikus könyv (EBook) és Hangoskönyv (AudioBook).

A feladat megoldása tartalmazzon öröklődést is.

#### Book (könyv)

- Az osztály neve legyen: `Book`
- Minden könyvnek legyen:
  - címe (`title`)
  - szerzője (`author`)
  - kiadási éve (`releaseYear`)
  - formátum (`format`)
  - saccolt olvasási idő (`estimatedTimeToRead`)
- Legyen egy `getBookInfo()` függvénye, ami egy stringgel tér vissza
  a következő formátumban: `<author>: <title> (<releaseYear>)`
  - Példa: `J. K. Rowling: Harry Potter and the Philosopher's Stone (1997)`
- Implementáld a szükséges Gettereket is!


#### Elektronikus könyv (`EBook`)

- Az osztály neve legyen: `EBook`
- a `constructor` a következő sorrendben várja a paramtéreket:
  - cím (`title`)
  - szerző (`author`)
  - kiadási év (`releaseYear`)
  - oldalak száma (`numberOfPages`)
- Formátuma mindig: `electronic`
- A saccolt olvasási idő `estimatedTimeToRead` kiszámolása: `numberOfPages` * 5
- Implementáld a szükséges Gettereket és ments el minden adatot amit a konstruktorban kapsz!

#### Hangoskönyv (`AudioBook`)

- Az osztály neve legyen: `AudioBook`
- a `constructor` a következő sorrendben várja a paramtéreket:
  - cím (`title`)
  - szerző (`author`)
  - kiadási év (`releaseYear`)
  - időhossza (`duration`)
- Formátuma mindig: `audio`
- A saccolt olvasási idő `estimatedTimeToRead` kiszámolása: `duration` * 2
- Implementáld a szükséges Gettereket és ments el minden adatot amit a konstruktorban kapsz!

#### Könyvkereskedés (`BookStore`)

- Az osztály neve legyen `BookStore`
- Legyen egy `addBook()` függvénye, aminek segítségével a paraméterben
  megadott könyvet el lehet tárolni a polcban
- Legyen egy `getBooks()` függvénye, aminek legyen egy `year` paramétere.
  Azon könyveket adja vissza egy listában / tömbben,
  amik a `year` évében lettek kiadva.
- Legyen egy `getAuthorOfLongestBook()` függvénye,
  ami visszaadja annak a szerzőnek a nevét,
  akinek a leghosszabb elolvasni / feldolgozni a könyvét (`estimatedTimeToRead`).
- Legyen egy `printBooks()` függvénye, ami kiírja az összes könyv adatát.
  Soronként kiírja a könyvek `getBookInfo()` visszatérési értékét

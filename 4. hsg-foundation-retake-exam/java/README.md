# Java specifikus információk

- `com.gfa.exam` package-en belül dolgozz. (Minden feladatnak létrehoztunk egy külön package-et egy különálló belépési ponttal.)
- Ha a projekt importálása után nem tudod futtatni a megfelelő belépési pontokat, akkor ezt `File > Project Structure... > Modules > Sources` IDEA beállításoknál tudod megjavítani.


## 1. Feladat: Rajzoljunk egy antennát csillagokból! (20 pont)

Készíts egy `drawAntenna` metódust, amely egy antennát rajzol ki a console-ra:
- egyetlen szám paramétert vár, ami az eredmény sorainak számát fogja tartalmazni
- a bemeneti paraméter értéke 4 vagy annál nagyobb. Ha nem teljesül, akkor dobjon hibát.
- annyi sort irat ki, mint amennyi a bemeneti paratméterben lett megadva

A `DrawAntenna` osztályba dolgozz.
Figyelj a bemeneti paraméter validálására is (dobj beépített hibát)!
Figyelj rá, hogy a sorok elején és végén ne legyenek felesleges spacek.
  
### 1. Példa

#### Bemenet
```java
drawAntenna(4);
```

#### Console kimenet

```text
*****
 ***
  *
  *
```

### 2. Példa

#### Bemenet
```java
drawAntenna(5);
```

#### Console kimenet

```text
*******
 *****
  ***
   *
   *
```

## 2. feladat: mátrix összefűzés (35 pont)

Írj egy metódust `mergeMatrix()` néven,
ami visszaad egy új mátrixot a 2 bemeneti mátrix alapján.
2 paraméterekben kapott bemeneti mátrix értékeiből az adott pozíción
mindig a nagyobbat választja a metódus az új mátrix előállításánál.
- Csak négyzetes mátrixokra kell működnie.
- A négyzetes mátrixnak ugyanannyi sora van, mint oszlopa.
- Kétdimenziós primitív int tömbökkel dolgozz!
- Nem kell ellenőrizni, hogy négyzetes mátrix-e.
- Ha a 2 mátrix dimenziója nem egyezik, dobjon hibát.

### 1. Példa

#### Bemenetek

Input 1

```text
[
  [2, 1],
  [0, 1]
]
```

Input 2

```text
[
  [0, 3],
  [-1, 1]
]
```

#### Kimenet

```text
[
  [2, 3],
  [0, 1]
]
```

### 2. Példa

Input 1

```text
[
  [-1, 1, 0],
  [0, 1, 0],
  [0, 1, 0]
]
```

Input 2

```text
[
  [0, 0, 0],
  [0, 1, 0],
  [0, 0, 0]
]
```

#### Kimenet

```text
[
  [0, 1, 0],
  [0, 1, 0],
  [0, 1, 0]
]
```

## 3. Feladat: Állatkert `Zoo` (45 pont)

Ebben a feladatban egy állatkertet fogunk modellezni
állatokkal és benne dolgozókkal,
illetve a közöttük lévő kapcsolatokkal, interakciókkal.
Mindezeket Objektum Orientált elvekkel, öröklődéssel.
Stb.

#### Állat `Animal`

- Az osztály neve legyen `Animal`
- Minden állatnak legyenek a következő tulajdonságai:
  
  - neve `name` (kötelező megadni és nem lehet üres sem)
  - életkora `age` (opcionális, alapértelmezett értéke `0`)
  - nemi jellege `gender` (opcionális, alapértelmezett értéke `ismeretlen`)
  - etetést számlálója `fedTimes`, ami tárolja,
  hogy hányszor lett etetve az állat. Kezdeti értéke minden esetben `0`.

- Tehát szeretnénk, hogy az állatokat csak a nevük megadásával vagy nevük, koruk és nemi jellegük megadásával is létre lehessen hozni.

- Legyen egy `eat()` metódusa, ami 1-gyel növeli a `fedTimes` értékét.

- Legyen egy `isHungry()` metódusa, ami megmondja, hogy éppen éhes-e az állat.
  Bővebb információ lejjebb olvasható erről a metódusról.

- Legyen egy `toString()` metódusa,
  ami a következő szöveg formátumban ad vissza információt az állatról,
  behelyettesítve az értékeket:

  - "`<name>` `<age>` éves `<gender>` állat és megetették `<fedTimes>` alkalommal"

##### Oroszlán `Lion`

- Az osztály neve legyen `Lion`
- Az oroszlán **mindig** éhes.

##### Majom `Monkey`

- Az oszály neve legyen `Monkey`
- A majom **random** gyakorisággal éhes.

##### Elefánt `Elephant`

- Az osztály neve legyen `Elephant`
- Az elefánt csak **minden második** ellenőrzéskor éhes

#### Dolgozó `Worker`

- Legyen egy neve `name` (kötelezően kitöltendő),
- és egy `animalsToLookAfter` listája,
  ami azokat az állatokat tartalmazza, akiket gondoznia kell.
  Ez a lista by default üres, de megadható legyen létrehozáskor.
- Létrehozáskor mindkét esetre készítsd fel a `Worker` osztályt. 
  Tehát szeretnénk ha csak névvel is létre lehetne hozni.
  
- Legyen egy `doDailyRoutine()` metódusa, ami
  végig iterál a dolgozó `animalsToLookAfter` listáján, 
  és megeteti (`eat()`), ha épp éhes az állat (`isHungry()`).

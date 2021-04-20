# Feladatok

# JavaScript specifikus információk

- a létrehozott `javascript` könyvtáron belül dolgozz, a feladat megfelelő mappában.
- használd az `export` / `import` utasításokat minden megoldásnál (NE a CommonJS-t, vagyis a `module.exports`-ot)
- minden osztály külön fájlba kerüljön

## 1. Feladat: Rajzoljunk egy antennát csillagokból! (20 pont)

Készíts egy `drawAntenna` függvényt, amely egy antennát rajzol ki a console-ra:
- egyetlen szám paramétert vár, ami az eredmény sorainak számát fogja tartalmazni
- a bemeneti paraméter értéke 4 vagy annál nagyobb. Ha nem teljesül, akkor dobjon hibát.
- annyi sort irat ki, mint amennyi a bemeneti paratméterben lett megadva

A `drawAntenna.js` fájlba dolgozz.
Figyelj a bemeneti paraméter validálására is (dobj hibát)!
  
### 1. Példa

#### Bemenet
```javascript
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
```javascript
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

Írj egy függvényt `mergeMatrix()` néven,
ami visszaad egy új mátrixot a 2 bemeneti mátrix alapján.
2 paraméterekben kapott bemeneti mátrix értékeiből az adott pozíción
mindig a nagyobbat választja a függvény az új mátrix előállításánál.
- Csak négyzetes mátrixokra kell működnie.
- A négyzetes mátrixnak ugyanannyi sora van, mint oszlopa.
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

## 3. Feladat: Állatkert (Zoo)

Ebben a feladatban egy állatkertet fogunk modellezni
állatokkal és benne dolgozókkal,
illetve a közöttük lévő kapcsolatokkal, interakciókkal.
Mindezeket Objektum Orientált elvekkel, öröklődéssel.
Stb.

#### Állat `Animal`

- Az osztály neve legyen `Animal`
- Minden állatnak legyenek a következő tulajdonságai:
  
  - neve `name` (kötelező megadni)
  - életkora `age` (opcionális, alapértelmezett értéke `0`)
  - nemi jellege `gender` (opcionális, alapértelmezett értéke `ismeretlen`)
  - etetést számlálója `fedTimes`, ami tárolja,
  hogy hányszor lett etetve az állat. Kezdeti értéke minden esetben `0`.

- Legyen egy `eat()` függvénye, ami 1-gyel növeli a `fedTimes` értékét.

- Legyen egy `isHungry()` függvénye, ami megmondja, hogy éppen éhes-e az állat.
  Bővebb információ lejjebb olvasható erről a függvényről.

- Legyen egy `toString()` függvénye,
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
  
- Legyen egy `doDailyRoutine()` függvénye / eljárása, ami
  végig iterál a dolgozó `animalsToLookAfter` listáján, 
  és megeteti (`eat()`), ha épp éhes az állat (`isHungry()`).

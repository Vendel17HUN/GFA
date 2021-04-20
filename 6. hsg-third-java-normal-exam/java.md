# Java specifikus információk

- `com.gfa.exam` package-en belül dolgozz. (A feladatnak létrehoztuk a package-et egy belépési ponttal.)

### Szavak gyakorisága

Hozd létre a `getFrequentWords` nevű metódust, ami egy bemeneti fájlt dolgoz
fel. A metódus:

- első paramétere: `filename` (fájlnév: szöveges típus)
- második paramétere: `frequency` (gyakoriság: egész szám)
- összegyűjti azokat a szavakat, amelyek annyiszor fordulnak elő a fájlban,
  mint amennyit a `frequency` paraméterben megkap
- hibát jelez, ha a bemeneti paraméterek közül valamelyik helytelen
  (gondold végig, hogy milyen bemenő paraméterek helyesek)

Az összegyűjtött szavakat ezután kiírja az `output.txt` nevű fájlba.

Amennyiben nincs olyan szó, amely a kritériumnak megfelel, a metódus nem
végez fájlműveletet (nem hoz létre fájlt, illetve nem ír a fájlba semmit).

A metódus le tudja kezelni azt az esetet, amikor a megadott fájl (`filename`
paraméter) nem létezik és a következő üzenetet írja a parancssorra (a
megfelelő fájlnévvel):

```text
File nem létezik: nofile.txt
```

#### Példa

[Itt találsz egy példa fájlt.](input.txt)

A `frequency` paraméter értéke:

```text
2
```

Az `output.txt` fájl tartalma:

```text
apple, pear, pirate
```

Tehát azok a szavak, amelyek kétszer szerepelnek a bemeneti fájlban.

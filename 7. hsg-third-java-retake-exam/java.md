# Java specifikus információk

- `com.gfa.exam` package-en belül dolgozz. (A feladatnak létrehoztuk a package-et egy belépési ponttal.)

### Balesetek

Hozz létre egy metódust, amely egy közúti baleseteket tartalmazó fájlt
olvas be és dolgoz fel. A metódus:

- neve: `getCrashStatistics`
- egyetlen paramétere: `filename` (fájlnév, szöveges típus)
- kiírja, hogy hány baleset történt jó, illetve rossz időjárásviszonyok
  között (és nem tér vissza semmivel)
  - jó viszonyok: `CLOUDY`, `CLEAR`
  - rossz viszonyok: `RAIN`, `FREEZING RAIN`, `SNOW`, `FOG` és
    `SEVERE CROSSWINDS`

Egy sor egy baleset adatait tartalmazza pontosvesszőkkel elválasztva, és a következőképpen néz ki:

```csv
Id;Helyszín;Úttípus;Útburkolat állapota;Fényviszonyok;Időjárási viszonyok;Pontos dátum;Év
6514;1 MILES FROM US1;SMOOTH ASPHALT;WATER (STANDING, MOVING);DARK - ROADWAY NOT LIGHTED;RAIN;2013-01-02 07:57:48+00:00;2013
```

Kezeld le elegánsan azt az esetet, amikor a fájl nem létezik, ilyenkor az alkalmazás azt írja ki, hogy

```text
File nem létezik: filename.txt
```

A megfelelő filenevet behelyettesítve.

#### Példa

[Itt találsz egy példa fájlt.](./crash-incidents.csv)

Kimenet:

```text
The amount of crashes at good weather conditions: 20279
The amount of crashes at bad weather conditions: 2339
```

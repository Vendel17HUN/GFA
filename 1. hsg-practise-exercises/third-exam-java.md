# Gyakorló FileIO feladatok a harmadik java vizsgához

- Jelenleg **vázlat** minőségben láthatjátok, idővel szépül,
  lefordítom magyarra, stb. Türelmet kérek, előre is köszönöm :)

### A66 entering

Write a method which can read and parse a file containing information about
the chip usage at A66. The method writes into `a66entering.json` how many times a chip
was used at the main door *`(A66 - 04 FÕBEJÁRAT (F-1) Door #1)`* in the given output format.

The method should have one parameter, which contains the path of the input file.

During the development you will need only two fields from the input:

- Description #1 - the used door
- Card number

#### Example

[Example file can be found here.](./assets/logs.csv)

Each line represents an entry and contains the following information:

```csv
Id,Date and Time,Event message,Event number,Object #1,Description #1,Object #2,Description #2,Object #3,Description #3,Object #4,Description #4,Card number
1,2019.01.02. 9:21:49,Access granted,203,12,A66 - 04 FÕBEJÁRAT (F-1) Door #1,5,Czender András,0,,0,,00215:09895
...
```

Output format

```json
{
  "00088:56736": 3,
  "00247:27091": 2,
  "00038:28945": 2,
  "00155:46240": 1,
  "00089:01168": 2,
  "00042:36689": 1,
  "00153:30309": 1
}
```

### Average temperature

Write a method which can read and parse a file containing information about
the average temperature of three European countries
to raise awareness of climate change.
Each line represents the average temperature of each country in the given year.
The actual year can be found at the end of each line.

The method should have one parameter, which contains the path of the input file.

The method should select the first coldest
and hottest year in each country.

The application should write the data into the file named: `averageTemperatureOutput.txt` as *key => value* pairs
(see the given format below).

#### Example

[Example file can be found here.](./assets/temperatureResults.txt)

Output format

```text
France => 1996, 2018
Sweden => 2004, 2017
Germany => 2000, 2017
```

### Favourite Animals

Write a method which can read and parse a file containing favourite animals.
The method returns the most occurring animals name
and the number of the occurrence.
Save the result to `favouriteAnimal.json` file.

The method should have one parameter, which contains the path of the input file.

#### Example

[Example file can be found here.](./assets/favourites.txt)

Output format

```js
{
  cat: 8
}
```

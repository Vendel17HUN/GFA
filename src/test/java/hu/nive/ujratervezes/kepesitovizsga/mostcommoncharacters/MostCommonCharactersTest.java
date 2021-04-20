package hu.nive.ujratervezes.kepesitovizsga.mostcommoncharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MostCommonCharactersTest {

  MostCommonCharacters mostCommonCharacters;
  String fileName;
  String expectedResult;

  @BeforeEach
  void setup() {
    mostCommonCharacters = new MostCommonCharacters();
    fileName = "src/main/java/hu/nive/ujratervezes/kepesitovizsga/mostcommoncharacters/assets/countchar.txt";
    expectedResult = "{\n" +
            "  \"" + "e" + "\": " +
            6 + ",\n" +
            "  \"" + "l" + "\": " +
            4 + "\n" +
            "}";
  }

  @Test ()
  void mostCommonCharactersShouldThrowAnIllegalArgumentExceptionCausedByFileNotExists() {
    Assertions.assertThrows(IllegalArgumentException.class, () ->
            mostCommonCharacters.getMostCommonCharacters("countchars.csv"));
  }

  @Test ()
  void mostCommonCharactersShouldThrowAnIllegalArgumentExceptionCausedByEmptyString() {
    Assertions.assertThrows(IllegalArgumentException.class, () ->
            mostCommonCharacters.getMostCommonCharacters(""));
  }

  @Test ()
  void mostCommonCharactersShouldThrowANullPointerExceptionCausedByNullValue() {
    String s = null;
    Assertions.assertThrows(NullPointerException.class, () ->
            mostCommonCharacters.getMostCommonCharacters(s));
  }

  @Test
  void mostCommonCharactersWorksWithGivenExample() {
    Assertions.assertEquals(expectedResult, mostCommonCharacters.getMostCommonCharacters(fileName));
  }

  @Test
  void mostCommonCharactersWorskWithTestExample() {
    String test = "src/test/java/hu/nive/ujratervezes/kepesitovizsga/mostcommoncharacters/testassets/testtext.txt";

    String expectedTestResult = "{\n" +
            "  \"" + "w" + "\": " +
            11 + ",\n" +
            "  \"" + "h" + "\": " +
            10 + "\n" +
            "}";

    Assertions.assertEquals(expectedTestResult, mostCommonCharacters.getMostCommonCharacters(test));
  }
}

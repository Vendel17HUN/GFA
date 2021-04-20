package hu.nive.ujratervezes.kepesitovizsga.housecup;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class))
class HouseCupTests {

  @Autowired
  HouseCupService houseCup;

  @Test
  void test_getHouseCupWinner_emptyDatabase() {
    assertEquals("", houseCup.getHouseCupWinner());
  }

  @Test
  void test_getValedictorian_emptyDatabase() {
    assertEquals("", houseCup.getValedictorian());
  }

  @Test
  void test_getValedictorian_everyNameOnlyOnce() {
    createDummyData();
    assertEquals("Cedric Diggory", houseCup.getValedictorian());
  }

  @Test
  void test_getValedictorian_ginnyTwice() {
    createDummyData();
    addGinny();
    assertEquals("Ginny Weasley", houseCup.getValedictorian());
  }

  @Test
  void test_getHousecupWinner_ravenclaw() {
    createDummyData();
    assertEquals("Ravenclaw", houseCup.getHouseCupWinner());
  }

  @Test
  void test_getHousecupWinner_twoHouseHaveTheSamePoint() {
    createDummyData();
    addGinny();
    assertEquals("Gryffindor", houseCup.getHouseCupWinner());
  }

  @Autowired
  JdbcTemplate jdbcTemplate;

  void createDummyData() {
    String insertHousePoints = "INSERT INTO house_points VALUES (1, 'Gryffindor', 'Harry Potter', 10)";
    jdbcTemplate.execute(insertHousePoints);
    insertHousePoints = "INSERT INTO house_points VALUES (2, 'Gryffindor', 'Ginny Weasley', 20)";
    jdbcTemplate.execute(insertHousePoints);
    insertHousePoints = "INSERT INTO house_points VALUES (3, 'Slytherin', 'Draco Malfoy', 5)";
    jdbcTemplate.execute(insertHousePoints);
    insertHousePoints = "INSERT INTO house_points VALUES (4, 'Hufflepuff', 'Cedric Diggory', 15)";
    jdbcTemplate.execute(insertHousePoints);
    insertHousePoints = "INSERT INTO house_points VALUES (5, 'Ravenclaw', 'Luna Lovegood', 50)";
    jdbcTemplate.execute(insertHousePoints);
  }

  void addGinny() {
    String insertHousePoints = "INSERT INTO house_points VALUES (6, 'Gryffindor', 'Ginny Weasley', 20)";
    jdbcTemplate.execute(insertHousePoints);
  }
}

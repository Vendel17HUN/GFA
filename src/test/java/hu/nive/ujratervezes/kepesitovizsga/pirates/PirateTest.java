package hu.nive.ujratervezes.kepesitovizsga.pirates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PirateTest {

  Pirate captain;
  Pirate pirate;
  Ship ship;

  @BeforeEach
  void setUp() {
    captain = new Captain();
    pirate = new Pirate();
    ship = new Ship();
    ship.addPirate(captain);
    ship.addPirate(pirate);
  }

  @Test
  void newPirateHasAName() {
    assertEquals("Jack", pirate.getName());
  }

  @Test
  void newPirateCanBeCreatedWithAName() {
    Pirate testPirate = new Pirate("Bill");

    assertEquals("Bill", testPirate.getName());
  }

  @Test
  void newPirateHasInitialTenGolds() {
    assertEquals(10, pirate.getAmountOfGold());
  }

  @Test
  void newPirateHasTenInitialHealthPoints() {
    assertEquals(10, pirate.getHealthPoints());
  }

  @Test
  void workAsASimplePirate() {
    pirate.work();
    int actualAmountOfGold = pirate.getAmountOfGold();
    int actualHealthPoints = pirate.getHealthPoints();

    assertEquals(11, actualAmountOfGold);
    assertEquals(9, actualHealthPoints);
  }

  @Test
  void workAsACaptainPirate() {
    captain.work();
    int actualAmountOfGold = captain.getAmountOfGold();
    int actualHealthPoints = captain.getHealthPoints();

    assertEquals(20, actualAmountOfGold);
    assertEquals(5, actualHealthPoints);
  }

  @Test
  void partyAsASimplePirate() {
    pirate.party();
    int actualHealthPoints = pirate.getHealthPoints();

    assertEquals(11, actualHealthPoints);
  }

  @Test
  void partyAsACaptainPirate() {
    captain.party();
    int actualHealthPoints = captain.getHealthPoints();

    assertEquals(20, actualHealthPoints);
  }

  @Test
  void testPirateHasWoodenLegToString() {
    pirate.setHasWoodenLeg(true);
    String expected = "Hello, I'm Jack. I have a wooden leg and 10 golds.";

    assertEquals(expected, pirate.toString());
  }

  @Test
  void testPirateNoWoodenLegToString() {
    pirate.setHasWoodenLeg(false);
    String expected = "Hello, I'm Jack. I still have my real legs and 10 golds.";

    assertEquals(expected, pirate.toString());
  }

  @Test
  void canAddAPirateToShip() {
    int listSize = ship.getPirates().size();
    int expected = listSize + 1;
    ship.addPirate(new Pirate());

    assertEquals(expected, ship.getPirates().size());
    assertNotEquals(listSize, ship.getPirates().size());
  }

  @Test
  void canNotAddANewCaptainToShipCreatedAsPirate() {
    Pirate secondCaptain = new Captain();

    Assertions.assertThrows(IllegalArgumentException.class, () -> ship.addPirate(secondCaptain));
    Assertions.assertThrows(IllegalArgumentException.class, () -> ship.getPirates().add(secondCaptain));
  }

  @Test
  void canNotAddANewCaptainToShipCreatedAsCaptain() {
    Captain secondCaptain = new Captain();

    Assertions.assertThrows(IllegalArgumentException.class, () -> ship.addPirate(secondCaptain));
    Assertions.assertThrows(IllegalArgumentException.class, () -> ship.getPirates().add(secondCaptain));
  }

  @Test
  public void getPoorPiratesMustHaveTwoPirates() {
    Pirate testPirate = new Pirate();
    testPirate.setHasWoodenLeg(true);
    ship.getPirates().get(0).setHasWoodenLeg(false);
    ship.getPirates().get(1).setHasWoodenLeg(true);
    ship.addPirate(testPirate);

    assertEquals(2, ship.getPoorPirates().size());
    assertNotEquals(3, ship.getPoorPirates().size());
  }

  @Test
  public void getPoorPiratesMustBeEmpty() {
    ship.getPirates().get(0).setAmountOfGold(16);
    ship.getPirates().get(1).setAmountOfGold(16);

    assertEquals(0, ship.getPoorPirates().size());
    assertNotEquals(2, ship.getPoorPirates().size());
  }

  @Test
  public void getGolds() {
    int expectedGold = 20;

    assertEquals(expectedGold, ship.getGolds());
    assertNotEquals(expectedGold + 1, ship.getGolds());
    assertNotEquals(expectedGold - 1, ship.getGolds());
  }

  @Test
  public void lastDayOnTheShip() {
    int actualBefore = 0;
    for (Pirate pirate : ship.getPirates()) {
      actualBefore += pirate.getHealthPoints();
    }

    ship.lastDayOnTheShip();

    int actualAfter = 0;
    for (Pirate pirate : ship.getPirates()) {
      actualAfter += pirate.getHealthPoints();
    }

    assertEquals(20, actualBefore);
    assertEquals(31, actualAfter);
  }

  @Test
  public void prepareForBattle() {
    Pirate testPirate = new Pirate();
    ship.addPirate(testPirate);

    int actualGoldBefore = 0;
    int actualHPBefore = 0;
    for (Pirate pirate : ship.getPirates()) {
      actualGoldBefore += pirate.getAmountOfGold();
      actualHPBefore += pirate.getHealthPoints();
    }

    ship.getPirates().get(0).setHealthPoints(30);

    ship.prepareForBattle();

    int actualGoldAfter = 0;
    int actualHPAfter = 0;

    for (Pirate pirate : ship.getPirates()) {
      actualGoldAfter += pirate.getAmountOfGold();
      actualHPAfter += pirate.getHealthPoints();
    }

    assertEquals(30, actualGoldBefore);
    assertEquals(30, actualHPBefore);

    assertEquals(90, actualGoldAfter);
    assertEquals(27, actualHPAfter);

    assertNotEquals(actualGoldBefore, actualGoldAfter);
    assertNotEquals(actualHPBefore, actualHPAfter);
  }
}

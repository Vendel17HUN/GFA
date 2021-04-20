package hu.nive.ujratervezes.kepesitovizsga.pirates;

public class Pirate {
    String name = "Jack";
    int amountOfGold = 10;
    int healthPoints = 10;
    boolean hasWoodenLeg;

    public Pirate() {
    }

    public Pirate(String name) {
        this.name = name;
    }

    public void work() {
        amountOfGold += 1;
        healthPoints -= 1;
    }

    public void party() {
        healthPoints += 1;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hello, I'm " + name + ". "
                + (hasWoodenLeg ? "I have a wooden leg" : "I still have my real legs")
                + " and " + amountOfGold + " golds.";
    }

    public int getAmountOfGold() {
        return amountOfGold;
    }

    public void setAmountOfGold(int amountOfGold) {
        this.amountOfGold = amountOfGold;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setHasWoodenLeg(boolean hasWoodenLeg) {
        this.hasWoodenLeg = hasWoodenLeg;
    }
}

package hu.nive.ujratervezes.kepesitovizsga.pirates;

public class Captain extends Pirate {

    @Override
    public void work() {
        amountOfGold += 10;
        healthPoints -= 5;
    }

    @Override
    public void party() {
        healthPoints += 10;
    }
}
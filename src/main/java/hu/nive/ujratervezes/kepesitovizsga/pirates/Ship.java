package hu.nive.ujratervezes.kepesitovizsga.pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ship {
    List<Pirate> crew = new ArrayList<>();

    public void addPirate(Pirate pirate) {
        if (pirate instanceof Captain) {
            for (Pirate crewMate : crew) {
                if (crewMate instanceof Captain) {
                    throw new IllegalArgumentException("This ship already have a captain!");
                }
            }
        }
        crew.add(pirate);
    }

    public List<Pirate> getPirates() {
        return new UnModifiablePirateList<>(crew);
    }

    public List<String> getPoorPirates() {
        return crew.stream()
                .filter(pirate -> pirate.hasWoodenLeg)
                .filter(pirate -> pirate.amountOfGold < 15)
                .map(Pirate::getName).collect(Collectors.toList());
    }

    public int getGolds() {
        return crew.stream().mapToInt(Pirate::getAmountOfGold).sum();
    }

    public void lastDayOnTheShip() {
        crew.forEach(Pirate::party);
    }

    public void prepareForBattle() {
        for (int i = 0; i < 5; i++) {
            crew.forEach(Pirate::work);
        }
        lastDayOnTheShip();
    }
}
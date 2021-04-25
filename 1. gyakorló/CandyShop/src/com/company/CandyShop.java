package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CandyShop {
    public static int sugarPricePerKilogram = 600;

    private int sugarAmountInGrams;
    private int income;
    List<Candy> inventory = new ArrayList<>();

    public CandyShop(int sugarAmountInGrams) {
        this.sugarAmountInGrams = sugarAmountInGrams;
    }

    public void createCandy(Candy candy) throws InsufficientSugarException {
        int sugarNeededForCandy = candy.getSugarAmount();
        if (sugarAmountInGrams - sugarNeededForCandy < 0) {
            throw new InsufficientSugarException("Nincs elegendő cukor az édesség előállításához. Az édességhez szükséges cukor: "
                    + sugarNeededForCandy + " gramm. Elérhatő cukor " + sugarAmountInGrams);
        }

        sugarAmountInGrams -= sugarNeededForCandy;
        inventory.add(candy);
    }

    public void raisePrice(int amount) {
        for (Candy candy : inventory) {
            candy.setPrice(candy.getPrice() + amount);
        }
    }

    public void sell(int amountOfCandiesToBeSold) {
        if (amountOfCandiesToBeSold < 0) {
            throw new IllegalArgumentException("Nem lehet negatív számú cukrot venni.");
        }

        for (int i = Math.min(amountOfCandiesToBeSold, inventory.size()) - 1; i >= 0; i--) {
            income += inventory.get(i).getPrice();
            inventory.remove(i);
        }
    }

    public void buySugar(int amountInKg) throws InsufficientFunds {
        int totalPrice = amountInKg * sugarPricePerKilogram;
        if (totalPrice > income) {
            throw new InsufficientFunds("Nincs elég pénz, hogy megvedd" + amountInKg + " kg cukrot. A cukor ára: " + sugarPricePerKilogram + " Forint/kg " +
                    "Végösszeg: " + totalPrice + " Forint. Elérhető pénzösszeg: " + income);
        }

        income -= totalPrice;
        sugarAmountInGrams += amountInKg * 1000;
    }

    private HashMap<String, Integer> countCandiesByType() {
        HashMap<String, Integer> amountOfCandiesByType = new HashMap<>();
        for (Candy candy : inventory) {
            if (amountOfCandiesByType.containsKey(candy.getClass().getSimpleName())) {
                amountOfCandiesByType.put(candy.getClass().getSimpleName(), amountOfCandiesByType.get(candy.getClass().getSimpleName()) + 1);
            } else {
                amountOfCandiesByType.put(candy.getClass().getSimpleName(), 1);
            }
        }
        return amountOfCandiesByType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Készlet: ");
        for (Map.Entry<String, Integer> candyAndAmount : countCandiesByType().entrySet()) {
            stringBuilder.append(candyAndAmount.getValue()).append(" ").append(candyAndAmount.getKey().toLowerCase()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()).append("; ");
        stringBuilder.append("Bevétel: ").append(income).append("Ft; ");
        stringBuilder.append("Cukor: ").append(sugarAmountInGrams).append("gramm");
        return stringBuilder.toString();
    }
}
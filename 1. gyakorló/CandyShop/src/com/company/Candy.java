package com.company;

public class Candy {
    private int price;
    private final int sugarAmount;

    public Candy(int price, int sugarAmount) {
        this.price = price;
        this.sugarAmount = sugarAmount;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int i) {
        this.price = price;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

}

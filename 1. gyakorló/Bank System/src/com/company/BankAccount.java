package com.company;

public class BankAccount {
    protected String name;
    protected int pinCode;
    protected Currency currency;

    public BankAccount(String name, int pinCode, Currency currency) {
        this.name = name;
        this.pinCode = pinCode;
        this.currency = currency;
    }


    public int deposit(int value) {
        if (value <= 0) {
            return 0;
        }
        currency.setValue(currency.getValue() + value);
        return value;
    }

    public int withdraw(int pinCode, int amount) {
        if (this.pinCode != pinCode || currency.getValue() < amount) {
            return 0;
        }
        currency.setValue(currency.getValue() - amount);
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

}

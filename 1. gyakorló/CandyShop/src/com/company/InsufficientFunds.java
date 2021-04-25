package com.company;

public class InsufficientFunds extends Throwable {
    public InsufficientFunds(String message) {
        super(message);
    }
}
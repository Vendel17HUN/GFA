package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public boolean createAccount(BankAccount bankAccount) {
        if (bankAccounts.contains(bankAccount)) {
            return false;
        }
        bankAccounts.add(bankAccount);
        return true;
    }

    public int getAllMoney() {
        int sum = 0;
        for (BankAccount bankAccount : bankAccounts) {
            sum += bankAccount.getCurrency().getValue();
        }
        return sum;
    }
}

package com.company.task_2.task_4;

import java.math.BigInteger;

public class Account {
    private final BigInteger accountNumber;
    private final String currency;
    private final boolean isActive;
    private int amount;

    public Account(String accountNumber, String currency, int amount) {
        this.accountNumber = new BigInteger(accountNumber);
        this.currency = currency;
        this.isActive = true;
        this.amount = amount;
    }

    public void takeMoney(int amount) {
        this.amount -= amount;
    }

    public int getAmount() {
        return amount;
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "accountNumber= " + accountNumber +
                ", currency= " + currency +
                ", status= " + isActive +
                ", amount= " + amount;
    }
}

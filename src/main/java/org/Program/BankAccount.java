package org.Program;

import org.exception.InsufficientFundsException;

class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " - Balance: " + balance);
    }
}


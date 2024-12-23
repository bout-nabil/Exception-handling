package org.Program;

import org.exception.InsufficientFundsException;

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String accountHolder, double overdraftLimit) {
        super(accountNumber, balance, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < -overdraftLimit) {
            throw new InsufficientFundsException("Insufficient funds, overdraft limit exceeded");
        }
        balance -= amount;
    }
}

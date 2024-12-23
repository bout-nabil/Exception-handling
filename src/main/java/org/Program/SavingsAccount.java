package org.Program;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }
}

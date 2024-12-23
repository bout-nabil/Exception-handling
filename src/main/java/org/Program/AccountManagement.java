package org.Program;

import org.exception.InsufficientFundsException;

import java.util.ArrayList;

public class AccountManagement {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        try {
            CheckingAccount account1 = new CheckingAccount("12345", 500, "Alice", 200);
            SavingsAccount account2 = new SavingsAccount("67890", 1000, "Bob", 0.02);

            accounts.add(account1);
            accounts.add(account2);

            account1.withdraw(600);
            account1.displayBalance();

            account2.applyInterest();
            account2.displayBalance();

            // Transfer money
            double transferAmount = 300;
            if (account1.getBalance() < transferAmount) {
                throw new InsufficientFundsException("Transfer failed, insufficient funds");
            }

            account1.withdraw(transferAmount);
            account2.deposit(transferAmount);
            System.out.println("Transfer successful!");

            account1.displayBalance();
            account2.displayBalance();

        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

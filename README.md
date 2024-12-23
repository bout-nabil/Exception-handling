# Exception handling - Java Application

## Overview
This project demonstrates the use of custom exceptions and proper exception handling in Java. The application consists of two main parts:

1. **NaturalInteger Management**
   - A class to handle natural integers (non-negative integers).
   - Custom exception `NegativeNumberException` to handle invalid operations involving negative numbers.

2. **Bank Account Management**
   - Classes to simulate banking operations with support for checking and savings accounts.
   - Custom exceptions for insufficient funds and non-existent accounts.

## Project Structure

The project is divided into two packages for better organization:

### `exceptions` Package
Contains all custom exception classes:
- `NegativeNumberException`: Raised when an operation involves a negative number.
- `InsufficientFundsException`: Raised when a withdrawal or transfer exceeds the available balance.
- `NonExistentAccountException`: Raised when attempting to access an account that does not exist.

### `program` Package
Contains the main program logic:
- `NaturalInteger`: A class to manage natural integers with methods to set, get, and decrement values.
- `BankAccount`: A base class representing a generic bank account.
- `CheckingAccount`: Inherits `BankAccount` and allows overdraft withdrawals.
- `SavingsAccount`: Inherits `BankAccount` and supports interest application.
- `NaturalIntegerMain`: Demonstrates the usage of the `NaturalInteger` class and handles exceptions.
- `AccountManagementMain`: Demonstrates banking operations and handles exceptions.

## Features

### NaturalInteger Management
- **Set Value**: Validates the input to ensure it is non-negative.
- **Decrement**: Safely decrements the value, raising an exception if the result would be negative.

### Bank Account Management
- **Deposit**: Adds funds to an account.
- **Withdraw**: Removes funds, ensuring sufficient balance (or overdraft limit for checking accounts).
- **Transfer**: Transfers funds between accounts with appropriate validations.
- **Interest Application**: Automatically adds interest to savings accounts.

## Running the Application

1. **NaturalInteger Example**:
   - Run `NaturalIntegerMain` to test operations with natural integers.
   - Example output:
     ```
     Initial value: 5
     After decrement: 4
     Exception caught: Negative value: -1
     Invalid value: -1
     ```

2. **Bank Account Example**:
   - Run `AccountManagementMain` to test banking operations.
   - Example output:
     ```
     Account 12345 - Balance: -100.0
     Account 67890 - Balance: 1020.0
     Transfer successful!
     Account 12345 - Balance: -400.0
     Account 67890 - Balance: 1320.0
     ```

## How to Build and Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. Compile the project:
   ```bash
   javac -d bin $(find . -name "*.java")
   ```

3. Run the desired main class:
   ```bash
   java -cp bin program.NaturalIntegerMain
   java -cp bin program.AccountManagementMain
   ```

## Exception Details

### NegativeNumberException
- Raised in:
  - Constructor of `NaturalInteger`.
  - `setValue()` and `decrement()` methods of `NaturalInteger`.
- Captures the invalid negative value for debugging.

### InsufficientFundsException
- Raised when:
  - Attempting to withdraw or transfer an amount exceeding the account balance.
  - Overdraft limit is exceeded in `CheckingAccount`.

### NonExistentAccountException
- Raised when:
  - Attempting to transfer funds to a non-existent account.

## Future Improvements
- Add more account types (e.g., BusinessAccount).
- Introduce multi-threading for concurrent banking operations.
- Implement persistent storage for accounts.

## Author
- **Your Name**

Feel free to reach out for any questions or feedback!


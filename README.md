# Java Banking Application

A console-based Java application simulating core banking functionalities including transactions, account management, and balance tracking.

## Features

This interactive simulation supports multiple users (up to 50 accounts) and provides the following features:

- **Create Account**: Open a new Saving, Current, or "Wanitha Wasana" account with an initial deposit.
- **Deposit Money**: Add funds to an existing account.
- **Withdraw Money**: Securely withdraw funds, checking for sufficient balance.
- **Apply for a Loan**: Request a loan with a specific purpose and automatically credit the loan amount to the account.
- **Loan Details**: View current loan information associated with an account.
- **Fund Transfer**: Securely transfer money from one account to another.
- **Check Balance**: Check the current balance and account type using an account number.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

### How to Run

1. Clone the repository or download the source code.
2. Navigate to the project root directory in your terminal/command prompt.
3. Compile the Java files:
   ```bash
   javac src/BankSystem.java
   ```
4. Run the main class:
   ```bash
   java -cp src BankSystem
   ```
5. Follow the on-screen menu prompts to navigate through the banking system!

## Project Details
- **Language**: Java
- **Type**: Console-based Application
- **Main Class**: `BankSystem.java`

# ATM Simulation Program

This is a simple ATM simulation program written in Java. It allows a user to perform various banking operations such as checking their account balance, withdrawing cash, depositing cash, changing their PIN, and viewing their transaction history.

## Features

- **Account Balance Inquiry:** Check the current balance of the account.
- **Cash Withdrawal:** Withdraw a specified amount from the account.
- **Cash Deposit:** Deposit a specified amount into the account.
- **PIN Change:** Change the account PIN.
- **Transaction History:** View the history of transactions performed.

## How to Use

1. **Run the Program:**
   - Compile and run the `ATM.java` file.

2. **Enter Your PIN:**
   - When prompted, enter the default PIN (`1234`).

3. **Select an Option:**
   - Choose from the following options:
     1. Account balance inquiry
     2. Cash withdrawal
     3. Cash deposit
     4. PIN change
     5. Transaction history
     6. Exit

## Code Structure

- `main` method: Starts the program and prompts the user to enter their PIN.
- `attempt` method: Verifies the entered PIN and allows up to 3 attempts for correct entry.
- `options` method: Displays the menu of options for the user to choose from.
- `accBal` method: Displays the current account balance.
- `cashWith` method: Handles cash withdrawal and updates the balance.
- `cashDep` method: Handles cash deposit and updates the balance.
- `pinChange` method: Allows the user to change their PIN.
- `transHistory` method: Displays the transaction history.

## Notes

- The program uses a default PIN of `1234`. You can change this in the code.
- The program allows up to 3 attempts for entering the correct PIN.
- The transaction history is stored in an `ArrayList` and can be viewed anytime.

## Requirements

- Java Development Kit (JDK) installed on your machine.

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac ATM.java
java ATM

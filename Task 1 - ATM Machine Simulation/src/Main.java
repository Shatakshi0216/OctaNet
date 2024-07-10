import java.util.*;
import java.lang.String;

class ATM {
    // Scanner for user input
    static Scanner sc = new Scanner(System.in);
    // List to store transaction history
    static ArrayList<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome!");
        double currBal = 0; // Initial balance
        int password = 1234; // Default password
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt(); // User input for PIN
        attempt(pin, password, currBal);
    }

    // Method to attempt PIN verification
    public static void attempt(int pin, int password, double currBal) {
        int i = 1; // Attempt counter
        if (pin == password) {
            options(currBal, pin); // If PIN is correct, show options
        } else {
            // Allow up to 3 attempts for correct PIN
            while (pin != password && i <= 3) {
                System.out.println("Wrong pin :(");
                System.out.println("Try again!");
                i++;
            }
            return;
        }
    }

    // Method to display options after successful PIN entry
    public static void options(double currBal, int PIN) {
        boolean exit = false;
        System.out.println("Enter your option from the following -");
        System.out.println("1. Account balance inquiry");
        System.out.println("2. Cash withdrawal");
        System.out.println("3. Cash deposit");
        System.out.println("4. PIN change");
        System.out.println("5. Transaction history");
        System.out.println("6. Exit");
        while (!exit) {
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    accBal(currBal); // Account balance inquiry
                    break;
                case 2:
                    cashWith(currBal); // Cash withdrawal
                    break;
                case 3:
                    cashDep(currBal); // Cash deposit
                    break;
                case 4:
                    pinChange(PIN); // PIN change
                    break;
                case 5:
                    transHistory(currBal); // Transaction history
                    break;
                case 6:
                    exit = true; // Exit
                    return;
                default:
                    System.out.println("Enter a valid option!");
            }
        }
    }

    // Method to display account balance
    public static void accBal(double currBal) {
        System.out.println("Your account balance : " + currBal);
    }

    // Method to handle cash withdrawal
    public static void cashWith(double currBal) {
        System.out.print("Enter the amount you want to withdraw: ");
        double withdrawMoney = sc.nextDouble();
        if (currBal >= withdrawMoney) {
            currBal = currBal - withdrawMoney;
            System.out.println("Withdrawal successful.");
            System.out.println("New Balance: " + currBal);
            transactionHistory.add("Withdrawal: " + withdrawMoney);
        } else {
            System.out.println("Insufficient balance :(");
        }
    }

    // Method to handle cash deposit
    public static void cashDep(double currBal) {
        System.out.print("Enter the amount you want to deposit: ");
        double depositMoney = sc.nextDouble();
        currBal = currBal + depositMoney;
        System.out.println("Deposited successfully.");
        System.out.println("New Balance: " + currBal);
        transactionHistory.add("Deposit: " + depositMoney);
    }

    // Method to change PIN
    public static void pinChange(int PIN) {
        System.out.print("Enter your new PIN: ");
        int newPIN = sc.nextInt();
        PIN = newPIN;
        System.out.println("Pin changed successfully.");
        transactionHistory.add("PIN changed: " + PIN);
    }

    // Method to display transaction history
    public static void transHistory(double currBal) {
        System.out.print("Transaction History: ");
        for (String transaction : transactionHistory) {
            System.out.print(transaction + " ");
        }
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet!");
        }
    }
}

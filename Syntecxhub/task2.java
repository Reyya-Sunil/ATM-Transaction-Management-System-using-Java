
package Syntecxhub;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    String holderName;
    int pin;
    long accountNumber;
    long account_balance;

    Account(String holderName, int pin, long accountNumber, long balance) {
        this.holderName = holderName;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.account_balance = balance;
    }
}

public class task2 {

    static Scanner sc = new Scanner(System.in);

    public static void deposit(Account acc) {
        System.out.print("Enter amount to deposit: ");
        long amount = sc.nextLong();

        acc.account_balance += amount;

        System.out.println("₹" + amount + " deposited successfully.");
        System.out.println("Updated Balance: ₹" + acc.account_balance);
    }

    public static void withdraw(Account acc) {
        System.out.print("Enter amount to withdraw: ");
        long amount = sc.nextLong();

        if (amount <= acc.account_balance) {
            acc.account_balance -= amount;

            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining Balance: ₹" + acc.account_balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void resetPin(Account acc) {
        System.out.print("Enter New PIN: ");
        int newPin = sc.nextInt();

        acc.pin = newPin;

        System.out.println("PIN Updated Successfully.");
    }

    public static void accountOperations(Account acc) {

        while (true) {

            System.out.println("\n========== SBI SERVICES ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Reset PIN");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");
            System.out.print("Choose Service: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.println("Current Balance: ₹" + acc.account_balance);
                break;

            case 2:
                deposit(acc);
                break;

            case 3:
                withdraw(acc);
                break;

            case 4:
                resetPin(acc);
                break;

            case 5:
                System.out.println("\n----- ACCOUNT DETAILS -----");
                System.out.println("Name : " + acc.holderName);
                System.out.println("Account Number : " + acc.accountNumber);
                System.out.println("Balance : ₹" + acc.account_balance);
                break;

            case 6:
                System.out.println("Thank You For Banking With SBI!");
                return;

            default:
                System.out.println("Invalid Choice!");
            }
        }
    }

 public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("      WELCOME TO SBI BANK       ");
        System.out.println("================================");

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Sunil", 1234, 1001, 20000));
        accounts.add(new Account("Rahul", 5678, 1002, 15000));
        accounts.add(new Account("Ankit", 2424, 1003, 30000));
        accounts.add(new Account("Aravind", 2525, 1004, 50000));

        System.out.print("Enter Account Number: ");
        long accountNum = sc.nextLong();

        System.out.print("Enter Account Holder Name: ");
        String holderName = sc.next();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        Account loggedInAccount = null;

        for (Account acc : accounts) {
            if (acc.accountNumber == accountNum
                    && acc.holderName.equalsIgnoreCase(holderName)
                    && acc.pin == pin) {

                loggedInAccount = acc;
                break;
            }
        }

        if (loggedInAccount != null) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome " + loggedInAccount.holderName);

            accountOperations(loggedInAccount);

        } else {
            System.out.println("Invalid Account Details!");
        }
    }
}

package Lab;

import java.util.Scanner;

class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ownerNameInput = scanner.nextLine(); 

        double initialBalanceInput = scanner.nextDouble();
        double depositAmountInput = scanner.nextDouble();

        scanner.close(); 

        BankAccount account = new BankAccount(ownerNameInput, initialBalanceInput);

        account.deposit(depositAmountInput);
        account.displaySummary();
    }
}

package Lab;

import java.util.Scanner;

	class BankAccount {
	    private String ownerName;
	    private double balance;

	    public BankAccount(String ownerName, double initialBalance) {
	        this.ownerName = ownerName;
	        this.balance = initialBalance;	      
	    }

	    public void withdraw(double amount) {
	        if (amount <= this.balance) {
	            this.balance -= amount;
	            System.out.println("Withdrawal successful. ");
	        } else {
	            System.out.println("Insufficient funds. " );
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Balance: " + this.balance);
	    }
	}

	public class Lab2_7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String ownerName = scanner.nextLine();

	        double initialBalance = scanner.nextDouble();
	        double withdrawAmount1 = scanner.nextDouble();
	        double withdrawAmount2 = scanner.nextDouble();

	        BankAccount account = new BankAccount(ownerName, initialBalance);	        
	        account.withdraw(withdrawAmount1);
	        account.withdraw(withdrawAmount2);	      
	        account.displayBalance();

	        scanner.close();
	    }
	}

import java.util.Scanner;

class BankAccount {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                totalTransactionCount++;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Lab3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) break; 
            String command = scanner.nextLine().trim();

            switch (command) {
                case "CREATE":
                    double initialDeposit = 0;
                    if (scanner.hasNextLine()) {
                        try {
                            initialDeposit = Double.parseDouble(scanner.nextLine().trim());
                            myAccount = new BankAccount(initialDeposit);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid initial deposit format.");
                        }
                    } else {
                        System.out.println("Missing initial deposit.");
                    }
                    break;

                case "DEPOSIT":
                case "WITHDRAW":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                        if (scanner.hasNextLine()) scanner.nextLine(); 
                    } else {
                        double amount = 0;
                        if (scanner.hasNextLine()) {
                            try {
                                amount = Double.parseDouble(scanner.nextLine().trim());
                                if (command.equals("DEPOSIT")) {
                                    myAccount.deposit(amount);
                                } else {
                                    myAccount.withdraw(amount);
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid amount format.");
                            }
                        } else {
                            System.out.println("Missing amount for " + command + ".");
                        }
                    }
                    break;

                case "STATUS":
                    if (myAccount != null) {
                        System.out.printf("Balance: %.2f%n", myAccount.getBalance()); 
                    } else {
                        System.out.println("No account exists.");
                    }
                    break;

                case "GLOBAL_STATUS":
                    System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
                    break;

                default:
                    System.out.println("Unknown command: " + command);
                    break;
            }
        }
        
        scanner.close();
    }
}

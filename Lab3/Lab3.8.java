package Lab;

import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0) {
            if (amount <= this.stock) {
                this.stock -= amount;
                System.out.println("Sale successful.");
            } else {
                System.out.println("Not enough stock.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class Lab3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        
        int initialStock = scanner.nextInt();

        InventoryItem item = new InventoryItem(productName, initialStock);

        int N = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine().trim();
            
            int amount = scanner.nextInt();
            scanner.nextLine(); 

            switch (command) {
                case "ADD":
                    item.addStock(amount);
                    break;
                case "SELL":
                    item.sellStock(amount);
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }

        System.out.println("Final Stock: " + item.getStock());

        scanner.close();
    }
}

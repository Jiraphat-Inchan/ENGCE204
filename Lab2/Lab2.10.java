package Lab;

import java.util.Scanner;

class Product {
    private double price;

    public Product(String name, double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private Product[] items = new Product[10];
    private int itemCount = 0;

    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        } else {
            System.out.println("Shopping cart is full. Cannot add more items.");
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }
}

public class Lab2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 0;
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
        }
        scanner.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String itemName = scanner.nextLine();

            double itemPrice = 0.0;
            if (scanner.hasNextDouble()) {
                itemPrice = scanner.nextDouble();
            }
            scanner.nextLine();

            Product newProduct = new Product(itemName, itemPrice);
            cart.addProduct(newProduct);
        }

        double total = cart.calculateTotalPrice();

        System.out.printf("%.2f\n", total);
        
        scanner.close();
    }
}

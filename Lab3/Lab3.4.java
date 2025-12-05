package Lab;

import java.util.Scanner;
import java.util.ArrayList;

class Product {
    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              
        int N;
        try {
            N = scanner.nextInt();
            scanner.nextLine();
        } catch (java.util.InputMismatchException e) {
            scanner.close();
            return;
        }

        ArrayList<Product> productList = new ArrayList<>(); 

        for (int i = 0; i < N; i++) {
            String productName = scanner.nextLine();
            
            Product newProduct = new Product(productName);
            productList.add(newProduct);          
        }

        int totalProducts = Product.getProductCount();
        System.out.printf("%d\n", totalProducts);
        
        scanner.close();
    }
}

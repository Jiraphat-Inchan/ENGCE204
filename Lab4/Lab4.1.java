package Lab;

import java.util.Scanner;

public class Lab4_1 {

    public static class Book {
        private String title;
        private String author;

        public Book(String title) {
            this.title = title;
            this.author = "Unknown";
        }

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayInfo() {
            System.out.println("Title: " + this.title + ", Author: " + this.author);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book; 
        

        if (scanner.hasNextInt()) {
            int mode = scanner.nextInt();
            scanner.nextLine(); 

            String title;
            String author;

            switch (mode) {
                case 1:

                    title = scanner.nextLine();
                    book = new Book(title);
                    break;

                case 2:
                    title = scanner.nextLine();
                    author = scanner.nextLine();
                    book = new Book(title, author);
                    break;

                default:
                    System.out.println("Invalid mode. Please choose 1 or 2.");
                    scanner.close();
                    return;
            }

            book.displayInfo();
            
        } else {
            System.out.println("Invalid mode input. Must be 1 or 2.");
        }

        scanner.close();
    }
}

package Lad;

import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cat myCat = new Cat();

        String inputName = scanner.nextLine();
        int inputAge = scanner.nextInt();

        myCat.name = inputName;
        myCat.age = inputAge;

        myCat.displayInfo();
        myCat.makeSound();
        
        scanner.close();
    }
}

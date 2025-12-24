import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog myDog = new Dog();

        String inputName = scanner.nextLine();
        int inputAge = scanner.nextInt();

        myDog.name = inputName;
        myDog.age = inputAge;

        myDog.makeSound();
        myDog.displayInfo();
        
        scanner.close();
    }
}

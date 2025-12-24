package Lab;

import java.util.Scanner;

class Employee {
    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (salary * 0.05);
    }
}

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Manager manager = new Manager();
        
        manager.salary = scanner.nextDouble();
        
        System.out.println(manager.calculateBonus());
        
        scanner.close();
    }
}

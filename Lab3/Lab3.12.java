package Lab;

import java.util.Scanner;

class Emp {
    private String name;
    private double monthlySalary;

    public Emp(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        double annualSalary = getAnnualSalary();
        return annualSalary * taxRate;
    }
}

public class Lab3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    

        String name = scanner.nextLine();

        double monthlySalary = scanner.nextDouble();
        
        double taxRate = scanner.nextDouble();

        double raiseAmount = scanner.nextDouble();
        
        Emp employee = new Emp(name, monthlySalary);
        
        double taxBefore = employee.calculateTax(taxRate);
        System.out.printf("Tax (Before): %.2f%n", taxBefore);
        
        employee.giveRaise(raiseAmount);
        
        double taxAfter = employee.calculateTax(taxRate);
        System.out.printf("Tax (After): %.2f%n", taxAfter);

        scanner.close();
    }
}

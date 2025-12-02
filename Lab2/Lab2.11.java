package Lab;

import java.util.Scanner;

public class Lab2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String model = scanner.nextLine();
        int initialYear = scanner.nextInt();
        
        int updatedYear = scanner.nextInt();

        Car myCar = new Car(model, initialYear);

        myCar.setYear(updatedYear);

        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        scanner.close();
    }
}

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}

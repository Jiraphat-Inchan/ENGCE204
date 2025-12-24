package Lab;

import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car1 extends RentalVehicle {
    public Car1(String model, double rentalRate) {
        super(model, rentalRate);
    }

    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Enter Car rental rate: ");
        double carRate = sc.nextDouble();
        sc.nextLine(); 

        String motoModel = sc.nextLine();
        double motoRate = sc.nextDouble();

        Car1 myCar = new Car1(carModel, carRate);
        Motorcycle myMoto = new Motorcycle(motoModel, motoRate);

        RentalVehicle[] vehicles = { myCar, myMoto };

        double totalRentalFee = 0;

        for (RentalVehicle v : vehicles) {
            double fee = v.calculateFee();
            System.out.println("Vehicle: " + v.model + " | Fee: " + fee);
            totalRentalFee += fee;
        }


        System.out.println("Total Rental Fee: " + totalRentalFee);
        
        sc.close();
    }
}

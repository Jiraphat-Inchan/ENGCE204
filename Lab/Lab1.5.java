package Lab1;

import java.util.Scanner;

public class Lab1_5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("1 = Americano");
	        System.out.println("2 = Latte");
	        System.out.println("3 = Espresso");
	        System.out.println("4 = Mocha");

	        int menuNumber = scanner.nextInt();

	        String menuName;

	        switch (menuNumber) {
	            case 1:
	                menuName = "Americano";
	                break;
	            case 2:
	                menuName = "Latte";
	                break;
	            case 3:
	                menuName = "Espresso";
	                break;
	            case 4:
	                menuName = "Mocha";
	                break;
	            default:
	                
	                menuName = "Invalid Menu";
	                break;
	        }

	        System.out.println(menuName);

	        scanner.close();
	    }
	}


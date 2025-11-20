package Lab;

import java.util.Scanner;

public class Lab15 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("--- เมนูกาแฟ ---");
	        System.out.println("1 = Americano");
	        System.out.println("2 = Latte");
	        System.out.println("3 = Espresso");
	        System.out.println("4 = Mocha");
	        System.out.println("-----------------");
	        System.out.print("กรุณาป้อนหมายเลขเมนู (1-4): ");

	        int menuNumber = 0;
	        
	        if (scanner.hasNextInt()) {
	            menuNumber = scanner.nextInt();
	        } else {
	           
	            System.out.println("\n Invalid Menu: คุณต้องป้อน **ตัวเลข** เท่านั้น");
	            scanner.close(); 
	            return;
	        }

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

	        if (menuName.equals("Invalid Menu")) {
	            System.out.println("\n " + menuName + ": หมายเลขที่คุณป้อนอยู่นอกเหนือจากตัวเลือก 1-4");
	        } else {
	            System.out.println("\n" + menuName );
	        }

	        scanner.close();
	    }
	}

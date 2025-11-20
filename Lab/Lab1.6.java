package Lab;

import java.util.Scanner;

public class Lab16 {
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("--- โปรแกรมสูตรคูณ ---");
	        System.out.print("Input (ป้อนแม่สูตรคูณที่คุณต้องการ): ");

	        int multiplier;
	        try {
	            multiplier = scanner.nextInt();
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("⚠️ ข้อผิดพลาด: กรุณาป้อนเฉพาะจำนวนเต็มเท่านั้น");
	            scanner.close();
	            return; 
	        }

	        System.out.println("\nOutput:");
	        
	        for (int i = 1; i <= 12; i++) {

	            int result = multiplier * i;
	            
	            System.out.println(multiplier + " x " + i + " = " + result);
	        }

	        scanner.close();
	    }
	}

package Lab1;

import java.util.Scanner;

public class Lab1_9 {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);    
	        System.out.print("ระบุจำนวนตัวเลขทั้งหมด (N): ");
	        
	        if (!scanner.hasNextInt()) {
	            System.out.println("ข้อผิดพลาด: โปรดป้อนจำนวนเต็มสำหรับ N");
	            scanner.close();
	            return;
	        }
	        int N = scanner.nextInt();
	        
	        if (N <= 0) {
	            System.out.println("ข้อผิดพลาด: จำนวนตัวเลขต้องมากกว่าศูนย์");
	            scanner.close();
	            return;
	        }
	        
	        long ttSum = 0;
	        
	        System.out.println("\n กรุณาป้อนตัวเลขทีละตัว (N):");

	        for (int i = 0; i < N; i++) {
	            System.out.print("N " + (i + 1) + ": ");
	            
	            if (!scanner.hasNextInt()) {
	                System.out.println("ข้อผิดพลาด: ข้อมูลที่ป้อนต้องเป็นตัวเลข");
	                scanner.close();
	                return;
	            }
	            
	            int currentValue = scanner.nextInt();
	            ttSum += currentValue; 
	        }

	        double average = (double) ttSum / N; 
	        
	        System.out.println("Sum: " + ttSum);
	        System.out.printf("(Average):%.1f", average); 
	        
	        scanner.close();
	    }
	}

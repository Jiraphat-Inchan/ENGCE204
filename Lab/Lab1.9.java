package Lab1;

import java.util.Scanner;

public class Lab1_9 {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);     
	        
	        if (!scanner.hasNextInt()) {
	            System.out.println("ข้อผิดพลาด: โปรดป้อนจำนวนเต็มสำหรับ N");
	            scanner.close();
	            return;
	        }
	        int N = scanner.nextInt();
	        
	        if (N <= 0) {
	            System.out.println("Error");
	            scanner.close();
	            return;
	        }
	        
	        long ttSum = 0;
	        
	       
	        for (int i = 0; i < N; i++) {
	        	
	            if (!scanner.hasNextInt()) {
	                System.out.println("Error");
	                scanner.close();
	                return;
	            }
	            
	            int currentValue = scanner.nextInt();
	            ttSum += currentValue; 
	        }

	        double average = (double) ttSum / N; 
	        
	        System.out.println("Sum: " + ttSum);
	        System.out.printf("Average:%.1f", average); 
	        
	        scanner.close();
	    }
	}

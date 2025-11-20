package Lab;

import java.util.Scanner;

	public class Lab112 {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input N (จำนวนชนิดสินค้า): ");
	        int N = scanner.nextInt();

	       
	        int[] productIDs = new int[N];
	        int[] stockQuantities = new int[N];

	       
	        for (int i = 0; i < N; i++) {
	            System.out.println("\n--- ข้อมูลสินค้าชิ้นที่ " + (i + 1) + " ---");
	            
	           
	            System.out.print("Input Product ID (เป็นจำนวนเต็ม): ");
	            productIDs[i] = scanner.nextInt();
	           
	            System.out.print("Input Stock Quantity (เป็นจำนวนเต็ม): ");
	            stockQuantities[i] = scanner.nextInt();
	        }
	    
	        System.out.print("\n--- การค้นหา ---");
	        System.out.print("\nInput รหัสสินค้าที่ต้องการค้นหา (Search ID): ");
	        int searchID = scanner.nextInt();
	    
	        int foundStock = -1; 
	        boolean found = false;

	        for (int i = 0; i < N; i++) {
	            if (productIDs[i] == searchID) {
	             
	                foundStock = stockQuantities[i]; 
	                found = true;
	                break; 
	            }
	        }
     
	        if (found) {    
	            System.out.println("\n--- ผลลัพธ์ ---");
	            System.out.println("Output: " + foundStock);
	            
	        } else { 
	            System.out.println("\n--- ผลลัพธ์ ---");
	            System.out.println("Output: Product (Search ID) not found (โดยที่ [" + searchID + "] คือรหัสที่ค้นหา)");
	        }

	        scanner.close();
	    }
	}

package Lab1;

import java.util.Scanner;

public class Lab1_6 {

	    public static void main(String[] args) {
	        Scanner myInput = new Scanner(System.in);
	        System.out.println("ใส่เลขแม่สูตรคูณที่ต้องการ:");
	        
	        int myMultiplier = myInput.nextInt();
	        int factor = 1; 
	        
	        while (factor <= 12) { 
	            int product = myMultiplier * factor;
	            System.out.println(myMultiplier + " x " + factor + " = " + product);
	            factor++; 
	        }

	        myInput.close();
	    }
	}

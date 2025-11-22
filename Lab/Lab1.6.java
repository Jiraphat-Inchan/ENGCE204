package Lab1;

import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);         
	        
	        int multiplier = input.nextInt();

	        for (int i = 1; i <= 12; i++) {
	            int result = multiplier * i;
	            
	            System.out.println(multiplier + " x " + i + " = " + result);
	        }

	        input.close(); 
	    }
	}

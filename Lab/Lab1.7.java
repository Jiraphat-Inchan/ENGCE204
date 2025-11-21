package Lab1;

import java.util.Scanner;

public class Lab1_7 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int N = scanner.nextInt();
	        
	        int sum = 0; 
	        
	        for (int i = 0; i < N; i++) {
	            sum += scanner.nextInt(); 
	        }
	        
	        System.out.println(sum);
	        
	        scanner.close();
	    }
	}

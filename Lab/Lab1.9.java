package Lab1;

import java.util.Scanner;
import java.util.Arrays;
	
public class Lab1_9 {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        int[] numbers = new int[n];

	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        double sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }

	        double average = sum / n;

	        System.out.println(average);

	        scanner.close();
	    }
	}

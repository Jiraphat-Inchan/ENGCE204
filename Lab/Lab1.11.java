package Lab;

import java.util.Scanner;

public class Lab111 {
	    
	    public static int sumArray(int[] numbers) {
	        int sum = 0;
	        
	        for (int number : numbers) {
	            sum += number;
	        }
	        
	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ป้อนขนาดของ Array (N): ");
	        int N = scanner.nextInt();
	        
	        int[] numbers = new int[N];
	        
	        System.out.println("ป้อนจำนวนเต็ม " + N + " ตัว: ");
	        
	        for (int i = 0; i < N; i++) {
	            System.out.print("Input [" + i + "]: ");
	            numbers[i] = scanner.nextInt();
	        }
	        
	        int totalSum = sumArray(numbers);
	        
	        System.out.println("---");
	        System.out.println("Output : " + totalSum);
	        
	        scanner.close();
	    }
	}

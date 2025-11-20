package Lab;
import java.util.Scanner;

public class Lab19 {
	
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("ป้อนจำนวนตัวเลขทั้งหมด (N): ");
	        int N = scanner.nextInt();

	        int[] numbers = new int[N];
	        double sum = 0; 

	        System.out.println("โปรดป้อนตัวเลข " + N + " ตัว:");

	        for (int i = 0; i < N; i++) {
	            System.out.print((i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	            sum += numbers[i]; 
	        }

	        double average = sum / N;

	        System.out.println("ผลรวมของตัวเลขทั้งหมด: " + sum);
	        System.out.printf("ค่าเฉลี่ย (Average): %.1f%n", average);
	        
	        scanner.close();
	    }
	}

package Lab1;

import java.util.Scanner;

public class Lab1_6 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("กรุณาป้อนตัวเลขแม่สูตรคูณ:");

	        int multiplier = scanner.nextInt();

	        for (int i = 1; i <= 12; i++) {
	            int result = multiplier * i;

	            System.out.println(multiplier + " x " + i + " = " + result);
	        }

	        scanner.close();
	    }
	}

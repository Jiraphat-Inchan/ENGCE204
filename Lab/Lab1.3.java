package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab13 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("กรุณาป้อนจำนวนเต็ม 1 ค่า: ");

	        try {
	            int number = scanner.nextInt();
	            
	            String result;

	            if (number % 2 == 0) {
	                result = "Even";
	            } else {

	                result = "Odd";
	            }

	            System.out.println("จำนวนที่ป้อน: " + number);
	            System.out.println("ผลการตรวจสอบ: " + result);        

	        } catch (InputMismatchException e) {
	            System.out.println("\n ข้อผิดพลาด: กรุณาป้อนค่าเป็นตัวเลขจำนวนเต็มเท่านั้น ");
	        } finally {
	            scanner.close();
	        }
	    }
	}

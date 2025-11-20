package Lab;

import java.util.Scanner;

public class Lab10 {

	    public static double calculateArea(double width, double height) {
	        return width * height;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("ป้อนความกว้าง (width) เป็น double: ");
	        double width = 0;
	        if (scanner.hasNextDouble()) {
	            width = scanner.nextDouble();
	        } else {
	            System.out.println("ข้อผิดพลาด: ป้อนค่าความกว้างไม่ถูกต้อง กรุณาใส่ตัวเลข");
	            return; 
	        }

	        System.out.print("ป้อนความสูง (height) เป็น double: ");
	        double height = 0;
	        if (scanner.hasNextDouble()) {
	            height = scanner.nextDouble();
	        } else {
	            System.out.println("ข้อผิดพลาด: ป้อนค่าความสูงไม่ถูกต้อง กรุณาใส่ตัวเลข");
	            return; 
	        }

	        double areaResult = calculateArea(width, height);

	        System.out.println("-------------------------------------");
	        System.out.println("ความกว้างที่ป้อน: " + width);
	        System.out.println("ความสูงที่ป้อน: " + height);
	        System.out.printf("ผลลัพธ์พื้นที่ที่คำนวณได้คือ: %.2f\n", areaResult);

	        scanner.close(); 
	    }
	}

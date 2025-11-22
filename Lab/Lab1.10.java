package Lab1;

import java.util.Scanner;

public class Lab1_10 {

	    public static double calculateArea(double width, double height) {
	        double area = width * height;
	        return area;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("ป้อนความกว้าง : ");
	        if (scanner.hasNextDouble()) {
	            double width = scanner.nextDouble();
	            System.out.print("ป้อนความสูง : ");

	            if (scanner.hasNextDouble()) {
	                double height = scanner.nextDouble();

	                double areaResult = calculateArea(width, height);

	                System.out.println("พื้นที่ที่คำนวณได้คือ: " + areaResult);
	            } else {
	                System.out.println("Error: โปรดป้อนค่าความสูงเป็นตัวเลขทศนิยมที่ถูกต้อง");
	            }
	        } else {
	            System.out.println("Error: โปรดป้อนค่าความกว้างเป็นตัวเลขทศนิยมที่ถูกต้อง");
	        }

	        scanner.close(); 
	    }
	}


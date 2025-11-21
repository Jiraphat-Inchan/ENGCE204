package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;
	
public class Lab10 {

	    public static double calculateArea(double width, double height) {
	        return width * height;
	    }

	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("--- ป้อนพื้นที่สี่เหลี่ยมผืนผ้า ---");

	            double width = readDoubleInput(scanner, "ป้อนความกว้าง (width) เป็น double: ");
	            if (width < 0) {
	                return;
	            }

	            double height = readDoubleInput(scanner, "ป้อนความสูง (height) เป็น double: ");
	            if (height < 0) {
	                return;
	            }

	            double areaResult = calculateArea(width, height);

	            System.out.println("----------------------------------------");
	            System.out.println("width: " + width);
	            System.out.println("height: " + height);
	            System.out.printf("ผลลัพธ์พื้นที่ที่คำนวณได้คือ: %.2f\n", areaResult);

	        } catch (Exception e) {
	            System.err.println("ข้อผิดพลาดที่ไม่คาดคิดเกิดขึ้น: " + e.getMessage());
	        }
	    }

	    private static double readDoubleInput(Scanner scanner, String prompt) {
	        System.out.print(prompt);
	        try {
	            if (scanner.hasNextDouble()) {
	                return scanner.nextDouble();
	            } else {
	                System.out.println("ข้อผิดพลาด: กรุณาป้อน **ตัวเลข** ชนิด double เท่านั้น");
	                scanner.next();
	                return -1.0;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("ข้อผิดพลาด: การป้อนข้อมูลไม่ตรงกับชนิดที่กำหนด");
	            return -1.0;
	        }
	    }
	}

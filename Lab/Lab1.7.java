package Lab;

import java.util.Scanner;

	public class Lad17 {
    public static void main(String[] args) {	   
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("--- โปรแกรมคำนวณผลรวม N จำนวน ---");
	        System.out.print("ป้อนค่า N (จำนวนเต็มบวกที่จะรับค่า): ");
	        
	        if (scanner.hasNextInt()) {
	            int N = scanner.nextInt();
	            
	            if (N <= 0) {
	                System.out.println("ข้อผิดพลาด: N ต้องเป็นจำนวนเต็มบวก");
	                scanner.close();
	                return;
	            }
	            

	            long sum = 0; 
	            
	            System.out.println("ป้อนตัวเลข " + N + " จำนวน:");
	            
	            for (int i = 0; i < N; i++) {
	               
	                System.out.print((i + 1) + ": ");
	                
	                if (scanner.hasNextInt()) {
	                    int number = scanner.nextInt();
	                    sum += number; 
	                } else {
	                    System.out.println("ข้อผิดพลาด: ค่าที่ป้อนไม่ใช่จำนวนเต็ม โปรดเริ่มใหม่");
	                    scanner.close();
	                    return; 
	                }
	            }
           
	            System.out.println("ผลรวมของตัวเลขทั้ง " + N + " จำนวน คือ: " + sum);

	        } else {
	            System.out.println("ข้อผิดพลาด: ค่า N ที่ป้อนไม่ใช่จำนวนเต็ม โปรดเริ่มใหม่");
	        }
	        
	        scanner.close();
	    }
	}

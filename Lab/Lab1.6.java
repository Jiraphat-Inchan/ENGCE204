package Lab1;

import java.util.Scanner;

public class Lab1_6 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("กรุณากรอกแม่สูตรคูณที่ต้องการ: ");
	        int num = in.nextInt(); 
	        
	        for (int i = 1; i <= 12; ++i) { 
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	        
	        in.close(); 
	    }
	}

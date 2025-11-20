package Lab;

	import java.util.Scanner;
	import java.util.Arrays; 
	
	public class Lab18 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        if (!scanner.hasNextInt()) {
	            System.err.println("Input แรกต้องเป็นจำนวนเต็ม (N)");
	            return;
	        }
	        int N = scanner.nextInt();
	        
	      
	        if (N <= 0) {
	            System.out.println("ไม่สามารถคำนวณได้เนื่องจาก N ต้องมากกว่า 0");
	            return;
	        }

	        int[] numbers = new int[N];
	        	  
	        System.out.println("กรุณาป้อนจำนวนเต็ม " + N + " ตัว:");
	        for (int i = 0; i < N; i++) {
	            if (!scanner.hasNextInt()) {
	                System.err.println("Input ไม่ใช่จำนวนเต็มที่ถูกต้อง");
	                return;
	            }
	            numbers[i] = scanner.nextInt();
	        }
	        
	        int maxValue = findMax(numbers);
	   
	        System.out.println("Output");
	        System.out.println(maxValue);
	        
	        scanner.close();
	    }
	    
	    public static int findMax(int[] arr) {
	        if (arr == null || arr.length == 0) {	       
	            return Integer.MIN_VALUE; 
	        }
	           
	        int max = arr[0];
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        
	        return max;
	    }
	    

	}

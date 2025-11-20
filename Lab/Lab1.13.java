package Lab;

import java.util.Scanner;

public class Lab113 {

	    public static void main(String[] args) {	       
	        Scanner scanner = new Scanner(System.in);

	        int R = scanner.nextInt();
	        int C = scanner.nextInt();

	        int[][] serverStatus = new int[R][C];

	        for (int i = 0; i < R; i++) {
	            for (int j = 0; j < C; j++) {
	                serverStatus[i][j] = scanner.nextInt();
	            }
	        }

	        int onlineCount = 0;
	        
	        for (int i = 0; i < R; i++) {
	            for (int j = 0; j < C; j++) {
	                if (serverStatus[i][j] == 1) {
	                    onlineCount++;
	                }
	            }
	        }
	        
	        System.out.println(onlineCount);

	        scanner.close();
	    }
	}

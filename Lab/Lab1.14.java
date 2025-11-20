package Lab;

import java.util.Scanner;
	
public class Lab114 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("--- Minesweeper Logic Solver ---");

	        System.out.print("ป้อนจำนวนแถว (R): ");
	        int R = scanner.nextInt();
	        System.out.print("ป้อนจำนวนคอลัมน์ (C): ");
	        int C = scanner.nextInt();

	        scanner.nextLine(); 

	        char[][] map = new char[R][C];
	        System.out.println("ป้อนแผนที่ (ใช้ * สำหรับระเบิด, . สำหรับช่องว่าง) ทีละแถว:");
	        for (int i = 0; i < R; i++) {
	            System.out.print("แถวที่ " + i + ": ");
	            String line = scanner.nextLine();
	            for (int j = 0; j < C && j < line.length(); j++) {
	                map[i][j] = line.charAt(j);
	            }
	        }
	        
	        System.out.print("ป้อนแถวเป้าหมาย (targetR, เริ่มที่ 0): ");
	        int targetR = scanner.nextInt();
	        System.out.print("ป้อนคอลัมน์เป้าหมาย (targetC, เริ่มที่ 0): ");
	        int targetC = scanner.nextInt();
	        
	        checkTarget(R, C, map, targetR, targetC);

	        scanner.close();
	    }

	    public static void checkTarget(int R, int C, char[][] map, int targetR, int targetC) {
	        
	        if (targetR < 0 || targetR >= R || targetC < 0 || targetC >= C) {
	            System.out.println("Error: พิกัดเป้าหมายอยู่นอกขอบเขตของแผนที่");
	            return;
	        }

	        if (map[targetR][targetC] == '*') {
	            System.out.println("ผลลัพธ์: Mine");
	            return;
	        }

	        int mineCount = 0;

	        for (int dr = -1; dr <= 1; dr++) {
	            for (int dc = -1; dc <= 1; dc++) {
	                
	                if (dr == 0 && dc == 0) {
	                    continue; 
	                }

	                int checkR = targetR + dr; 
	                int checkC = targetC + dc; 

	                if (checkR >= 0 && checkR < R && checkC >= 0 && checkC < C) {
	                    
	                    if (map[checkR][checkC] == '*') {
	                        mineCount++;
	                    }
	                }
	            }
	        }

	        System.out.println("ผลลัพธ์: " + mineCount);
	    }
	}

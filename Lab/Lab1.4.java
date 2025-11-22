package Lab1;

import java.util.Scanner;
	
public class Lab1_4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int score = scanner.nextInt();

	        String grade;

	        if (score >= 80 && score <= 100) {
	            grade = "A";
	        } else if (score >= 70 && score <= 79) {
	            grade = "B";
	        } else if (score >= 60 && score <= 69) {
	            grade = "C";
	        } else if (score >= 50 && score <= 59) {
	            grade = "D";
	        } else if (score >= 0 && score <= 49) {
	            grade = "F";
	        } else {
	            grade = "Error"; 
	        }

	        System.out.println(grade);

	        scanner.close();
	    }
	}


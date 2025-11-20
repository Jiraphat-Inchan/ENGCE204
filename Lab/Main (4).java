import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนคะแนนสอบ (0-100): ");

        int score = scanner.nextInt();

        String grade;

      
        if (score >= 80 && score <= 100) {
            grade = "A";
        } else if (score >= 70 && score < 80) {
            grade = "B"; 
        } else if (score >= 60 && score < 70) {
            grade = "C"; 
        } else if (score >= 50 && score < 60) {
            grade = "D"; 
        } else if (score >= 0 && score < 50) {
            grade = "F";
        } else {
           
            grade = "คะแนนไม่ถูกต้อง (Score out of range)";
            System.out.println(grade);
            return;
        }
        
        System.out.println("คะแนนที่ป้อน: " + score);
        System.out.println("เกรดที่ได้: " + grade);
    }
}
import java.util.Scanner;

public class Main { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("กรุณาป้อนเลขจำนวนเต็ม 1 จำนวน: ");

        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("ผลลัพธ์: Even");
        } else {
            System.out.println("ผลลัพธ์: Odd");
        }

        scanner.close();
    }
}
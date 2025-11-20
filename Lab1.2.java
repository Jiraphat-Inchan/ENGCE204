import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนค่าความกว้าง (Width) ของสี่เหลี่ยมผืนผ้า (เป็นตัวเลขทศนิยม): ");
        double width = scanner.nextDouble(); 

        System.out.print("กรุณาป้อนค่าความสูง (Height) ของสี่เหลี่ยมผืนผ้า (เป็นตัวเลขทศนิยม): ");
        double height = scanner.nextDouble(); 

        double area = width * height;

        System.out.println("\n-------------");
        System.out.println("พื้นที่ของสี่เหลี่ยมผืนผ้า (Area): " + area);
        
        scanner.close();
    }

}

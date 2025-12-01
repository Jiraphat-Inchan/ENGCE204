package Lab;

import java.util.Scanner;

class Student {
	String studentId;
	String name;

    public void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}

public class Lab2_2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        String idInput = scanner.nextLine();
        String nameInput = scanner.nextLine();

        scanner.close();
        Student student = new Student();

        student.studentId = idInput;
        student.name = nameInput;

        student.displayInfo();
    }
}

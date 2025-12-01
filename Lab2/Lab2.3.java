package Lab;

import java.util.Scanner;

public class Lab2_3 {

    static class Student {
        String studentId;
        String name;

        public static int studentCount = 0; 
        public Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
            Student.studentCount++; 
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine(); 
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            
            String studentId = scanner.nextLine();           
            String name = scanner.nextLine(); 

            students[i] = new Student(studentId, name);
        }  
        
        System.out.println(Student.studentCount);
        
        scanner.close();
    }
}

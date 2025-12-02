package Lab;

import java.util.Scanner;

public class Lab2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String courseId = scanner.nextLine();
        String courseName = scanner.nextLine();
        String studentName = scanner.nextLine();

        Course course = new Course(courseId, courseName);
        Student student = new Student(studentName, course);

        student.displayEnrollment();

        scanner.close();
    }
}

class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;

    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

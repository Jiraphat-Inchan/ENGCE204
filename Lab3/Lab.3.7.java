package Lab;

import java.util.Scanner;

class Employee {
    private final String employeeId; 
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;        
    }
}

public class Lab3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeIdInput = scanner.nextLine();

        String initialDepartmentInput = scanner.nextLine();

        String newDepartmentInput = scanner.nextLine();      

        Employee emp = new Employee(employeeIdInput, initialDepartmentInput);

        emp.setDepartment(newDepartmentInput);
        
        System.out.println(emp.getEmployeeId()); 
        System.out.println(emp.getDepartment()); 

        scanner.close();
    }
}

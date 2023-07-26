package EmployeeInfo;

public class AbstractionDemo {
    public static void main(String[] args) {
        Employee contractor = new Contractor("contractor", 10, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println("contractor Salary : "+ contractor.calculateSalary());
        System.out.println("fullTimeEmployee : "+ fullTimeEmployee.calculateSalary());
    }
    
}

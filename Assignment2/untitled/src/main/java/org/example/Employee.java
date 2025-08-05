package org.example;

public class Employee extends AnotherPersonClass{
    int employeeId;
    double salary;

    Employee(int employeeId,String name, int age,double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary =salary;
    }

    void displayEmployeeDetails(){
        System.out.println("EmployeeId: " +employeeId);
        displayPersonDetails();
        System.out.println("salary: " +salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Sharmila",23,45000);
        employee.displayEmployeeDetails();
    }
}

/*Output
EmployeeId: 1
Name: Sharmila
Age: 23
salary: 45000.0
 */
package org.example;

public class Employee implements Taxable {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId =employeeId;
        this.name = employeeName;
        this.salary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double employeeTax = salary * incomeTax;
        System.out.println("Income Tax for employee " + name + " (ID: " + employeeId + "): $" + employeeTax);
    }
}

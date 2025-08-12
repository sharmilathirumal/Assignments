package org.example;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee id");
        int employeeId = s.nextInt();
        System.out.println("Enter employee name");
        String employeeName = s.nextLine();
        s.nextLine();
        System.out.println("Enter employee salary");
        double employeeSalary = s.nextDouble();
        Employee employee = new Employee(employeeId,employeeName,employeeSalary);
        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int productId = s.nextInt();
        System.out.print("Product Price: ");
        double productPrice = s.nextDouble();
        System.out.print("Product Quantity: ");
        int productQuantity = s.nextInt();

        Product product = new Product(productId, productPrice, productQuantity);

        System.out.println("Calculating Taxes:");
        employee.calcTax();
        product.calcTax();
        employee.calcTax();
        s.close();
    }
}
/*Output
Product Price: 100
Product Quantity: 2
Calculating Taxes:
Income Tax for employee  (ID: 1): $5250.0
Sales Tax for product (ID: 1): $140.0
 */
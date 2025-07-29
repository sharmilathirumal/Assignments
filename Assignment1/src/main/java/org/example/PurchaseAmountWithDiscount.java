package org.example;

import java.util.Scanner;

public class PurchaseAmountWithDiscount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount:");
        double amount = s.nextDouble();
        double payableAmount =0;
        if(amount>=500 && amount<=1000) payableAmount = amount - amount *0.1;
        else if(amount>1000) payableAmount =amount - amount *0.2;
        else  payableAmount =amount;
        System.out.println("You have to pay:"+payableAmount);
    }
}

/*output
Enter Amount:
2000
You have to pay:1600.0
 */
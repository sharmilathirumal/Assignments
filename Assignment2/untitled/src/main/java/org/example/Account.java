package org.example;

import java.util.Scanner;

public class Account {
    double balance;
    Account(){

    }

    Account(double balance){
        this.balance = balance;
    }

    void depositAmount(double amount){
        this.balance +=amount;
    }

    void withDrawAmount(double amount){
        this.balance -= amount;
    }

    double showBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account account = new Account(500);

        System.out.println("Current Balance: " +account.showBalance());
        System.out.println("Enter amount to add balance amount");
        account.depositAmount(s.nextDouble());
        System.out.println("Current Balance: " +account.showBalance());
        System.out.println("Enter amount to withdraw from balance amount");
        account.withDrawAmount(s.nextDouble());
        System.out.println("Current Balance: " +account.showBalance());
    }
}

/*OUTPUT
Current Balance: 500.0
Enter amount to add balance amount
500
Current Balance: 1000.0
Enter amount to withdraw from balance amount
200
Current Balance: 800.0
 */
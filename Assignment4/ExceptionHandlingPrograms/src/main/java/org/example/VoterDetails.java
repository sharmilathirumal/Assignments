package org.example;

import java.util.Scanner;

public class VoterDetails {
    static int id =1;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("*****WELCOME******");
        System.out.println("do you want to add the person in voter list");
        String s1= s.next();
        do {
            if(s1.equals("yes")) {
                System.out.println("Enter the voter name:");
                String name =s.nextLine();
                s.nextLine();
                System.out.println("Enter the voter age:");
                int age = s.nextInt();

                try {
                    new Voter(id,name,age);
                }catch(VoterException e) {
                    System.out.println("Error:"+e.getMessage());
                }
            }
            id++;
            System.out.println("you want to continue:");
            s1=s.next();

        }while(s1.equals("yes"));

    }
}

/*
OUTPUT
*****WELCOME******
do you want to add the person in voter list
yes
Enter the voter name:
sharmila
Enter the voter age:
12
Error:invalid age for voter
you want to continue:
yes
Enter the voter name:
sharila
Enter the voter age:
19
you want to continue:
no

 */
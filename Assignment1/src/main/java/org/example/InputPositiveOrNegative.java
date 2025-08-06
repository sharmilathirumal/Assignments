package org.example;

import java.util.Scanner;

public class InputPositiveOrNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int givenNumber =s.nextInt();
        if(givenNumber>=0) System.out.println("Positive");
        else System.out.println("Negative");
    }
}

/*Output
Enter number:
200
Positive
 */
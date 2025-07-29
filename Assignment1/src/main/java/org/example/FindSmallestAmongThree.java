package org.example;

import java.util.Scanner;

public class FindSmallestAmongThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber =s.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber =s.nextInt();
        System.out.println("Enter Third Number");
        int thirdNumber =s.nextInt();

        if(firstNumber<secondNumber && firstNumber<thirdNumber) System.out.println("The smallest number is:"+firstNumber);
        else if(secondNumber<firstNumber && firstNumber<thirdNumber) System.out.println("The smallest number is:"+secondNumber);
        else System.out.println("The smallest number is:"+thirdNumber);
    }
}

/*output
Enter First Number
10
Enter Second Number
200
Enter Third Number
1
The smallest number is:1

 */
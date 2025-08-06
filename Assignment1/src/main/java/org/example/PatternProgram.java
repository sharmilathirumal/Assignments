package org.example;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        for (int i = n; i > 0; i--)
        {
            for (int j = n; j > i; j--)
                System.out.print(j);

            for (int j = i; j > 0; j--)
                System.out.print(i);

            System.out.println();
        }

    }
}

/*output
Enter number:
5
55555
54444
54333
54322
54321
 */

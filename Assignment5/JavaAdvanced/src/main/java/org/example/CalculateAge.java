package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your birth date: ");
        String input = s.nextLine();
        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate,currentDate);
        System.out.println("Your age is: "
                + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");
    }
}

/*OUTPUT
Enter your birth date:
2001-10-09
Your age is: 23 years, 10 months, and 18 days.
 */
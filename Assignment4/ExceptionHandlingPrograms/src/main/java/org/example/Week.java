package org.example;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        String[] daysInWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner s = new Scanner(System.in);
        boolean choice =true;
        while(choice){
            System.out.println("Enter number between 0 to 6 to see the days of the week");
            int i=s.nextInt();
            try{
                if(i<0||i>6){
                    throw new ArrayIndexOutOfBound("Invalid Index...\n Please enter number between 0 to 6");
                }
                System.out.println("The day of week is: "+ daysInWeek[i]);
            } catch (ArrayIndexOutOfBound e) {
                System.out.println("Error: "+ e.getMessage());
            }
            System.out.println("do you want to continue");
            String c = s.next();
            if(!c.equals("yes")) choice =false;
        }
    }
}

/*OUTPUT
Enter number between 0 to 6 to see the days of the week
0
The day of week is: Sunday
do you want to continue
yes
Enter number between 0 to 6 to see the days of the week
1
The day of week is: Monday
do you want to continue
yes
Enter number between 0 to 6 to see the days of the week
6
The day of week is: Saturday
do you want to continue
yes
Enter number between 0 to 6 to see the days of the week
-1
Error: Invalid Index...
 Please enter number between 0 to 6
do you want to continue
yes
Enter number between 0 to 6 to see the days of the week
100
Error: Invalid Index...
 Please enter number between 0 to 6
do you want to continue
yes
Enter number between 0 to 6 to see the days of the week
7
Error: Invalid Index...
 Please enter number between 0 to 6
do you want to continue
no

 */
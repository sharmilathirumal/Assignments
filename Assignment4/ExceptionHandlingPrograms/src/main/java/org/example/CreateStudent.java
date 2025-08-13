package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateStudent {
    static int rollNumber =1;
    static int nameCount;
    static int ageCount;
    public static void main(String[] args) throws AgeNotWithinRange, NameNotValidException {

        Scanner s = new Scanner(System.in);
        System.out.println("do you want to add the student details");
        String choice = s.next();
        if (choice.equals("yes")) {
            String name = "";
            int age;
            String course ="";
            List<Student> list = new ArrayList<>();
            do {
                nameCount = 0;
                ageCount = 0;
                System.out.println("please enter the student Name:");
                name = s.next();
                System.out.println("please enter the student Age:");
                age = s.nextInt();
                System.out.println("please enter the student course:");
                course = s.next();
                try {
                    new Student(rollNumber,name,age,course);
                }catch (AgeNotWithinRange | NameNotValidException e) {
                    System.out.println("Error:"+e.getMessage());
                }
                System.out.println("do you want to to continue:?");
                choice = s.next();
                if(nameCount >0 && ageCount >0) {
                    list.add(new Student(rollNumber,name,age,course));
                    rollNumber++;
                }
            } while (choice.equals("yes"));

            System.out.println("The student list is:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Roll no:" + " " + ":" + " " + list.get(i).roleNo);
                System.out.println("Student name" + " " + ":" + " " + list.get(i).name);
                System.out.println("Student age" + " " + ":" + " " + list.get(i).age);
            }
        }
    }
}

/*OUTPUT
do you want to add the student details
yes
please enter the student Name:
sharmy
please enter the student Age:
23
please enter the student course:
CSE
Error:student age not within range
do you wanto to continue:?
yes
please enter the student Name:
Sharmy1
please enter the student Age:
21
please enter the student course:
CSE
Error:name should only contain characters
do you wanto to continue:?
yes
please enter the student Name:
Sharmy@
please enter the student Age:
16
please enter the student course:
CSE
Error:name should only contain characters
do you wanto to continue:?
yes
please enter the student Name:
Sharmy
please enter the student Age:
11
please enter the student course:
IT
Error:student age not within range
do you wanto to continue:?
yes
please enter the student Name:
Sharmy
please enter the student Age:
15
please enter the student course:
CSE
do you wanto to continue:?
no
The student list is:
Roll no: : 1
Student name : Sharmy
Student age : 15
 */
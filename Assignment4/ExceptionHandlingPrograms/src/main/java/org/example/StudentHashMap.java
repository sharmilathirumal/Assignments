package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    HashMap<String,Integer> students = new HashMap<>();
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        StudentHashMap studentHashMap = new StudentHashMap();
        String wantToContinue;
        do {
            System.out.println("enter your choice \n1.add a student \n2.remove a student \n3.Display a student");
            int choice = s.nextInt();
            switch(choice) {
                case 1:{
                    System.out.println("Enter student name");
                    String name = s.next();
                    System.out.println("Enter student grade");
                    int grade = s.nextInt();
                   studentHashMap.createStudent(name,grade);
                    break;
                }
                case 2:{
                    System.out.println("the student details is:");
                    studentHashMap.displayStudents();
                    System.out.println("Enter student name :");
                    String name = s.next();
                    studentHashMap.removeStudent(name);
                    break;
                }
                case 3:
                    System.out.println("available student list:");
                    studentHashMap.displayStudents();
                    break;
                case 4:
                    break;
            }
            System.out.println("do you want to continue");
            wantToContinue = s.next();
        }while(wantToContinue.equals("yes"));


    }

    public void createStudent(String studentName,int grade){
        students.put(studentName,grade);
    }

    public void removeStudent(String studentName){
        students.remove(studentName);
    }

    public void displayStudents(){
        for(Map.Entry<String,Integer> map :students.entrySet()){
            System.out.println("Student Name: " +map.getKey());
            System.out.println("Student Grade: "+map.getValue());
        }
    }
}

/* Output
enter your choice
1.add a student
2.remove a student
3.Display a student
1
Enter student name
Sharmila
Enter student grade
1
do you want to continue
yes
enter your choice
1.add a student
2.remove a student
3.Display a student
1
Enter student name
Rogini
Enter student grade
2
do you want to continue
yes
enter your choice
1.add a student
2.remove a student
3.Display a student
1
Enter student name
Naveena
Enter student grade
3
do you want to continue
yes
enter your choice
1.add a student
2.remove a student
3.Display a student
1
Enter student name
iniya
Enter student grade
2
do you want to continue
yes
enter your choice
1.add a student
2.remove a student
3.Display a student
2
the student details is:
Student Name: Rogini
Student Grade: 2
Student Name: iniya
Student Grade: 2
Student Name: Naveena
Student Grade: 3
Student Name: Sharmila
Student Grade: 1
Enter student name :
iniya
do you want to continue
yes
enter your choice
1.add a student
2.remove a student
3.Display a student
3
available student list:
Student Name: Rogini
Student Grade: 2
Student Name: Naveena
Student Grade: 3
Student Name: Sharmila
Student Grade: 1
do you want to continue
no
*/
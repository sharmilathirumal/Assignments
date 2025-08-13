package org.example;

public class Student {
    int roleNo;
    String name;
    int age;
    String course;

    public Student(int roleNo, String name, int age, String course) throws AgeNotWithinRange, NameNotValidException {
        if(age<15 ||age >21){
            throw new AgeNotWithinRange("student age not within range");
        }
        if(!name.matches("^[a-zA-Z]+$")){
            throw new NameNotValidException("name should only contain characters");
        }
        this.roleNo = roleNo;
        this.name = name;
        this.age = age;
        this.course = course;
        CreateStudent.nameCount++;
        CreateStudent.ageCount++;
    }
}

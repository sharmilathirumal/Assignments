package org.example;

public class AnotherPersonClass {
    String name;
    int age;

    AnotherPersonClass(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

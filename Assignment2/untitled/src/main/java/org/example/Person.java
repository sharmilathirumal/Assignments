package org.example;

public class Person {
    String name;
    int age;

    Person(String name){
        this.name = name;
        this.age = 18;
    }

    Person(String name,int age){
        this.name = name;
        this.age =age;
    }

    public void displayPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sharmila");
        Person p2 = new Person("Senthamizh",20);
        p1.displayPersonDetails();
        p2.displayPersonDetails();
    }
}

/*Output
Name: Sharmila
Age: 18
Name: Senthamizh
Age: 20
 */
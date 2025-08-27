package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartsWithA {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "Arun", "Bala", "Anita", "Kiran", "Ajay",
                "Sita", "Amrita", "Ravi", "Asha", "Divya"
        );

        List<String> nameStartsWithA = students.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(nameStartsWithA);
    }
}

/*OUTPUT
[Arun, Anita, Ajay, Amrita, Asha]
 */
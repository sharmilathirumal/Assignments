package org.example;

import java.util.stream.Stream;

public class StringToUpperCase {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("aBc","d","ef");
        s.map(String::toUpperCase).forEach(System.out::println);
    }
}

/*OUTPUT
ABC
D
EF
 */
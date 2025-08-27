package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintListOfNonEmptyString {
    public static void main(String[] args) {
        List<String>  list = Arrays.asList("abc","","bc","efg","abcd","jkl");
        List<String> nonEmpty = list.stream().filter(l->!l.isEmpty()).collect(Collectors.toList());
        System.out.println(nonEmpty);
    }
}

/*OUTPUT
[abc, bc, efg, abcd, jkl]
 */
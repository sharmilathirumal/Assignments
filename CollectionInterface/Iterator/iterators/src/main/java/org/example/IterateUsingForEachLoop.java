package org.example;

import java.util.ArrayList;
import java.util.List;

public class IterateUsingForEachLoop {
    public static void main(String[] args) {
        /*
        for each loop introduced in java 5 and it is used to iterate the arrays and collection
         */
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);

        for(Integer i:l){
            System.out.println(i);
        }

        /*
        The for-each loop gives a copy of each element, not a reference. So modifying the loop variable (num in this case)
        does not affect the actual array or collection. For objects, the loop variable is a reference,
        so modifying fields of the object will affect the original.
         */

    }
}

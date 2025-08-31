package org.example;

import java.util.ArrayList;
import java.util.List;

public class UsingListInterface {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(22);
        l.add(43);
        l.add(7);
        l.add(10);
        System.out.print("current list: ");
        System.out.println(l);
        List<Integer> m = new ArrayList<>();
        m.add(5);
        m.add(6);
        m.add(9);
        l.add(100);//to add element in collection
        System.out.print("list after adding one element: ");
        System.out.println(l);
        System.out.print("list after adding a list: ");
        l.addAll(m);//to add another collection to current collection
        System.out.println(l);
        l.remove(5);
        System.out.print("list after removing the element 100: ");
        System.out.println(l);
        l.removeAll(m);
        System.out.print("list after removed the collection m: ");
        System.out.println(l);
        l.addAll(m);
        l.retainAll(m);
        System.out.print("list after retain the elements from m: ");
        System.out.println(l);
        l.clear();
        System.out.print("list after clearing all elements: ");
        System.out.println(l);
        l.add(1);
        l.add(22);
        l.add(43);
        l.add(7);
        l.add(10);
        System.out.print("again adding elements to list: ");
        System.out.println(l);
        System.out.println("the size of the list is: "+l.size());
        System.out.println("checking the given collection is empty or not: "+l.isEmpty());
        System.out.println("checking the given list contain element 2: "+ l.contains(2));
        System.out.println("checking the give list contains the list m: "+ l.containsAll(m));
        l.addAll(m);
        System.out.println("again checking the given list contains the list m after added it to the list l: "+l.containsAll(m));
        System.out.println("iterate elements in list l");
        System.out.println(l.iterator());
    }
}

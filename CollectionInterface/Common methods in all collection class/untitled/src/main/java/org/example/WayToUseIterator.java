package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WayToUseIterator {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);

        Iterator<Integer> iterator = l.iterator();
       // System.out.println(iterator);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
           // iterator.remove();
        }
        /*the below code print nothing because The iterator is a one-time-use cursor.an iterator itself cannot be reset.
        If you want to start again from the beginning, you need to create a new iterator from the collection
        An iterator is meant to be lightweight, forward-only, one-pass traversal.
        If you need restarting or jumping, you use:
        Recreate iterator (start over)
        ListIterator (allows moving forward & backward for Lists only)
        Streams (can be re-obtained anytime from the collection)
        1. Iterator
        One-time use only:
        Once you start iterating and reach the end, you can’t go back or reuse it.
        Forward-only:
        You can only move from start → end using hasNext() + next().
        Operations allowed:
        hasNext()
        next()
        remove() (optional, safe way to delete while iterating)
         */
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
        }

    }
}

package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*1. Iterator
        **In Java, Iterator is an interface in the java.util package that provides a way to traverse (iterate)
         elements of a collection one by one.**
        One-time use only:
        Once you start iterating and reach the end, you can’t go back or reuse it.
        Forward-only:
        You can only move from start → end using hasNext() + next().
        Operations allowed:
        hasNext()
        next()
        remove() (optional, safe way to delete while iterating)*/
public class IteratorInterface {
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
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*the below code print nothing because The iterator is a one-time-use cursor.an iterator itself cannot be reset.
        If you want to start again from the beginning, you need to create a new iterator from the collection
        An iterator is meant to be lightweight, forward-only, one-pass traversal.
        If you need restarting or jumping, you use:
        Recreate iterator (start over)
        ListIterator (allows moving forward & backward for Lists only)
        Streams (can be re-obtained anytime from the collection)
         */
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //we need to create another iterator to iterate the list
        Iterator<Integer> iterator1 = l.iterator();
        //we can re-assign the same variable like this
        iterator =l.iterator();

        //below code remove element from the list l using remove method in iterator
        iterator=l.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(1)){
                iterator.remove();
            }
        }

        System.out.println(l);
        /*NOTE we cannot remove elements directly from the collection while iterating and we can remove the element while iterate it using iterator
        Wrong way:
        ----------
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));
        for (String val : list) {
        if (val.equals("B")) {
        list.remove(val);   // ❌ ConcurrentModificationException
        }
        }

        Correct way:
        -----------
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
        String val = it.next();
        if (val.equals("B")) {
        it.remove();  // ✅ SAFE removal Here, it.remove() not only removes the element from the collection but also updates the iterator’s internal state (cursor + expectedModCount).
        }
        }

        Iterator’s fail-fast behavior
        Most Java collections (like ArrayList, HashMap, etc.) use fail-fast iterators.
        Each collection maintains an internal counter called modCount (modification count).
        When you create an iterator, it stores a snapshot of this modCount.
        If the collection is structurally modified (like add, remove, clear) without using the iterator itself, the iterator detects that modCount has changed → throws ConcurrentModificationException.

        In Iterator or ListIterator, IllegalStateException occurs when you call a modifying method (remove() or set()) without first calling next() or previous().
        */
    }
}

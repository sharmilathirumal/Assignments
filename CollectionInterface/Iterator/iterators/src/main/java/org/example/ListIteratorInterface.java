package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {
    public static void main(String[] args) {
        /*1) ListIterator is one of the four cursor in java.it is used to traverse all type of lists including
        ArrayList,LinkedList,Vector,Stack.
         2)this interface extends the Iterator interface
         3)available since java 1.2
         4)it provide both forward and backward traversal
         5)it supports all CRUD operation(Create,Read,Update,Delete) operations
         6)There is no current element in ListIterator the cursor always lies between previous and next element
         7)for a list of n length, there are n+1 possible cursors
         8)Syntax - public interface ListIterator<E> extends Iterator<E>
         9)this is in java.util.ArrayList package
         10)It works only with classes that implement the List interface
         11)ArrayList,LinkedList,Vector,Stack these are the only collections list we can use the ListIterator
         Methods:hasNext(),next(),nextIndex(),hasPrevious(),previous(),previousIndex(),add(),set(),remove()
         */
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        ListIterator<Integer> iterator = l.listIterator();
        //forward trace
        System.out.println("Forward Trace");
        while (iterator.hasNext()){
            System.out.print("the next index is:" + iterator.nextIndex() +" and the value is: ");
            System.out.println(iterator.next());

        }
        iterator.add(100);//element added at last because the iterator pointer pointing last element It inserts the element immediately before the element that would be returned by next(). Or, equivalently: it inserts immediately after the element that was returned by previous().
        //backward trace
        System.out.println("Backward trace");
        while (iterator.hasPrevious()){
            System.out.print("the previous index is:" + iterator.previousIndex()+" and the value is: ");
            System.out.println(iterator.previous());
        }
        System.out.println("list values before do CRUD operation" +l);
        //update element in list
        iterator.set(10);
        System.out.println("list values after updating the first element with 10: "+l);//it update the first element because the iterator pointer currently point to first element
        //add element in list
        iterator.add(100);
        System.out.println("list values after adding elements at first"+l);
        //uncomment below code to check the behavior
        /*iterator.set(10);/*this will throw IllegalState Exception because set(E e) modifies the last element returned by next() or previous().
                            remove() removes the last element returned by next() or previous(). If no such element exists (meaning you haven’t called next()/previous(), or you just called add()), then the iterator doesn’t have a "current element", and Java throws IllegalStateException.
                            here we add elements so cursor is between element not on any element so this will throw exception*/
       // System.out.println(l);

        while(iterator.hasNext()){
            iterator.next();
        }
        iterator.remove();
        System.out.println("list after removing last element: "+ l);
        iterator.add(100);
        System.out.println("list after adding 100 at last: "+l);
        //uncomment below code to check the behavior
        /*iterator.remove();/*this will throw IllegalState Exception because set(E e) modifies the last element returned by next() or previous().
                            remove() removes the last element returned by next() or previous(). If no such element exists (meaning you haven’t called next()/previous(), or you just called add()), then the iterator doesn’t have a "current element", and Java throws IllegalStateException.
                            here we add elements so cursor is between element not on any element so this will throw exception*/
    }
}

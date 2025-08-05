package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        System.out.print("Enter string:");
        StringBuilder sb = new StringBuilder();
        sb.append(s.next());
        System.out.println("Reverse String of given value is: " +sb.reverse().toString());
        */
        System.out.print("Enter string:");
        String input = s.next();
        String output = "";
        for(int i=input.length()-1;i>=0;i--){
            output +=input.charAt(i);
        }
        //System.out.println(input);
        System.out.println("Reverse String of given value is: " +output);
    }
}

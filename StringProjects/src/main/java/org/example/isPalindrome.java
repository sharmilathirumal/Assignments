package org.example;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*System.out.print("Enter string:");
        StringBuilder sb = new StringBuilder();
        sb.append(s.next());
        if(sb.toString().equals(sb.reverse().toString())) System.out.println("Given string is Palindrome");
        else System.out.println("Given string is not a palindrome");*/
        System.out.print("Enter string:");
        String input = s.next();
        String output = "";
        for(int i=input.length()-1;i>=0;i--){
            output +=input.charAt(i);
        }
        System.out.println(input);
        System.out.println(output);
        if(input.equals(output)) System.out.println("Given string is palindrome");
        else System.out.println("Given string is not a palindrome");
    }
}

package org.example;

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string:");
        String input = s.next();
        boolean isRepeatingCharacter = false;
        for(int i=0;i<input.length();i++){
            if(input.lastIndexOf(input.charAt(i)) !=input.indexOf(input.charAt(i))){
                System.out.println("Given String have repeating characters");
                isRepeatingCharacter = true;
                break;
            }
        }
        if(!isRepeatingCharacter) System.out.println("Given string have unique characters");
    }
}

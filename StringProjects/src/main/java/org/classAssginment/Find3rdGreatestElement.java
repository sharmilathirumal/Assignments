package org.classAssginment;

import java.util.Scanner;

public class Find3rdGreatestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int len =s.nextInt();
        System.out.println("Enter array values");
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = s.nextInt();
        }
        int firstValue = Integer.MIN_VALUE;
        int secondValue = Integer.MIN_VALUE;
        int thirdValue = Integer.MIN_VALUE;

        for(int num :arr){
            if(num>firstValue){
                thirdValue =secondValue;
                secondValue=firstValue;
                firstValue=num;
            }else if(num>secondValue &&num !=firstValue){
                thirdValue = secondValue;
                secondValue= num;
            }else if ((num>thirdValue &&num !=secondValue &&num!=firstValue)){
                thirdValue = num;
            }
        }

        System.out.println("The Greatest third value is "+thirdValue);
    }
}

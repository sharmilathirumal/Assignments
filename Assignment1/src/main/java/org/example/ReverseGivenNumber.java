package org.example;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        int val = 896;
        int result =0;
        while(val>0){
            int num = val%10;
            result =result*10 +num;
            val/=10;
        }
        System.out.println(result);
    }
}

/*output
698
 */
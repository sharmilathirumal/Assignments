package org.example;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int count =1;
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            if(i==1 ||i==n){
                for(int j=1;j<=2*i-j;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int j=1;j<=2*i-3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                //count+=2;
            }

            System.out.println();
        }
    }
}

package org.example;

public class RotateArrayByGivenKey {
    public static void main(String[] args) {
        int k=3;
        int[] arr = {1,2,3,4,5,6,7};
        int l=0;
        int r= arr.length-1;
        rotate(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] a, int k){
        int n= a.length;
        k=k%n;
        reverse(a, 0, n - 1);
        reverse(a, 0, k-1);
        reverse(a, k, n - 1);

    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

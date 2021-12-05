package Java.W_ExtraQuestion;

import java.util.Scanner;

public class C_MaxOrMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Min number is " +getMin(array,n));
        System.out.println("Max number is "+getMax(array,n));
    }

    static int getMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] <min){
                min = arr[i];
            }
        }
        return min;
    }
    static int getMax(int[] arr, int n){
        int max = arr[0];
        for (int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
/*
you can also use the inbuilt function
 */
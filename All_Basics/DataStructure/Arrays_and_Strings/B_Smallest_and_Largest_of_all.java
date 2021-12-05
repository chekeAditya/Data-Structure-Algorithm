package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class B_Smallest_and_Largest_of_all {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}

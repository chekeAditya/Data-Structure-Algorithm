package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Three_Max_Three_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[6];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
//        res(n, arr, brr);
    }


    static void res(int n,int[] arr){

    }


/*
    static void res(int n, int[] brr, int[] arr) {
        int m = 0;
        int small = 0, large = 3;
        int count = 0;
        Arrays.sort(arr);

        if (n >= 6) {
            for (int i = 0; i < n; i++) {
                if (m != 3)
                    if (brr[i] == brr[i + 1]) {
                        brr[small] = brr[i];
                        small++;
                        i++;
                        m++;
                        count++;
                    } else if (brr[i + 1] != brr[i]) {
                        brr[small] = brr[i];
                        small++;
                        m++;
                        count++;
                    }
            }

            if (count == 3) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(brr[i] + " ");
                }
            } else {
                System.out.println("Not Possible");
            }

            System.out.println();
            for (int i = n - 1; i > 0; i--) {
                if (m != 0)
                    if (brr[i] == brr[i - 1]) {
                        brr[large] = brr[i];
                        large++;
                        i++;
                        m--;
                        count--;

                    } else if (brr[i - 1] != brr[i]) {
                        brr[large] = brr[i];
                        large++;
                        m--;
                        count--;

                    }
            }

            if (count == 0) {
                for (int i = 6 - 1; i > 2; i--) {
                    System.out.print(brr[i] + " ");
                }
            } else {
                System.out.println("Not Possible");
            }

        } else {
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }
    }

 */
}
/*
7, 7, 12, 98, 106]
 */

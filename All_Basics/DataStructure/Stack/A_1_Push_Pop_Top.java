package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A_1_Push_Pop_Top {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            System.out.println(t);
        }
    }
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            if (n == 1) {
//                int[] arr = new int[n];
//                for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
//                res(n, arr);
//            }
//        }
//    }

//    static void res(int n, int[] arr) {
//        int top = -1;
//        for (int i = 0; i < n; i++) {
//            if (i == 1) {
//                push(arr, i, top);
//            } else if (i == 2) {
//                pop(top, arr);
//            } else if (i == 3) {
//                print(top, arr);
//            }
//        }
//    }
//
//    static void push(int[] arr, int i, int top) {
//        top++;
//        arr[top] = arr[i];
//    }
//
//    static void pop(int top, int[] arr) {
//        if (top == -1) {
//            System.out.println("Empty!");
//        } else {
//            System.out.println(arr[top]);
//        }
//    }
//
//    static void print(int top, int[] arr) {
//        if (top == -1) System.out.println("Empty!");
//        else System.out.println(arr[top]);
//    }
}

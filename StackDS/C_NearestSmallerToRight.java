package Basic_To_Advanced_DataStructure.StackDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class C_NearestSmallerToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        nearestSmaller(arr);
    }

    static void nearestSmaller(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (stack.size() == 0)
                arrayList.add(-1);
            else if (arrayList.size() > 0 && stack.peek() < arr[i])
                arrayList.add(stack.peek());
            else if (stack.size() > 0 && stack.peek() >= arr[i])
                while (stack.size() > 0 && stack.peek() <= arr[i]) {
                    stack.pop();
                    if (stack.size() == 0)
                        arrayList.add(-1);
                    else
                        arrayList.add(stack.peek());
                }
            stack.push(arr[i]);
        }
        Collections.reverse(arrayList);
      for (Integer i : arrayList){
          System.out.print(i + " ");
      }
    }
}
/*
4
4 5 2 10 8
 */

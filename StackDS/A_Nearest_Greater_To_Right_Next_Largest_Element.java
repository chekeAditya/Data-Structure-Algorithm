/**
 * It also considers if the input has duplicate elements.
 * Example: 1 3 0 0 2 2 4
 * Output   : 3 4 2 2 4 4 -1
 */

package Basic_To_Advanced_DataStructure.StackDS;

import java.util.*;

public class A_Nearest_Greater_To_Right_Next_Largest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        res(n, arr);
    }

    static void res(int n, int[] arr) {
        if (arr.length == 0)
            return;
        Stack<Integer> stack = new Stack();
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(-1);
                stack.push(arr[i]);
            } else if (!stack.isEmpty() && stack.peek() > arr[i]) {
                list.add(stack.peek());
                stack.push(arr[i]);
            } else if (!stack.isEmpty() && stack.peek() <= arr[i]) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    list.add(-1);
                else {
                    list.add(stack.peek());

                    stack.push(arr[i]);
                }
            }
        }
        for (Integer ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
        Collections.reverse(list);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
/*
4
1 3 2 4
 */

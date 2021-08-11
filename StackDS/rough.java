package Basic_To_Advanced_DataStructure.StackDS;

import java.util.*;

public class rough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        printNextLargestElement(arr);
    }

    public static void printNextLargestElement(int[] arr) {
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

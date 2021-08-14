package Basic_To_Advanced_DataStructure.StackDS;

import java.util.*;

public class B_NearestGreaterToLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        printNextGreaterToLeft(arr);
    }

    static void printNextGreaterToLeft(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty())
                arrayList.add(-1);
            else if (stack.size() > 0 && stack.peek() > arr[i])
                arrayList.add(stack.peek());
            else if (stack.size() > 0 && stack.peek() < arr[i])
                while (stack.size() > 0 && stack.peek() < arr[i]) {
                    stack.pop();
                }
            if (stack.size() == 0) //stack.isEmpty
                arrayList.add(-1);
            else
                arrayList.add(stack.peek());
            stack.push(arr[i]);
        }
        for (int i : arrayList)
            System.out.print(i + " ");
    }
}
/*
4
1 3 2 4
 */
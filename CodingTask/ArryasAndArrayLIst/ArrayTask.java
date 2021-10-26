package Basic_To_Advanced_DataStructure.CodingTask.ArryasAndArrayLIst;

import java.util.ArrayList;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        removeElementAt_0(arr);
        System.out.println("----------");
        removeElementAt_n1(arr);
        System.out.println("----------");
        removeElementAt_3(arr);
    }

    static void removeElementAt_0(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void removeElementAt_n1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void removeElementAt_3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 3) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void printAllElement() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        printingAllElementOfArray(arrayList);
        System.out.println("-----------------------");


    }

    static void printingAllElementOfArray(ArrayList<Integer> arrayList) {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
    }

    static void printElementWhoseLengthIsGreaterThan5(ArrayList<Integer> arrayList) {

    }
}

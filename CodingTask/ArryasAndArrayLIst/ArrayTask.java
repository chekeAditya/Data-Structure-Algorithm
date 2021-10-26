package Basic_To_Advanced_DataStructure.CodingTask.ArryasAndArrayLIst;

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
}

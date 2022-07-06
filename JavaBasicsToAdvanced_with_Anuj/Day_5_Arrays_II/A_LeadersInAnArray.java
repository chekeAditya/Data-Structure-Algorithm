package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_5_Arrays_II;

public class A_LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 3};
        leadersInAnArray(arr);
    }

    static void leadersInAnArray(int[] arr) {
        int largest = Integer.MIN_VALUE, i = 0, n = arr.length;
        int[] newArr = new int[n];
        int j = 0;
        for (i = n - 1; i >= 0; i--) {
            if (arr[i] > largest) {
                largest = arr[i];
                System.out.print(arr[i] + " "); //UnReversed Array
                newArr[j++] = arr[i];
            }
        }

        //Reversed Array
        for (j = j - 1; j >= 0; j--) {
            System.out.print(newArr[j] + " ");
        }
    }
}

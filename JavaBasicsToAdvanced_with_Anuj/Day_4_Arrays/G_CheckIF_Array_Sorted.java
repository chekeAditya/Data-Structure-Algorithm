package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class G_CheckIF_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1};
        if (checkArraySorted(arr)) System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }

    private static boolean checkArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    //TC = O(n) SC = O(1)
}

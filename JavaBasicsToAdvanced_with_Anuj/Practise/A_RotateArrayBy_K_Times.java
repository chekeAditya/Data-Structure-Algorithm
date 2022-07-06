package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Practise;

public class A_RotateArrayBy_K_Times {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr, 2);
    }

    private static void rotateArray(int[] arr, int key) {
        int n = arr.length, start = 0;
        while (start < key) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = last;
            start++;
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    } //TC -> O(N*key) , SC -> O(1)

}

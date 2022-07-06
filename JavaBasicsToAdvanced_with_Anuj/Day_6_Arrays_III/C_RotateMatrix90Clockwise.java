package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_6_Arrays_III;

public class C_RotateMatrix90Clockwise {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printMatrix(arr);
        System.out.println();
        transposeOfMatrix(arr);
        rotateMatrix(arr);
        printMatrix(arr);
    }

    private static void rotateMatrix(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int swap = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = swap;
            }
        }
    }

    private static void transposeOfMatrix(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int swap = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = swap;
            }
        }
    }

    private static void printMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

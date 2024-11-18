package Basic_To_Advanced_DataStructure.codeForces;

import java.util.Scanner;

public class A_Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 5;
        int n = 5;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        getCount(arr, m, n);
    }

    private static void getCount(int[][] arr, int m, int n) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    swapRow(arr, i, j, count);
                }
            }
        }
    }

    private static void swapRow(int[][] arr, int i, int j, int count) {
        if (i > 2) {
            int temp = arr[i][j];
            arr[i][j] = arr[i - 1][j];
            arr[i - 1][j] = temp;
        } else if (i < 2) {
            int temp = arr[i][j];
            arr[i][j] = arr[i + 1][j];
            arr[i + 1][j] = temp;
        } else {
            swapColumn(arr, i, j, count);
        }
    }

    private static void swapColumn(int[][] arr, int i, int j, int count) {
        if (j > 2) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][j - 1];
            arr[i][j - 1] = temp;
        } else if (j < 2) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][j + 1];
            arr[i][j + 1] = temp;
        } else {
            System.out.println(count);
        }
    }
}



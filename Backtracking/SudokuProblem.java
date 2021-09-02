package Basic_To_Advanced_DataStructure.Backtracking;

import java.util.Scanner;

public class SudokuProblem {
    static int n = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        if (res(arr, 0, 0)) printingSudoku(arr);
        else System.out.println("-1");

    }

    private static void printingSudoku(int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    static boolean res(int[][] arr, int row, int col) {
        if (row == n - 1 && col == n)
            return true;
        if (col == n) {
            row++;
            col = 0;
        }
        if (arr[row][col] != 0)
            return res(arr, row, col + 1);

        for (int number = 1; number < 10; number++) {
            if (isValid(arr, row, col, number)) {
                arr[row][col] = number;


                if (res(arr, row, col + 1))
                    return true;
            }
        }
        arr[row][col] = 0;
        return false;
    }

    static boolean isValid(int[][] arr, int row, int col, int number) {
//row
        for (int j = 0; j <= n - 1; j++) {
            if (arr[row][j] == number) return false;
        }
//column
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i][col] == number) return false;
        }
//3*3 Box check
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[startRow + i][startCol + j] == number) return false;
            }
        }
        return true;
    }
}

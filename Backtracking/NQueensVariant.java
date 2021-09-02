package Basic_To_Advanced_DataStructure.Backtracking;

import java.util.Scanner;

public class NQueensVariant {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];

        nQueen(chess, 0);
        System.out.println(count);
    }

    private static void nQueen(int[][] chess, int row) {
        if (row >= chess.length) count++;
        else {
            for (int col = 0; col < chess.length; col++) {
                if (isQueensafe(chess, row, col)) {
                    chess[row][col] = 1;
                    nQueen(chess, row + 1);
                    chess[row][col] = 0;
                }
            }
        }
    }

    private static boolean isQueensafe(int[][] chess, int row, int col) {
        //vertical diag
        for (int i = row - 1, j = col; i >= 0; i--)
            if (chess[i][j] == 1) return false;

        //left diag
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (chess[i][j] == 1) return false;

        //right diag
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++)
            if (chess[i][j] == 1) return false;
        return true;
    }
}

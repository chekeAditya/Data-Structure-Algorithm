package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_3;

import java.util.Arrays;
import java.util.Scanner;

public class RowGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    arr[i][j] = scanner.nextInt();
            }
            System.out.println(res(n,m,arr));
        }
    }


    static int res(int n, int m, int[][] mat) {
        sortRows(mat, n);
        int[] curr_index = new int[n];
        int f = 0;
        for (; curr_index[0] < n; curr_index[0]++) {
            int value = mat[0][curr_index[0]];
            boolean present = true;
            for (int i = 1; i < n; i++) {
                while (curr_index[i] < n &&
                        mat[i][curr_index[i]] <= value)
                    curr_index[i]++;
                if (mat[i][curr_index[i] - 1] != value)
                    present = false;
                if (curr_index[i] == n) {
                    f = 1;
                    break;
                }
            }
            if (present)
                return value;
            if (f == 1)
                break;
        }
        return -1;
    }

    public static void sortRows(int[][] mat, int n) {
        for (int i = 0; i < n; i++)
            Arrays.sort(mat[i]);
    }
}

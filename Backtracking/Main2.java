package Basic_To_Advanced_DataStructure.Backtracking;
import java.util.Scanner;

public class Main2 {
    private static int N = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if (solvesudoku(arr, 0, 0)) {
            print(arr);
        } else {
            System.out.println("No Solution");
        }
    }

    private static boolean solvesudoku(int[][] arr, int row, int col) {
        if (row == N - 1 && col == N)
            return true;

        if (col == N) {
            row++;
            col = 0;
        }

        if (arr[row][col] != 0)
            return solvesudoku(arr, row, col + 1);

        for (int num = 1; num < 10; num++) {
            if (isSafe(arr, row, col, num)) {
                arr[row][col] = num;

                if (solvesudoku(arr, row, col + 1))
                    return true;
            }
        }
        arr[row][col] = 0;
        return false;
    }

    private static boolean isSafe(int[][] arr, int row, int col, int num) {
        for (int x = 0; x <= 8; x++) {
            if (arr[row][x] == num) {
                return false;
            }
        }

        for (int x = 0; x <= 8; x++) {
            if (arr[x][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;

    }

    static void print(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}


//import java.util.Scanner;
//
//public class Main2 {
//    private static int N = 9;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int arr[][] = new int[9][9];
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        solvesudoku(arr, 0, 0);
//    }
//
//    private static void solvesudoku(int[][] arr, int i, int j) {
//        int ni, nj = 0;
//        if (i == arr.length) {
//            printsolution(arr);
//            return;
//        }
//
//        ni = 0;
//        nj = 0;
//
//        if (j == arr[0].length - 1) {
//            nj = 0;
//            ni = i + 1;
//        } else {
//            ni = i;
//            nj = j + 1;
//        }
//
//        if (arr[i][j] != 0) {
//            solvesudoku(arr, ni, nj);
//        } else {
//            for (int number = 0; number <= 9; number++) {
//                if (isValid(arr, i, j, number)) {
//                    arr[i][j] = number;
//                    solvesudoku(arr, ni, nj);
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//    }
//
//    private static void printsolution(int[][] arr) {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++)
//                System.out.print(arr[i][j] + " ");
//            System.out.println();
//        }
//    }
//
//    private static boolean isValid(int[][] arr, int x, int y, int number) {
//
//        //row check
//        for (int j = 0; j < arr[0].length; j++) {
//            if (arr[x][j] == number) {
//                return false;
//
//            }
//        }
//
//        //col check
//        for (int i = 0; i < arr[0].length; i++) {
//            if (arr[i][y] == number) {
//                return false;
//            }
//        }
//
//        //3*3 Block
//
//        int bi = x / 3 * 3;
//        int bj = y / 3 * 3;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (arr[bi + i][bj + j] == number) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
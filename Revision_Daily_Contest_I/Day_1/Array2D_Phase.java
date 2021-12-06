package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_1;

/**
 * 2D Array and Phrase -1:35:0
 * Description
 *
 * You are given an array of n rows and m columns which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?
 *
 * OJ2.png
 *
 *
 * Input
 * Input Format
 *
 * First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid
 *
 * Next n lines: Each line contains m characters which contains lower-case English letters only
 *
 * Constraints
 *
 * 1 <= n,m <= 100
 *
 *
 * Output
 * Output Format
 *
 * Print the number of times the word “saba” appears in the grid.
 *
 *
 * Sample Input 1
 *
 * 5 5
 * safer
 * amjad
 * babol
 * aaron
 * songs
 * Sample Output 1
 *
 * 2
 */

import java.util.Scanner;

public class Array2D_Phase {
    static int count = 0;
    static String temp = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        char[][] ch1 = new char[r][c];
        String[] ch2 = new String[r];
        for (int i = 0; i < r; i++) {
            ch2[i] = scanner.next();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ch1[i][j] = ch2[i].charAt(j);
            }
        }
        System.out.println(res(r, c, ch1));
    }

    static int res(int r, int c, char[][] ch1) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j < (c - 3)) {
                    String temp = "";
                    temp = temp + ch1[i][j] + ch1[i][j + 1] + ch1[i][j + 2] + ch1[i][j + 3];
                    if (temp.equals("saba")) {
                        count++;
                    }
                }
                if (i < (r - 3)) {
                    String temp = "";
                    temp = temp + ch1[i][j] + ch1[i+1][j] + ch1[i+2][j] + ch1[i+3][j];
                    if (temp.equals("saba")) {
                        count++;
                    }
                }
                if (j<(c-3)&&i<(r -3)) {
                    String temp = "";
                    temp = temp + ch1[i][j] + ch1[i+1][j+1] + ch1[i+2][j+2] + ch1[i+3][j+3];
                    if (temp.equals("saba")) {
                        count++;
                    }
                }
                if (j<(c-3)&&i<(r -3)) {
                    String temp = "";
                    temp = temp + ch1[i + 3][j] + ch1[i + 2][j + 1] + ch1[i+1][j + 2]+ch1[i][j + 3];
                    if (temp.equals("saba")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

/**
 * import java.util.Scanner;
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int count = 0;
 * int row = sc.nextInt();
 * int col = sc.nextInt();
 * char[][] c = new char[row][col];
 * String[] arr = new String[row];
 * for (int i = 0; i < row; i++) {
 * arr[i] = sc.next();
 * }
 * for (int i = 0; i < row; i++) {
 * for (int j = 0; j < col; j++) {
 * c[i][j] = arr[i].charAt(j);
 * }
 * }
 * <p>
 * <p>
 * for (int i = 0; i < row; i++) {
 * for (int j = 0; j < col; j++) {
 * <p>
 * }
 * <p>
 * }
 * <p>
 * for (int i = 0; i < row; i++) {
 * for (int j = 0; j < col; j++) {
 * if (j < (col - 3)) {
 * String temp = "";
 * temp = temp + c[i][j] + c[i][j + 1] + c[i][j + 2] + c[i][j + 3];
 * if (temp.equals("saba")) {
 * count++;
 * }
 * }
 * if (i < (row - 3)) {
 * String temp = "";
 * temp = temp + c[i][j] + c[i+1][j] + c[i+2][j] + c[i+3][j];
 * if (temp.equals("saba")) {
 * count++;
 * }
 * }
 * if (j<(col-3)&&i<(row -3)) {
 * String temp = "";
 * temp = temp + c[i][j] + c[i+1][j+1] + c[i+2][j+2] + c[i+3][j+3];
 * if (temp.equals("saba")) {
 * count++;
 * }
 * }
 * if (j<(col-3)&&i<(row -3)) {
 * String temp = "";
 * temp = temp + c[i + 3][j] + c[i + 2][j + 1] + c[i+1][j + 2]+c[i][j + 3];
 * if (temp.equals("saba")) {
 * count++;
 * }
 * }
 * }
 * }
 * System.out.println(count);
 * }
 * }
 */

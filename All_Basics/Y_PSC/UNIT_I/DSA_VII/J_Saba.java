package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class J_Saba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] array = new char[n][m];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                array[i][j] = str.charAt(j);
            }
        }
        saba(n, m, array);
    }

    static void saba(int n, int m, char[][] array) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 's') {
                    if (j + 3 < m && array[i][j + 1] == 'a' && array[i][j + 2] == 'b' && array[i][j + 3] == 'a') {
                        count++;
                    }
                    if (i + 3 < j && array[i + 1][j] == 'a' && array[i + 2][j] == 'b' && array[i + 3][j] == 'a') {
                        count++;
                    }
                    if (i + 3 < j && j + 3 < m && array[i + 1][j + 1] == 'a' && array[i + 2][j + 2] == 'b' && array[i + 3][j + 3] == 'a') {
                        count++;
                    }
                    if (j + 3 < m && i >= 3 && array[i - 1][j + 1] == 'a' && array[i - 2][j + 2] == 'b' && array[i - 3][j + 3] == 'a') {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }
}
//    public static void main(String[] args) {
//        int count = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        int j = sc.nextInt();
//        int k = sc.nextInt();
//        char[][] arr = new char[j][k];
//        sc.nextLine();
//
//        for (int i = 0; i < j; i++) {
//            String str = sc.nextLine();
//            for (int j = 0; j < k; j++) {
//                arr[i][j] = str.charAt(j);
//            }
//        }
//
//        for (int i = 0; i < j; i++) {
//            for (int j = 0; j < k; j++) {
//                if (arr[i][j] == 's') {
//                    if (j + 3 < k && arr[i][j + 1] == 'a' && arr[i][j + 2] == 'b' && arr[i][j + 3] == 'a') {
//                        count++;
//                    }
//                    if (i + 3 < j && arr[i + 1][j] == 'a' && arr[i + 2][j] == 'b' && arr[i + 3][j] == 'a') {
//                        count++;
//                    }
//                    if (i + 3 < j && j + 3 < k && arr[i + 1][j + 1] == 'a' && arr[i + 2][j + 2] == 'b' && arr[i + 3][j + 3] == 'a') {
//                        count++;
//                    }
//                    if (j + 3 < k && i >= 3 && arr[i - 1][j + 1] == 'a' && arr[i - 2][j + 2] == 'b' && arr[i - 3][j + 3] == 'a') {
//                        count++;
//                    }
//
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
/**
 * 2D Array and Phrase
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

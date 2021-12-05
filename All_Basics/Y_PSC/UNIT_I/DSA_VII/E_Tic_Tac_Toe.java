package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class E_Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        String[][] array = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.next();
            }
        }
        if (result(array, "x")) {
            System.out.println("x");
            return;
        }
        if (result(array, "o")) {
            System.out.println("o");
            return;
        } else
            System.out.println("tie");
    }

    static boolean result(String[][] array, String c) {
        if (array[0][0].equals(c) && array[1][1].equals(c) && array[2][2].equals(c)) {
            return true;
        }
        if (array[2][0].equals(c) && array[1][1].equals(c) && array[0][2].equals(c)) {
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[0][i].equals(c) && array[1][i].equals(c) && array[2][i].equals(c)) {
                return true;
            }
            if (array[i][0].equals(c) && array[i][1].equals(c) && array[i][2].equals(c)) {
                return true;
            }
        }
        return false;
    }
}
/**
 * Result or Tie - Tic Tac Toe
 * Description
 *
 * You are given a 3*3 matrix (2-dimensional array) that represents the final situation of a Tic Tac Toe.
 *
 * Your task is to write a program that finds out the winner in case the match ended in a win. If the winner is 'x', print 'x'(without quotes).
 *
 * If the winner is 'o', print 'o' (without quotes)
 *
 * In case the match ended in a tie, print "Tie" (without quotes)
 *
 *
 * Input
 * InputFormat
 *
 * The input contains 3 lines where each line has 3 space separated characters which represent the final status of tic tac toe
 *
 * Constraints
 *
 * The input contains either of the 2 alphabets: 'x' and 'o'
 *
 *
 * Output
 * Print Tie/x/o depending on the end result of the game.
 *
 *
 * Sample Input 1
 *
 * x o x
 * o x x
 * o o o
 * Sample Output 1
 *
 * o
 */
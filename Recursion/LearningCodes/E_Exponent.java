package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;
/**
 * find Exponent of the number
 */

import java.util.Scanner;

public class E_Exponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
        System.out.println(fastExponential(n));
    }

    //here we took long so that the limit should not exceed
    static long res(int n) {
        if (n == 0) {
            return 1;
        } else
            return 2 * res(n - 1);
    }

    //This method is called fast exponentiation
    static long fastExponential(int n) {
        if (n == 0) {
            return 1;
        }
        //odd
        long smaller = fastExponential(n / 2);
        if (n % 2 == 1) {
            return 2 * smaller * smaller;
        } else {
            //even
            return smaller * smaller;
        }
    }
}

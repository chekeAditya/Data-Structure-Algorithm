/**
 *
 */
package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class C_ImplementGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(res(n, m));
            System.out.println(res1(n, m));
        }
    }

    //First method where it is cheking all the conditions
    static int res(int n, int m) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (n == m) {
            return n;
        }
        if (n > m) {
            return res(n - m, m);
        } else return res(n, m - n);
    }

    //method two
    static int res1(int n, int m) {
        if (m == 0) {
            return n;
        } else
            return res(m, n % m);
    }
}

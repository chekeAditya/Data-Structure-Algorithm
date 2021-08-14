package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Scanner;

public class F_GenereateAllParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int open = 0, close = 0;
            System.out.println(fact(2 * n) / (fact(n) * fact(n + 1)));
            res("", open, close, n);
        }
    }

    public static long fact(int n) {
        if (n == 0) return 1;
        else return n * fact(n - 1);
    }


    static void res(String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (open < n)
            res(s + "(", open + 1, close, n);
        if (open > close)
            res(s + ")", open, close + 1, n);
    }
}
/*

 */





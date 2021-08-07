package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class B_NickAndHacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = 1;  // Nick has only 1 rs in his back account
            int n = scanner.nextInt();
            if (res(n, x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static boolean res(int n, int x) {
        if (n == x) return true;
        if (x > n) return false;
        else return res(n, x * 10) || res(n, x * 20);
    }
}

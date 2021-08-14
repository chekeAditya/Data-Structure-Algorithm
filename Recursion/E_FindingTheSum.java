package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class E_FindingTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long str = scanner.nextLong();
        long n = scanner.nextInt();
        System.out.println(res(str, n));
    }

    static long res(long str, long n) {
        long add = n * str;
        return sum(add);
    }

    static long sum(long num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0)
            return 9;
        else return num % 9;
    }

  
}

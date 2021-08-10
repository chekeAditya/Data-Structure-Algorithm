package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;

import java.util.Scanner;

public class D_Geometric_progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(String.format("%.4f", res(n,m)));
    }

    static double res(int n, int m) {
        if (n == 0) return 1;
        //1.2 res
        //math.power = .008
        return (1 / (double)Math.pow(m, n) + res(n - 1, m));
    }
}

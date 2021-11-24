package Basic_To_Advanced_DataStructure.Revision;

import java.util.Scanner;

public class Infinity_stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        System.out.println(res(A, B, C, D, E, F));
    }

    static int res(int A, int B, int C, int D, int E, int F) {
        int b = 2 * B, c = 3 * C, d = 3 * D, e = 2 * E, f = 2 * F;
        return (b + c + d + e + f+ A);
    }
}

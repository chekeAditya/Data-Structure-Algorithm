package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class J_CountSuchPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (Math.pow(i, 2) + j == n && Math.pow(j, 2) + i == m) count++;
        if (n == m) count += 2;
        System.out.println(count);
    }
}

package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class H_IsItAPowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            if (isPowerOf2(N) == 0){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            T--;
        }
    }

    static int isPowerOf2(int N) {
        if (N == 0) {
            return 0;
        }
        while (N != 1) {
            N = N / 2;
            if (N % 2 != 0 && N != 1){
                return 0;
            }
        }
        return 1;
    }
}

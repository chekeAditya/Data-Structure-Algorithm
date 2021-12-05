package Z_Rivision;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class R5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int sum = 0;
            int a;
            for (int i = 0; i < arr.length; i++) {
                while (arr[i] > 0) {
                    a = arr[i] % 10;
                    sum += a;
                    arr[i] = arr[i] / 10;
                }
            }
            System.out.println(sum);
        }
    }
}

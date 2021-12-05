package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class G_MakeArrayEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of Test");
        int T = scanner.nextInt();
        while (T != 0) {
//            System.out.println("Enter size of array");
            int N = scanner.nextInt();
//            System.out.println("Enter the element");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            makeArrayEven(N, arr);
            T--;
        }
    }

    static void makeArrayEven(int N, int[] arr) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (N == 1) {
                if (arr[i] % 2 == 0) System.out.println("YES");
            } else if (N % 2 == 0)
                sum += arr[i];
            if (sum % 2 == 0) System.out.println("YES");
            else {
                arr[i] = arr[i + 1];
            }
        }
    }
}
/*
4
1 2 3 4

 */

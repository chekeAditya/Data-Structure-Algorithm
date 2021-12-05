package Z_Rivision;

import java.util.Scanner;

public class R6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            res(n, arr);
        }
    }

    static void res(int n,int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] ;
            System.out.print(sum +" ");
        }
        System.out.println();
    }
}

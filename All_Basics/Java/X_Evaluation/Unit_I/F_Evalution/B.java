package Java.X_Evaluation.Unit_I.F_Evalution;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            res(N, arr, M);
            T--;
        }
    }

    static void res(int N, int[] array, int M) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int sum = array[i] + array[j];
                if (sum % M !=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
/*
2
3 2
1 3 2
5 4
3 2 2 1 5
 */
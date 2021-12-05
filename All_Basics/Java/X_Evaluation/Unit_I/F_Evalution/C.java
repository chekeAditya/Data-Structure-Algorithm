package Java.X_Evaluation.Unit_I.F_Evalution;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            res(N, arr);
            T--;
        }
    }

    static void res(int N, int[] arr) {
        int count = 0;
        int maxcount = 0;
        int value = 0;
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else if (arr[i] != arr[j]) {
                    if (arr[j] < smallest) smallest = arr[j];
                }
                if (count > maxcount) {
                    maxcount = count;
                    value = arr[i];
                }
            }
        }
            System.out.println(value);
    }
}
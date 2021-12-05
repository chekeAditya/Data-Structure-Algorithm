package Java.W_ExtraQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithSpecificEvents {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        subarray(N, K, array);
    }

    static void subarray(int N, int K, int[] array) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j <= N; j++) {
                for (int k = i; k < j; k++) {
                    if (array[k] % 2 == 1){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
//this is for odd

/*
4 1
1 2 3 4

1
1 2
1 2 3
1 2 3 4
2
2 3 4
3
3 4
4


 */
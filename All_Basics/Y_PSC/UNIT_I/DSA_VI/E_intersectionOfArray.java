package Y_PSC.UNIT_I.DSA_VI;

import java.util.Scanner;

public class E_intersectionOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array1 = new int[N];
        for (int i = 0; i < N; i++) {
            array1[i] = scanner.nextInt();
        }
        int[] array2 = new int[N];
        for (int j = 0; j < N; j++) {
            array2[j] = scanner.nextInt();
        }
        interactionOfArray(N,array1,array2);
    }

    static void interactionOfArray(int N, int[] array1, int[] array2) {
        int number = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (array1[i] == array2[j]){
                    number = array1[i];
                    System.out.println(number);
                    return;
                }
            }
        }
    }
}

package Y_PSC.UNIT_I.DSA_IV;

import java.util.Scanner;

public class PSC_04_SmallestToLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        //logic
        int smallest = A[0];
        int largest = A[0];
        for (int i = 0; i < N; i++) {
            if (smallest > A[i]){
                smallest = A[i];
            }
            if (largest < A[i]){
                largest = A[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
            }
}

package Basic_To_Advanced_DataStructure.Final450.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumOperationToConverArrayAtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < n; i++) A[i] = scanner.nextInt();
        for (int i = 0; i < m; i++) B[i] = scanner.nextInt();
    }

    static int res(int[] A, int[] B, int N, int M) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = 0, end;
        if (N > M) end = A.length - 1;
        else end = B.length - 1;
        while (start < end) {
            if (A[start] == B[start]) {
                start++;
                end++;
            }else if (A[start] != B[start]){
                //remove(A[start]);
                start++;
            }else {
                //add(A[start]
            }

        }
        return start;
    }
}

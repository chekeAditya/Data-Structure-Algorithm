package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class G_Negativity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
//        program
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
            System.out.println(count);
    }
}


package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class I_Sum_AndConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        //program's logic
        int sum = 0;
        int greaterThan = 100;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        if (sum > greaterThan){
            System.out.println("Greater");
        }else {
            System.out.println("Lesser");
        }
    }
}

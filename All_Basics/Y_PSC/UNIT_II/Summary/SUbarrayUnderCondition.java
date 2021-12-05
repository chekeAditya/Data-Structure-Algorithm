package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class SUbarrayUnderCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] str = n.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++)
            arr[i] = Integer.parseInt(scanner.next());
        res(n,str,arr);
    }

    static void res(String n, String[] str, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) System.out.println(i + " "  + j);
            }
        }
    }
}

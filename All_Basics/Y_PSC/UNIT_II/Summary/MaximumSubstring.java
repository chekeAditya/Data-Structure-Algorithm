package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class MaximumSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(res(str));
    }

    static String res(String str) {
        String max = "";
        for (int i = 0; i < str.length(); ++i) {
            if (max.compareTo(str.substring(i)) <=0){
                max = str.substring(i);
            }
        }
        return max;
    }
}

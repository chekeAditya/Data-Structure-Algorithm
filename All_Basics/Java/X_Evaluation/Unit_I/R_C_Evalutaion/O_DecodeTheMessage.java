package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class O_DecodeTheMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        decodeMessage(str);
    }


    static void decodeMessage(String str) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (count > res) {
                res = count;
            }
            count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
/*
i   j   a[i]    a[j]
0   0   A       T
 */
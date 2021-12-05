package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.ArrayList;
import java.util.Scanner;

public class R_OddsOfOdd {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                arrayList.add(scanner.nextInt());
            }
            System.out.println(oddsOfOdds(n, arrayList));
            oddsOfOdds(n, arrayList);
            T--;
        }
    }

    static String oddsOfOdds(int n, ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrayList.get(i);
        }
        if (sum % 2 == 1)
            return "Yes";
        else
            return "No";
    }
}


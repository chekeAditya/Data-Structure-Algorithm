package Z_Rivision;

import java.util.ArrayList;
import java.util.Scanner;

public class R9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                arrayList.add(scanner.nextInt());
            }
            System.out.println(res(n, arrayList, k));
        }
    }

    static int res(int n, ArrayList<Integer> arrayList, int k) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        if (sum % k != 0)
            return 1;
        else
            return -1;
    }
}

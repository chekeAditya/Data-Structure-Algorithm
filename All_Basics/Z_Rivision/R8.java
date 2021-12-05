package Z_Rivision;

import java.util.ArrayList;
import java.util.Scanner;

public class R8 {
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

    static int res(int n,ArrayList<Integer> arrayList, int k) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) + arrayList.get(j) == k) {
                    return 1;
                }
            }
        }
        return -1;
    }
}

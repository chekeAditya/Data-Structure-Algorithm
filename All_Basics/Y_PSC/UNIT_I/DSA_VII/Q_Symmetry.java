package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class Q_Symmetry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int row = sc.nextInt();
            boolean hSymmetric = true;
            boolean vSymmetric = true;
            char[][] a = new char[row][row];
            String[] arr = new String[row];
            for (int i = 0; i < row; i++) {
                arr[i] = sc.next();
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    a[i][j] = arr[i].charAt(j);
                }
            }

            // to approach horizontal
            for (int i = 0; i <= row / 2; i++) {
                for (int j = row - 1 - i; j >= row / 2; j--) {
                    for (int k = 0; k < row; k++) {
                        if (a[i][k] != a[j][k])
                            hSymmetric = false;
                    }
                    break;
                }
            }
            // to approach vertical
            for (int i = 0; i < row; i++) {
                for (int k = 0; k <= row / 2; k++) {
                    for (int j = row - 1 - k; j >= row / 2; j--) {
                        if (a[i][j] != a[i][k])
                            vSymmetric = false;
                        break;
                    }
                }
            }
            if (hSymmetric && vSymmetric) {
                System.out.println("BOTH");
            } else if (hSymmetric) {
                System.out.println("HORIZONTAL");
            } else if (vSymmetric) {
                System.out.println("VERTICAL");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}

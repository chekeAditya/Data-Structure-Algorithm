package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[6*n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

            boolean abDev = true, virat = false;
            for (int i=0;i<6*n;i++){
                if (i%6==0){
                    if (abDev){
                        abDev = false;
                        virat = true;
                    }else {
                        abDev = true;
                        virat = false;
                    }
                }

            }
        }
    }
}

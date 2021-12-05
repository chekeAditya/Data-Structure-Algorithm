package Y_PSC.UNIT_I.DSA_IV;

import java.util.Scanner;

public class PSC_05_NumberPresentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        //logic


        int number = 42;
        for (int i=0;i<N;i++){
            if (A[i] == number){
                System.out.println("Yes");
                break;
            }else {
                System.out.println("No");
                return;
            }
        }
    }
}

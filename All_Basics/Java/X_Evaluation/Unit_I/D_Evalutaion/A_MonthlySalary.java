package Java.X_Evaluation.Unit_I.D_Evalutaion;

        import java.util.Scanner;

public class A_MonthlySalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        moneyManagement(N,array,K);
    }

    static void moneyManagement(int N, int[] array, int K) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }

        if (sum > K) {
            System.out.println("Debt");
        } else if (sum < K) {
            System.out.println("Save");
        }else if (sum == K){
            System.out.println("Neutral");
        }
    }
}

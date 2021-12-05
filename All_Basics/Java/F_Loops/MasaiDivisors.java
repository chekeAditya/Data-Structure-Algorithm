    package Java.F_Loops;

    import java.util.Scanner;

    public class MasaiDivisors {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int k = scanner.nextInt();
            int count = 0;
            for (int i = left; i <= right; i++) {
                if (i % k == 0) {
                    count++;
                }
            }
                    System.out.println(count);
        }
    }

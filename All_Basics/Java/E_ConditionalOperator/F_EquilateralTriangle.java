    package Java.E_ConditionalOperator;

    import java.util.Scanner;

    public class F_EquilateralTriangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number % 3 ==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

package Java.E_ConditionalOperator;

import java.util.Scanner;

public class N_Triangle_or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a+b>c && b+c>a && c+a>b) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

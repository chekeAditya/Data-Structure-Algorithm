package Java.W_ExtraQuestion;

import java.util.Scanner;

public class A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            sc.nextLine();
            String s2 = sc.nextLine();
            int y = sc.nextInt();
            sc.nextLine();
            String s3 = sc.nextLine();
            int z = sc.nextInt();
            sc.nextLine();

            if (s1.length() <= 10) {
                System.out.printf("%d \t %d",s1,x);
            }
        }
        System.out.println("================================");
    }
}

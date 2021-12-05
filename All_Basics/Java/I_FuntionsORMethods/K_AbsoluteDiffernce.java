package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class K_AbsoluteDiffernce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        System.out.println("Their absolute difference is : ");
        absoluteDifference(n1,n2);
    }
    public static int absoluteDifference(int n1,int n2){
        if (n1>n2){
            int difference = n1-n2;
            System.out.println(difference);
            return difference;
        }else {
            int diff = n2-n1;
            System.out.println(diff);
            return diff;
        }
    }
}

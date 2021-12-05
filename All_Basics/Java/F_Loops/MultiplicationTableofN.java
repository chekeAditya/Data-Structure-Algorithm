package Java.F_Loops;

import java.util.Scanner;

public class MultiplicationTableofN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(N +" x " + i +" = " + (N*i));
        }
    }
}

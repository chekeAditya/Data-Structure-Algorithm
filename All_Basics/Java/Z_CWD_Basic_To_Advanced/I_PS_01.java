package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class I_PS_01 {
    public static void main(String[] args) {
////Problem 1
//        int a = 11;
//        if(a>18){
//            System.out.println("You are eligible for licence");
//        }else{
//            System.out.println("You are not eligible for licence");
//        }
////Problem 2
        Scanner scanner = new Scanner(System.in);
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();
        int percentage = ((sub1 + sub2 + sub3) * 100) / 300;
        System.out.println(percentage+"%");
        if (percentage > 33){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}

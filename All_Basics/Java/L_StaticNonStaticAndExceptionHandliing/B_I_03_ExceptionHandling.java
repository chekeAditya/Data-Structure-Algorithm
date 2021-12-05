package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.Scanner;

public class B_I_03_ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//here it's crashing
//        int a = 1/0;
//        System.out.println(a);


//but here we are just saying that don't crash just store it in catch block
        try {
            int a = 1/0;
            System.out.println(a);
        }catch (Exception e){
            System.out.println("Hey exception catch");
        }finally { // it always get executed, doesn't matter exception is their or not
            scanner.close();
            System.out.println("Finally executes");
        }
    }
}


//you can have a finally
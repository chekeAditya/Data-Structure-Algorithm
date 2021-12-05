package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class C_BeachFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        System.out.println(closestDistance(X));
    }

    static String  closestDistance(int X) {
        if (49 - X > X - 1) {
            return "RK Beach";
        }else if (49-X < X-1){
            return "RU Beach";
        }
        return "Go Anywhere!" ;
    }
}

package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class F_NewYearResolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(newYearResolution(A,B,C,N));
    }

    static String newYearResolution(int A, int B, int C, int N) {
        int PA = 4 * A;
        int PB = 4 * B;
        int PC = 4 * C;
        if (PA > N){
            return "Park A";
        }else if (PB > N){
            return "Park B";
        }else if (PC > N){
            return "Park C";
        }else {
            return "Resolution Failed";
        }
    }
}
/*
N meter
A,B,C

select park whose perimeter is greate thatn or equalt to N

if(parka>N) -> park A
if(parkb>N) -> park B
if(parkc>N) -> park C
else Resolution failed
 */

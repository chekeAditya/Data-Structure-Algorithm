package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class A_WorldTestChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indiaP = scanner.nextInt();
        int australiaP = scanner.nextInt();
        int indiaM = scanner.nextInt();
        int australiaM = scanner.nextInt();

        if (indiaP > australiaP) {
            System.out.println("India");
        } else if (australiaP > indiaP) {
            System.out.println("Australia");
        } else if (indiaP == australiaP) {
            if (indiaM > australiaM){
                System.out.println("Australia");
            } else if (indiaM < australiaM) {
                System.out.println("India");
            } else if (indiaM == australiaM) {
                System.out.println("Play another game!");
            }
        }

    }
}

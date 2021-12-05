package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class G_FindThethief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personA = scanner.nextInt();
        int personB = scanner.nextInt();
        int personC = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(findThief(personA,personB,personC,N));
    }

    static String findThief(int personA, int personB,int personC,int N){
        if (personA > N){
            return "Person A";
        } else if (personB > N) {
            return "Person B";
        } else if (personC > N) {
            return "Person C";
        }else {
            return "Not found";
        }
    }
}

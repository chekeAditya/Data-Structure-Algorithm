package Java.E_ConditionalOperator;

import java.util.Scanner;

public class IndVsPak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("India score: ");
        int indiaScore = scanner.nextInt();
        System.out.println("Pakistan score: ");
        int pakScore = scanner.nextInt();
        if (indiaScore > pakScore)
            System.out.println("India Wins");
        else if (pakScore > indiaScore)
            System.out.println("Pakistan Wins");
        else
            System.out.println("Match tied");
    }
}

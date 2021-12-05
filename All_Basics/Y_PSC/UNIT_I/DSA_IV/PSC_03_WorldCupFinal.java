package Y_PSC.UNIT_I.DSA_IV;

import java.util.Scanner;

public class PSC_03_WorldCupFinal {
    public static void main(String[] args) {
        //Team1 = New Zealand , Team2 = England
        Scanner scanner = new Scanner(System.in);
        int scoreTeam1 = scanner.nextInt();
        int scoreInSuperOverOfTeam1 = scanner.nextInt();
        int numberOfFourInTeam1 = scanner.nextInt();
        int scoreTeam2 = scanner.nextInt();
        int scoreInSuperOverOfTeam2 = scanner.nextInt();
        int numberOfFourInTeam2 = scanner.nextInt();
        worldCupFinal(scoreTeam1, scoreInSuperOverOfTeam1, numberOfFourInTeam1, scoreTeam2, scoreInSuperOverOfTeam2, numberOfFourInTeam2);
    }


    public static void worldCupFinal(int scoreTeam1, int scoreInSuperOverOfTeam1, int numberOfFourInTeam1, int scoreTeam2, int scoreInSuperOverOfTeam2, int numberOfFourInTeam2) {
        if (scoreTeam1 > scoreTeam2) {
            System.out.println("New Zealand");
        } else if (scoreTeam2 > scoreTeam1) {
            System.out.println("England");
        } else {
            if (scoreInSuperOverOfTeam1 > scoreInSuperOverOfTeam2) {
                System.out.println("New Zealand");
            } else if (scoreInSuperOverOfTeam2 > scoreInSuperOverOfTeam1) {
                System.out.println("England");
            } else {
                if (numberOfFourInTeam1 > numberOfFourInTeam2) {
                    System.out.println("New Zealand");
                } else if (numberOfFourInTeam2 > numberOfFourInTeam1) {
                    System.out.println("England");
                }
            }
        }
    }
}

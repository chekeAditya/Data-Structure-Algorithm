package Basic_To_Advanced_DataStructure.Basic;

/**
 * World Cup Final -12412:15:26
 * Description
 *
 * You are given 3 parameters of two different cricket teams in World Cup Final.
 *
 * First parameter  :  Score
 *
 * Second parameter :  Score in super over
 *
 * Third parameter  :  Total number of fours scored in the inning.
 *
 * If first parameter of any one team is greater than other then that team wins.
 *
 * If first parameter of both the teams are same, then the team whose second parameter is greater wins the match.
 *
 * In case the second parameter is also same, then the team that has higher value of third parameter wins the game.
 *
 *
 * Input
 * Input Format
 *
 * First line contains the three discussed parameter for New Zealand
 *
 * Second line contains three discussed parameters for England
 *
 * Constraints
 *
 * All parameters < 10000
 *
 *
 * Output
 * Output Format
 *
 * Output "England" (without quotes) if England wins the game, else print "New Zealand" if New Zealand wins the game.
 *
 *
 * Sample Input 1
 *
 * 241 15 21
 * 241 15 26
 * Sample Output 1
 *
 * England
 */

import java.util.Scanner;

public class WorldCupFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score1 = scanner.nextInt();
        int superOver1 = scanner.nextInt();
        int four1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int superOver2 = scanner.nextInt();
        int four2 = scanner.nextInt();
        System.out.println(res(score1, superOver1, four1, score2, superOver2, four2));
    }

    static String res(int score1, int superOver1, int four1, int score2, int superOver2, int four2) {
        if (score1 > score2)
            return "New Zealand";
        else if (score1 < score2)
            return "England";
        else {
            if (superOver1 > superOver2) return "New Zealand";
            else if (superOver1 < superOver2) return "England";
            else {
                if (four1 > four2) return "New Zealand";
                else if (four1 < four2) return "England";
            }
        }
        return "Tie";
    }
}

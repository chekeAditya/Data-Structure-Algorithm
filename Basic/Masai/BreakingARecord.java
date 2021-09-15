package Basic_To_Advanced_DataStructure.Basic.Masai;

/**
 * Breaking a record
 * Description
 * <p>
 * You are provided current highest score ever scored in a cricket match. You are also given runs made by Sachin(Tendulkar) in a match. Print "Broken" (without quotes)if Sachin breaks current record in that match, else print "Not Yet" (without quotes) if he could not break that record. In all other cases, print "Wao" (without quotes)
 * <p>
 * <p>
 * Input
 * Input Format:
 * <p>
 * First line contains 2 space separated positive integers where first integer represents the current highest score and second integer represents score made by Sachin in that match.
 * <p>
 * Constraints:
 * <p>
 * Both scores < 10000
 * <p>
 * <p>
 * Output
 * Output one string based on the conditions mentioned
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 264 200
 * Sample Output 1
 * <p>
 * Not Yet
 */

import java.util.Scanner;

public class BreakingARecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestScore = scanner.nextInt();
        int sachinScore = scanner.nextInt();
        System.out.println(res(highestScore,sachinScore));
    }

    static String res(int highestScore, int sachinScore) {
        if (highestScore < sachinScore) return "Broken";
        else if (highestScore > sachinScore) return "Not Yet";
        else return "Wao";
    }
}

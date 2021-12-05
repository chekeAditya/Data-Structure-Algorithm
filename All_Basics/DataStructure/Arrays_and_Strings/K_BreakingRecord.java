package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class K_BreakingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highestScore = sc.nextInt();
        int sachinScore = sc.nextInt();
        if (highestScore < sachinScore) {
            System.out.println("Broken");
        } else if (highestScore > sachinScore) {
            System.out.println("Not Yet");
        } else {
            System.out.println("Wao");
        }
    }
}
/*
D => You are provided current highest score ever scored in a cricket match.
    You are also given runs made by Sachin(Tendulkar) in a match.
    Print "Broken" (without quotes)if Sachin breaks current record in that match,
    else print "Not Yet" (without quotes) if he could not break that record. In all other cases,
    print "Wao" (without quotes)

I => 264 200
O => Not yet
 */

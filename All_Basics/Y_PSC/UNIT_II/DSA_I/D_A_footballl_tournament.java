package Y_PSC.UNIT_II.DSA_I;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class D_A_footballl_tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = arr[i];
            if (hashMap.containsKey(key)) {
                int c = hashMap.get(key);
                c++;
                hashMap.put(key, c);
            } else {
                hashMap.put(key, 1);
            }
        }
        int max_count = 0;
        String res = "";
        for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        System.out.println(res);
    }
}
/**
 * A football tournament
 * Description
 *
 * Masai School had hosted a Football tournament. You got hold of a profound description of the final match's process. On the whole, there are n lines in that description each of which described one goal. Every goal was marked with the name of the team that had scored it. Write a program to find the name of the team that won the finals. It is guaranteed that the match did not end in a tie.
 *
 *
 * Input
 * Input Format
 *
 * The first line contains an integer n — the number of lines in the description.
 *
 * Then follow n lines — for each goal the names of the teams that scored it.
 *
 * Constraints
 *
 * 1 ≤ n ≤ 100
 *
 * The names are non-empty lines consisting of uppercase letters whose lengths do not exceed 10 symbols. It is guaranteed that the match did not end in a tie and the description contains no more than two different teams.
 *
 *
 *
 *
 * Output
 * Print the name of the winning team. We remind you that in football the team that scores more goals is considered the winner.
 *
 *
 * Sample Input 1
 *
 * 5
 * A
 * ABA
 * ABA
 * A
 * A
 * Sample Output 1
 *
 * A
 */


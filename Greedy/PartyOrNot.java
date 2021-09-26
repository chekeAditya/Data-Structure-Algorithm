package Basic_To_Advanced_DataStructure.Greedy;

/**
 * Party or Not Ended
 * Description
 *
 * Ashutosh has N friends and he wants to give a party to his C friends on his birthday. Ashutosh knows the amount he will have to spend on each of his N friends in party. Given the expense amount of each of the N friends, comment if it is possible for Ashutosh to give a party to his C friends if he has just R rupees.
 *
 *
 * Input
 * Input Method
 *
 * First line contains three space separated integers: N, C and R respectively
 *
 * Second line contains N space separated integers which represents the amount he needs to spend on each of his N friends.
 *
 * Constraints
 *
 * N <= 1000
 *
 * C is lesser than N
 *
 * R < 10000
 *
 *
 * Output
 * Output Method
 *
 * If it is possible to give party to C friends, print "Party"
 *
 * Else print "Sad".
 *
 *
 * Sample Input 1
 *
 * 5 3 24
 * 6 4 21 20 13
 * Sample Output 1
 *
 * Party
 * Hint
 *
 * Sample 1 Explanation
 *
 * In this case, he can take 3 of his friends to party with 24 rupees in his pocket.
 */

    import java.util.Arrays;
    import java.util.Scanner;

    public class PartyOrNot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int r = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            System.out.println(res(arr, n, c, r));
        }

        static String res(int[] arr, int n, int c, int r) {
            int sum = 0;
            for (int i = 0; i < c; i++) {
                sum += arr[i];
            }
            if (sum > r) return "Sad";
            return "Party";
        }
    }

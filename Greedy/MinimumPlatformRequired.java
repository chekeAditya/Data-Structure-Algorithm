package Basic_To_Advanced_DataStructure.Greedy;


public class MinimumPlatformRequired {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
/*
  #
 ##
###

012
012
012
 */

package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class H_Reverse_Pyramid_Star {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
Output

*********
 *******
  *****
   ***
    *

 */

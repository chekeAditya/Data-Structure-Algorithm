package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class G_Pyramid_Star {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
Output

   *
  ***
 *****
*******




 */

package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class A_RectanglePattern {
    public static void main(String[] args) {
        int n = 3;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
 * Output

 * * *
 * * *
 * * *

 */
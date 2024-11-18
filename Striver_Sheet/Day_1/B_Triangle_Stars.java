package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class B_Triangle_Stars {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output

*
* *
* * *
* * * *
* * * * *

 */

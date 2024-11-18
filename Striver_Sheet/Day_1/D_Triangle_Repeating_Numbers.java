package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class D_Triangle_Repeating_Numbers {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */

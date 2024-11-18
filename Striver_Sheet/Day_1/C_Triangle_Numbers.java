package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class C_Triangle_Numbers {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

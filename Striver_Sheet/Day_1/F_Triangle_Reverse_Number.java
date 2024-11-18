package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class F_Triangle_Reverse_Number {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        int a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(j + " ");
            }
            a--;
            System.out.println();
        }
    }
}

/*
Output

* * * * *
* * * *
* * *
* *
*

 */

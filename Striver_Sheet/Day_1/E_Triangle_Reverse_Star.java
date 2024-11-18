package Basic_To_Advanced_DataStructure.Striver_Sheet.Day_1;

public class E_Triangle_Reverse_Star {
    public static void main(String[] args) {
        int n = 5;
        printRectangleStars(n);
    }

    private static void printRectangleStars(int n) {
        int a = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
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

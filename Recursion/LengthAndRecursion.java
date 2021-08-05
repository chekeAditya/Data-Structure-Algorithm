package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class LengthAndRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(res(str));
    }

    static int res(String str) {
        if (str.equals(""))
            return 0;
        return res(str.substring(1)) + 1;
    }
}


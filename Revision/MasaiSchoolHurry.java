package Basic_To_Advanced_DataStructure.Revision;

import java.util.Scanner;

public class MasaiSchoolHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static String res(int n) {
        if (n % 35 == 0 && n >= 35)
            return "Masai School";
        else if (n % 7 == 0)
            return "Masai";
        else if (n % 5 == 0)
            return "School";
        else
            return "Hurry!";
    }
}

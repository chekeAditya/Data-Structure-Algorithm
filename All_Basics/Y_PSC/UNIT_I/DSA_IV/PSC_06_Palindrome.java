package Y_PSC.UNIT_I.DSA_IV;

import java.util.Scanner;

public class PSC_06_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int currentNumber = n;
//        int remainder;
//        int sum = 0;
//        while (n > 0) {
//            remainder = n % 10;
//            sum = (sum * 10) + remainder;
//            n = n / 10;
//        }
//        if (currentNumber == sum)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}
        String number = scanner.nextLine();
        String newNumber = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            newNumber += number.charAt(i);
        }
        if (number.equals(newNumber)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        if (name==age)
            System.out.println("same");
        else
            System.out.println("not name");
    }
}

package Java.E_ConditionalOperator;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0){

            if (year % 100 ==0 && year % 400 == 0) {
                System.out.println("Leap year");
            }else {
                System.out.println("Not a leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }
    }
}
/*
if a year is a century year then it's leap year
else we can say it as it is not a leap year
 */

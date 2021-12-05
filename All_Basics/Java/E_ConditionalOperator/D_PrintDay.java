package Java.E_ConditionalOperator;

import java.util.Scanner;

public class D_PrintDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        if (day.equals("Monday")){
            System.out.println("Mon");
        }else if (day.equals("Tuesday")){
            System.out.println("Tue");
        }else if (day.equals("Wednesday")){
            System.out.println("Wed");
        }else if (day.equals("Thrusday")){
            System.out.println("Thrus");
        }else if (day.equals("Friday")){
            System.out.println("Fri");
        }else if (day.equals("Saturday")){
            System.out.println("Sat");
        }else if (day.equals("Sunday")){
            System.out.println("Sun");
        }
    }
}

package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class F_DayOTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentDay = scanner.nextLine();
        int n = scanner.nextInt();
        dayOfWeek(currentDay, n);
    }

    static void dayOfWeek(String currentDay, int n) {
        int dayPos = 0;
        switch (currentDay) {
            case "Sunday":
                dayPos += 1;
                break;
            case "Monday":
                dayPos += 2;
                break;
            case "Tuesday":
                dayPos += 3;
                break;
            case "Wednesday":
                dayPos += 4;
                break;
            case "Thursday":
                dayPos += 5;
                break;
            case "Friday":
                dayPos += 6;
                break;
            case "Saturday":
                dayPos += 7;
                break;
        }int total = (dayPos + n) % 7;
        switch (total) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 0:
                System.out.println("Saturday");
                break;
        }
    }
}


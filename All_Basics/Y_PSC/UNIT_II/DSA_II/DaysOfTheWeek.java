package Y_PSC.UNIT_II.DSA_II;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String day = sc.next();
//        int n = sc.nextInt();
//        res(day,n);
//
//    }
//
//    static void res(String day, int n) {
//        int intDay = 0;
//        switch (day) {
//            case "Sunday" -> intDay += 1;
//            case "Monday" -> intDay += 2;
//            case "Tuesday" -> intDay += 3;
//            case "Wednesday" -> intDay += 4;
//            case "Thursday" -> intDay += 5;
//            case "Friday" -> intDay += 6;
//            case "Saturday" -> intDay += 7;
//        }
//        int total = (intDay + n) % 7;
//        switch (total) {
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 0 -> System.out.println("Saturday");
//        }
//    }
//}
// using hashpMap
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        int k = sc.nextInt();
        int l = 8;
        int N = 0;
        String day1 = " ";

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Monday", 0);
        hashMap.put("Tuesday", 1);
        hashMap.put("Wednesday", 2);
        hashMap.put("Thursday", 3);
        hashMap.put("Friday", 4);
        hashMap.put("Saturday", 5);
        hashMap.put("Sunday", 6);

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().equals(day)) {
                N = map.getValue();
                k = k + N;
                l = k % 7;
            }
            for (Map.Entry<String, Integer> val: hashMap.entrySet()) {
                if (val.getValue() == l) {
                    day1 = val.getKey();
                }
            }
        }
        System.out.println(day1);
    }
}
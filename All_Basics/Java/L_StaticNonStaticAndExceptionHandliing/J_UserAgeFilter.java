package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J_UserAgeFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of element");
        int n = scanner.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
//        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            hashMap.put(scanner.next(), scanner.nextInt());
        }

//        System.out.println("Enter the age ");
        int age = scanner.nextInt();

//        System.out.println("Person Whose age are above "+ age + " are :-");
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > age) {
                System.out.println(map.getKey());
            }
        }
    }
}


/*
for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey());
        }
 */

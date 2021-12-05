package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H_PhoneNumberDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (int t = 0; t < 2; t++) {
        System.out.println("Enter number of element ");
        int n = scanner.nextInt();
        System.out.println("Enter name of the person");
        String name = scanner.next();
        System.out.println("Enter the Elements");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(scanner.next(), scanner.nextInt());
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {

        }
        if (hashMap.containsKey(name)) {
            System.out.println(name + "Number is : " + hashMap.get(name));
        } else {
            System.out.println("Please enter valid Name");
        }
    }
}
//}

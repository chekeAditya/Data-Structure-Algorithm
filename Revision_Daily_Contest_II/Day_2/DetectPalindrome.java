package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            System.out.println(res(str));
        }
    }

    static String res(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i)) + 1;
                hashMap.put(str.charAt(i), count);
            } else
                hashMap.put(str.charAt(i), 1);
        }
        int temp = 0;
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            if (map.getValue() % 2 != 0)
                temp++;
        }
        if (temp > 1)
            return "Not Possible!";
        else return "Possible!";
    }
}

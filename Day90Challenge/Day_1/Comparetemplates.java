package Basic_To_Advanced_DataStructure.Day90Challenge.Day_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comparetemplates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str.split(" ");
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            a.add((int) str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(a.get(i));
        }
    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        for (int i = 0, j = 0; i < a.size() && j < b.size(); i++, j++) {
            System.out.println(a);
        }
        return a;
    }

}

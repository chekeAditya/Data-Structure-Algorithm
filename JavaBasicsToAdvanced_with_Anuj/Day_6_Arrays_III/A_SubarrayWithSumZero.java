package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_6_Arrays_III;

import java.util.HashSet;
import java.util.Set;

public class A_SubarrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, -4, 3, -2};
        System.out.println(subArrayWithZeroBoolean(arr));
    }


    private static boolean subArrayWithZeroBoolean(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int e : arr) {
            sum += e;
            if (set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}

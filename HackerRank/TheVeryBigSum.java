package Basic_To_Advanced_DataStructure.HackerRank;

import java.util.List;

public class TheVeryBigSum {
    public static void main(String[] args) {

    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (Long aLong : ar) {
            sum += aLong;
        }
        return sum;
    }
}

package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

public class F_EvenDigit {
    /**
     * Find no. of no.s that have even numbed of digits
     * arr = {12,7,100,87,189};
     * here we had to count number of digit having even number of count
     * e.g 12,87
     * <p>
     * Solution -> Count number of digit using while loops
     * -> Convert it into string and check the length
     */

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, -100};
        System.out.println(findNumbers(nums));
        System.out.println(optimisedOne(-100));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num))
                count++;
        }
        return count;
    }

    //function to check  whether a number contains even digits or not
    private static boolean even(int num) {

        int numberOfDigit = digitInNumber(num);
        /*
         if (numberOfDigit % 2 == 0)
            return true;
        return false;
         */
        return numberOfDigit % 2 == 0;
    }

    //count number of digit in a number
    private static int digitInNumber(int num) {
        if (num < 0) {
            num = num + -1;
        }

        if (num == 0)
            return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


    static int optimisedOne(int num) {
        if (num < 0) {
            num = num + -1;
        }

        if (num == 0)
            return 1;
        return (int) (Math.log10(num)) + 1;
    }
}

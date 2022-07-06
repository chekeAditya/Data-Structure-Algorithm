package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class F_FindThirdLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 6, 1, 18, 0};
        System.out.println(thirdLargestElement(arr));
    }


    private static int thirdLargestElement(int[] arr) {
        int fl = Integer.MIN_VALUE, sl = 0, tl = 0;
        for (int e : arr) {
            if (e > fl) {
                tl = sl;
                sl = fl;
                fl = e;
            } else if (e < fl && e > sl) {
                tl = sl;
                sl = e;
            } else if (e < sl && e > tl) {
                tl = e;
            }
        }
        return tl;
    }

    //TC = O(n) & SC = O(1)
}

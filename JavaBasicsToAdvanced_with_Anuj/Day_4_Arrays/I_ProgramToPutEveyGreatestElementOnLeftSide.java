package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class I_ProgramToPutEveyGreatestElementOnLeftSide {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6, 6};
        greatestElementOnLeftSide(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static int[] greatestElementOnLeftSide(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < max) {
                arr[i - 1] = max;
            } else {
                int temp = arr[i - 1];
                arr[i - 1] = max;
                max = temp;
            }
        }
//        arr[arr.length - 1] = -1;
        return arr;
    }
}

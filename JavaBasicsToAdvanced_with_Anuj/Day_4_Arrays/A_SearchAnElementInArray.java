package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class A_SearchAnElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 20, 28};
        int key = 20;
        int res = -1;
        for (int j : arr) {
            if (j == key) {
                res = key;
                break;
            }
        }
        if (res == -1) System.out.println("Not Found");
        else System.out.println("Found");
    }
}

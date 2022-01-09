package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

public class G_Max_Wealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(my_method(arr));
    }

    static int my_method(int[][] arr) {
        int wealth = 0, maxWealth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
            wealth = 0;
            for (int j = 0; j < arr[i].length; j++) {
                wealth += arr[i][j];
            }
        }
        return maxWealth;
    }
}

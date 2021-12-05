package DataStructure.Array_2d;

import java.util.Scanner;

public class A_I_Part_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        int rowNo = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }


    }
    public static void addRowSum(int row,int col,int[][] array,int rowNo){
        System.out.println("Enter the row number which you want to sum");
        if (rowNo > row) {
            System.out.println("Invalid number");
            return;
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == rowNo - 1) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println(sum);
    }


}

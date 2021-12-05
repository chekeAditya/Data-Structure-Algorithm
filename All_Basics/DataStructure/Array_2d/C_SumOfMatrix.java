package DataStructure.Array_2d;

import java.util.Scanner;

public class C_SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();

        //taking first matrix
        int[][] M1 = new int[R1][C1];
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C1; j++) {
                M1[i][j] = sc.nextInt();
            }
        }
        //taking second matrix
        int[][] M2 = new int[R2][C2];
        for (int i = 0; i < R2; i++) {
            for (int j = 0; j < C2; j++) {
                M2[i][j] = sc.nextInt();
            }
        }

        //logic
        if(R1==C1 && R2==2) {

            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C1; j++) {
                    System.out.print(M1[i][j] + M2[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("-1");
        }
    }
}

/*
Matrix Add
Description

Given 2 matrix , find and print the matrix which is the sum of both the matrix. If they cannot be added together output -1



Note: 2 matrix can only be added if both of them have same number of rows and same number of columns


Input
The first line of input will contain 4 integers denoting R1, C1, R2, C2, which is the number of rows of matrix 1, the number columns of matrix 1,the number of rows of matrix 2, number columns of matrix 2 respectively.

Next R1 lines will contain C1 integers, which are the matrix elements.

Next R2 lines will contain C2 integers, which are the matrix elements.



Constraints:
1<= R1,C1,R2,C2 <=100

1<= Matrix[i][j] <= 100


Output
Output the new matrix ( sum of matrix 1 and matrix 2 ), if it cannot be added then output -1


Sample Input 1

2 2 2 2
1 2
3 4
2 3
4 5
Sample Output 1

3 5
7 9
Hint

Self Explanatory
 */

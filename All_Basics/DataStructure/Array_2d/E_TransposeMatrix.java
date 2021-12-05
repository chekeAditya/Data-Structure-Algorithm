package DataStructure.Array_2d;

public class E_TransposeMatrix {
    public static void main(String args[]) {
//creating a matrix
        int original[][] = {{1, 2, 3}, {4, 5, 6}};

//creating another matrix to store transpose of a matrix
        int transpose[][] = new int[2][3];  //3 rows and 3 columns

//Code to transpose a matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}

package Java.G_Loops_II;

import java.util.Scanner;

public class E_PlusSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");
        int rows = scanner.nextInt();

        // Print i number of stars
        for (int i = 0; i <= (rows * 2); i++) {
            if (i == rows)
                {
                // Printing Horizontal Line of Stars
                for (int j = 0; j <= (rows * 2); j++) {
                    System.out.print("*");
                }

            } else {
                // Printing space before Vertical Line of Stars
                for (int k = 0; k <= rows-1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N : ");
//        int n = sc.nextInt();
//        System.out.print("Enter Symbol : ");
//
//        char c = sc.next().charAt(0);
//        int i = 1;
//        int j;
//        while (i <= n * 2 - 1) {
//            if (i != n) {
//                j = 1;
//                while (j <= n) {
//                    if (j == n)
//                        System.out.print(c);
//                    System.out.print(" ");
//                    j++;
//                }
//            } else {
//                j = 1;
//                while (j <= n * 2 - 1) {
//                    System.out.print(c);
//                    j++;
//                }
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}


//-----------------------------------
// package Java.G_Loops_II;
//
//         import java.util.Scanner;
//
//public class E_PlusSign {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int rows = scanner.nextInt();
//        for (int i=0; i<=(rows * 2 ); i++)
//        {
//            if( i == rows)
//            {
//                for (int j=0; j<=(rows * 2); j++)
//                {
//                    System.out.print("*");
//                }
//            }
//            else
//            {
//                for(int k=0; k<= rows-1; k++)
//                {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


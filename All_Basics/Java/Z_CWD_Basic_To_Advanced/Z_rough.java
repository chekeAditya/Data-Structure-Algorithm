package Java.Z_CWD_Basic_To_Advanced;

import java.util.Random;
import java.util.Scanner;

public class Z_rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = 0;
        int you = 0;
        System.out.println("***Please have a note***");
        System.out.println("1. (0) standas for rock\n2. (1) stands for paper\n3. (2) stands for sccisor");
        for (int i = 0; i < 5; i++) {
            int comp = rand.nextInt(3);
            System.out.println("Select one number among 0, 1 2");
            int human = sc.nextInt();
            System.out.println("computer selected: " + comp);
            if (comp == 0 && human == 1) {
                System.out.println(" You won");
                you++;
            } else if (comp == 0 && human == 2) {
                System.out.println(" You lose");
                computer++;
            } else if (comp == 1 && human == 0) {
                System.out.println(" You lose");
                computer++;
            } else if (comp == 1 && human == 2) {
                System.out.println(" You won");
                you++;
            } else if (comp == 2 && human == 0) {
                System.out.println(" You won");
                you++;
            } else if (comp == 2 && human == 1) {
                System.out.println(" You lose");
                computer++;
            } else {
                System.out.println("It's a tie, both computer and you selected the same...");
            }


        }
        System.out.println("The final score of computer is: " + computer + " and you scored : " + you);
        if (computer > you) {
            System.out.println("Sorry, finally computer won!!. Better luck next time ");

        } else {
            System.out.println("Congratulations finally you won!!!");
        }

//        System.out.println("Here we are using \\ for demonstrating many thing  \n and also we want to give some " +
//                "tab here so we are using \t and now we are using \b asdfgasdf");
    }
}
//    private static final int[] question = {1, 2, 3, 4, 5};
//    private static boolean giveUp;
//    private static boolean solved;
//    private static int index;
//
//    public static void main(String[] args) {
//        solveQuestion(question[index]);
//    }
//
//    public static void solveQuestion(int questionNumber) {
//        while (index <= 5) {
//            if (giveUp) {
//                System.out.println("View the code");
//                // Don't stop here
//                solveQuestion(index);
//            } else {
//                if (true) {
//                    index++;
//                    System.out.println("Congrats!");
//                    solveQuestion(index);
//                } else {
//                    System.out.println("Come on, You can do it 👍");
//                    new Scanner(System.in).nextLine();
//                    continue;
//                }
//            }
//        }
//    }
//}

//        String name = "aditya";
//        System.out.println(name.toLowerCase());
//        System.out.println(name.replaceAll("a","asdfl"));
//}

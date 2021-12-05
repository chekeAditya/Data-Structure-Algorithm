package Java.Z_CWD_Basic_To_Advanced;

import java.util.Random;
import java.util.Scanner;

public class J_Stone_Paper_Scissor_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("******** Read the Instruction's Carefully ********");
        System.out.println();
        System.out.println("0 is for STONE");
        System.out.println("1 is for PAPER");
        System.out.println("2 is for SCISSOR");
        System.out.println();
        System.out.println("******* Select any one *******");

        int you = 0;
        int comp = 0;


        for (int i = 0; i < 5; i++) {
            int playerOne = random.nextInt(2);
            int playerTwo = scanner.nextInt();
            System.out.println("Computer Move is : " + playerOne);
            System.out.println("Your Move is : " + playerTwo);

            if (playerOne == 0 && playerTwo == 1) {
                System.out.println("You wins");
                you++;
            } else if (playerOne == 0 && playerTwo == 2) {
                System.out.println("Computer wins");
                comp++;
            } else if (playerOne == 1 && playerTwo == 0) {
                System.out.println("Computer wins");
                comp++;
            } else if (playerOne == 1 && playerTwo == 2) {
                System.out.println("You wins");
                you++;
            } else if (playerOne == 2 && playerTwo == 0) {
                System.out.println("You wins");
                you++;
            } else if (playerOne == 2 && playerTwo == 1) {
                System.out.println("Computer wins");
                comp++;
            } else if (playerOne == playerTwo) {
                System.out.println("Tie");
            } else if (playerTwo > 2) {
                System.out.println();
                System.out.println("\"INVALID INPUT\":Please enter valid input");
                return;
            }
        }
        System.out.println("--------Let's see who wins finally--------");
        if (you > comp) {
            System.out.println("You wins");
        } else {
            System.out.println("Computer wins");
        }
    }
}
/*
 * Here we assign Stone = 1, paper = 2 , scissors = 3 , player1(random) , player2
 *
 *
//        if (playerOne == playerTwo) {
//            System.out.println("Tie");
//        } else if (1 > 1 && 1 < 3) {
//            System.out.println("Stone wins");
//        } else if (2 > 1 && 2 > 3) {
//            System.out.println("Paper wins");
//        }

 */



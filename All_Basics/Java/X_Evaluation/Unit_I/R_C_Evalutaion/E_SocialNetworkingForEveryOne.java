package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class E_SocialNetworkingForEveryOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(distanceOfFriends(age));

    }

    static String distanceOfFriends(int age) {
        if (age < 13) {
            return "1 Kms";
        } else if (age >= 13 && age <= 18) {
            return "5 Kms";
        } else if (age >= 18 && age < 30) {
            return "10 Kms";
        } else{
            return "You can have friends from Anywhere!";
        }
    }
}
/*
age < 13 ->1kms
age>=13 && age<=18 ->5kms
age>=18 && age<=30->10kms
else -> anywhere
 */

package Y_PSC.UNIT_I.DSA_IV;

import java.util.Scanner;

public class PSC_02_PayForPhones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int phonePrice1 = scanner.nextInt();
        int phonePrice2 = scanner.nextInt();
        int phonePrice3 = scanner.nextInt();
        int phonePrice4 = scanner.nextInt();
        int phonePrice1Quantity = scanner.nextInt();
        int phonePrice2Quantity = scanner.nextInt();
        int phonePrice3Quantity = scanner.nextInt();
        int phonePrice4Quantity = scanner.nextInt();

        int phoneOne = phonePrice1 * phonePrice1Quantity;
        int phoneTwo = phonePrice2 * phonePrice2Quantity;
        int phoneThree = phonePrice3 * phonePrice3Quantity;
        int phoneFour = phonePrice4 * phonePrice4Quantity;

        int total = phoneOne + phoneThree + phoneTwo + phoneFour;
        int money = 150000;
        if (money > total){
            System.out.println("Possible");
        }else{
            System.out.println("Not Possible");
        }

    }
}

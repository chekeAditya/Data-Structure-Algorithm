package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_1;

import java.util.Scanner;

public class C_Initializing_Array {
    public static void main(String[] args) {
        int[] arrayList = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arrayList[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayList.length; i++) {
            System.out.println("age of the student is " + arrayList[i]);
        }

        for(int element : arrayList){
            System.out.println("age of the student is " + element);
        }


    }
}
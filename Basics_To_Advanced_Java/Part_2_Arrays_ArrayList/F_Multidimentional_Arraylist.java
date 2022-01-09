package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_2_Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class F_Multidimentional_Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            arrayList.add(new ArrayList<>());
        }

        //add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayList.get(i).add(scanner.nextInt());
            }
        }

        System.out.println(arrayList);
    }
}

package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_2_Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class E_Arraylist {

    /**
     * How it work internally?
     * -> Here size is actually fixed internally
     * -> When arraylist fills at a certain amount like 70% then
     * -> it will create a new arraylist using the formula shown below
     * int newCapacity = ArraysSupport.newLength(oldCapacity,minCapacity - oldCapacity, oldCapacity >>1
     * -> and all the old element present in the old list get copied into new Arraylist
     *
     * -> Amortised time complexity O(1)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
//        arrayList.add(18);
//        arrayList.add(16);
//        arrayList.add(12);
//        arrayList.add(13);
//        arrayList.add(136);
//        arrayList.add(134);
//        arrayList.add(13490);

//        System.out.println(arrayList);
//
//        System.out.println(arrayList.contains(454));
//
//        arrayList.remove(2);

        //taking input from keybord
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }

        //printing element
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayList.get(i) + " ");
        }


    }
}

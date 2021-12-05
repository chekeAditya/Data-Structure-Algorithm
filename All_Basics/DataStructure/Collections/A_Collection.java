package DataStructure.Collections;

import java.util.ArrayList;

public class A_Collection {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        a[5] = 6;
//        System.out.println(a[5]); // crash as array size is 5 and we are extending the size of array

        ArrayList<Integer> arrayList = new ArrayList<>();    //int -> Integer
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

//remove the element
        arrayList.remove(3);                     //it wil remove the element present at index

        System.out.println(arrayList.get(2));           //using this u can print element of index 2

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));       //method called get to print element present in it
        }

    }
}

/*
Note:-
        * in Arraylist the ordered is always been maintained
 */
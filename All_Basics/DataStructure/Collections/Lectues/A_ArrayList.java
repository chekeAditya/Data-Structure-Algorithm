package DataStructure.Collections.Lectues;

import java.util.ArrayList;
import java.util.List;

public class A_ArrayList {
    public static void main(String[] args) {
        /**
         ArrayList<Type> arrayList = new ArrayList<Type>();
         Here, Type indicates the type of the arrayList
         ArrayList<Integer> arrayList1 = new ArrayList<>();
         ArrayList<String> arrayList2 = new ArrayList<>();
         */

//        ArrayList fruits = new ArrayList(); //as here we are not declaring the type so it can take anything
        ArrayList<String> fruits = new ArrayList<>(); //here as i mentioned the type as String so we cannot take other than String
//        List<String> vegetables = new ArrayList<>();

        fruits.add("apple");  //used to add element
        fruits.add("mango");
        fruits.add("orange");

//        vegetables.add("Potato");
//        vegetables.add("Tomato");
//        vegetables.add("carrot");

//        fruits.addAll(vegetables); // here it will add all both the arrays o/p:-[apple, mango, orange, Potato, Tomato, carrot]

        List<String> toRemove = new ArrayList<>();
        toRemove.add("apple");
        toRemove.add("orange");

//        fruits.add(23);                    //add the element
//        System.out.println(fruits.get(1)); //get elements at the index of 1
//        fruits.set(1, "banana");           //it will set the  element at the index of 1 by banana
//        fruits.remove(2);                  // it will remove the element which is present at the index of 2
//        fruits.clear();                   //it will clear all the element present in the list
//        fruits.removeAll(toRemove);         // it will remove the element present in that list
//        System.out.println(fruits.size());    // it will return the size of the arraylist
//        System.out.println(fruits.isEmpty());   // return a boolean value which suggest is it empty or not
        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);
        for (String e : temp){
            System.out.print(e + " ");
        }
        System.out.println(fruits);

//        ArrayList<Integer> marks = new ArrayList<>();

        //here whatever we had write all type in <>
//        B_Pair<String,Integer> p1 = new B_Pair<>("Aditya",19);
//        B_Pair<Boolean,String> p2 = new B_Pair<>(true,"Hello");
//        p1.getDescription();
//        p2.getDescription();
    }
}

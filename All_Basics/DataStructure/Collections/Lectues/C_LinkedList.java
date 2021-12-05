package DataStructure.Collections.Lectues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C_LinkedList {
    //contain element sequentially
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        linkedList.add(12);
        linkedList.add(5);
        linkedList.add(24);
        linkedList.add(10);
//        System.out.println(linkedList.get(1));
//        linkedList.set(2, 56);
        System.out.println(linkedList);
        getTimeDifference(arrayList);
        getTimeDifference(linkedList);
    }

    static void getTimeDifference(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);             //at insertion arraylist took more time compared to linkedList
//            list.add(i);
        }
//        long end = System.currentTimeMillis();
//        long time = end - start;
//        System.out.println( list.getClass().getName() + " -- > " + time);
    }
}

/*
     * In linkedList data is not stored in contiguous location and every element is separate object with a data part and address part.
     * Element are linked using pointers and addresses. Each element is known as a node.Due to dynamicity and ease of insertion and deletion
       they preferred over arrays.
    * Disadvantage of LinkedList is if we want to find any thing(node / element) then at that time it had to iterate through each(head) and every element
     were-as in ArrayList you will get it easily
     * If you want to insert or or delete any element then it's faster
     *
 */

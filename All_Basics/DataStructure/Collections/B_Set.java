package DataStructure.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class B_Set {
    public static void main(String[] args) {
//it will give you only the unique element present in the set
        LinkedHashSet<Integer> set = new LinkedHashSet<>();   // used to print in the order
//        HashSet<String> set = new HashSet<>();              // it's not print in the order
        set.add(3);
        set.add(-1);
        set.add(2);
        set.add(-1);
        set.add(2);
        Iterator iterator = set.iterator();             //it's an object and it's basically a loop which helps to move inside the collection

        while (iterator.hasNext()) {                     // checking does it has elements
            int data = (int) iterator.next();     // function of next(); is when element is present it will print it and move the cursor to the next line
            System.out.println(data);
        }

    }
}

/*
Note:-
        * instead it will not allow the repeated element to be present or print
        * in Hashset the ordered is not  been maintained
        * in LinkedHashSet ordered is been maintained
        * these are called the dynamic collection
 */

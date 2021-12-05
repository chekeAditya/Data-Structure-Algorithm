package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.*;

public class F_RemoveRepeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        String[] sentence = {"Masai", "School", "is", "Awesome", "but", "Masai", "is", "intense"};
//        ArrayList<String> arrayList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arrayList.add(scanner.next());
//        }

    //using LinkedHashSet
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
           hashSet.add(scanner.next());
        }

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String data = (String) iterator.next();
            System.out.println(data);
        }



        //using arraylist
//        boolean repeat = false;
//        String name = "";
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                if (arrayList.get(i) == arrayList.get(j)){
//                    System.out.println(arrayList.get(i));
//                }else
//            }
//        }
    }
}
/*
8
Masai
School
is
Awesome
but
Masai
is
intense
 */

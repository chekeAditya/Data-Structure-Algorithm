package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.MarksStudent;

import java.util.*;

public class Student {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        //ListOne
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(20);
        listOne.add(30);
        listOne.add(40);
        listOne.add(50);

        //ListTwo
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(30);
        listTwo.add(40);
        listTwo.add(50);
        listTwo.add(60);

        //ListThree
        ArrayList<Integer> listThree = new ArrayList<>();
        listThree.add(10);
        listThree.add(20);
        listThree.add(30);
        listThree.add(40);

        //ListFour
        ArrayList<Integer> listFour = new ArrayList<>();
        listFour.add(30);
        listFour.add(40);
        listFour.add(60);
        listFour.add(70);

        hashMap.put("Mukesh", Collections.singletonList(avgListOne(listOne)));
        hashMap.put("Gourav", Collections.singletonList(avgListTwo(listTwo)));
        hashMap.put("Ram", Collections.singletonList(avgListThree(listThree)));
        hashMap.put("Arbeena ", Collections.singletonList(avgListFour(listFour)));


        for (Map.Entry<String, List<Integer>> map : hashMap.entrySet()) {
            if (map.getValue().contains((compareMarks(listOne, listTwo, listThree, listFour)))) {
                System.out.println("The least average in the class is achieved by " + map.getKey());
                System.out.println("The least average is " + map.getValue());
            }
        }
    }

    static int avgListOne(ArrayList<Integer> listone) {
        int avg1 = 0;
        int a = 0;
        for (int avg : listone) {
            avg1 += avg;
            a = avg1 / listone.size();

        }
        return a;
    }

    static int avgListTwo(ArrayList<Integer> listTwo) {
        int avg1 = 0;
        int a = 0;
        for (int avg : listTwo) {
            avg1 += avg;
            a = avg1 / listTwo.size();

        }
        return a;
    }

    static int avgListThree(ArrayList<Integer> listThree) {
        int avg1 = 0;
        int a = 0;
        for (int avg : listThree) {
            avg1 += avg;
            a = avg1 / listThree.size();

        }
        return a;
    }

    static int avgListFour(ArrayList<Integer> listFour) {
        int avg1 = 0;
        int a = 0;
        for (int avg : listFour) {
            avg1 += avg;
            a = avg1 / listFour.size();

        }
        return a;
    }

    static int compareMarks(ArrayList<Integer> listOne, ArrayList<Integer> listTwo, ArrayList<Integer> listThree, ArrayList<Integer> listFour) {
        ArrayList<Integer> compare = new ArrayList<>();
        compare.add(avgListOne(listOne));
        compare.add(avgListTwo(listTwo));
        compare.add(avgListThree(listThree));
        compare.add(avgListFour(listFour));

        int minMark = compare.get(0);
        for (int a = 0; a < compare.size(); a++) {
            if (compare.get(a) < minMark) {
                minMark = compare.get(a);
            }
        }
        return minMark;
    }
}


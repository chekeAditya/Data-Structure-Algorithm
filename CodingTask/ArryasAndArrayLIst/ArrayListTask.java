package Basic_To_Advanced_DataStructure.CodingTask.ArryasAndArrayLIst;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Aditya");
        arrayList.add("Karan");
        arrayList.add("Arya");
        arrayList.add("Sudarshan");
        arrayList.add("Prachi");
        printingAllElementOfArray(arrayList);
        System.out.println("-----------------------");
        printElementWhoseLengthIsGreaterThan5(arrayList);
        System.out.println("-----------------------");
        removeElementAtIndex2(arrayList);
        System.out.println("-----------------------");
        changeElementAtIndex(arrayList);
    }

    static void printingAllElementOfArray(ArrayList<String> arrayList) {
        for (String i : arrayList) {
            System.out.println(i);
        }
    }

    static void printElementWhoseLengthIsGreaterThan5(ArrayList<String> arrayList) {
        for (String i : arrayList) {
            if (i.length() > 5) System.out.println(i);
        }
    }

    static void removeElementAtIndex2(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != 2) System.out.println(arrayList.get(i));
        }
    }

    static void changeElementAtIndex(ArrayList<String> arrayList) {
        arrayList.set(3, "Masai");
        for (String i : arrayList) {
            System.out.println(i);
        }
    }
}

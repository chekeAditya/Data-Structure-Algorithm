//package Java.N_ObjectsAndCollections.Array;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class SumTarget {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the size of the array : ");
//        int n = scanner.nextInt();
//        System.out.println("Enter target value : ");
//        int target = scanner.nextInt();
//        System.out.println("Enter Elements : ");
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arrayList.add(scanner.nextInt());
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++)
//                if (arrayList.get(i) + arrayList.get(j) == target) {
//                    System.out.println("[" + i + "," + j + "]");
//                }
//        }
//    }
//}

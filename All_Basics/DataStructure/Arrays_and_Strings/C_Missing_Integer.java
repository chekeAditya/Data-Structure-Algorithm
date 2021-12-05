package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class C_Missing_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] numbers = n.split(" ");//"1","2","3";
        int[] arr = new int[numbers.length]; //{1,2,3,4,}
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int N = arr.length + 1; //as we add missing number here (1 number is missing here)
        int sumOfNumbers = N * (N + 1) / 2;
        int sumOfRemaining = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfRemaining = sumOfRemaining + arr[i];
        }
        int output = sumOfNumbers - sumOfRemaining;
        System.out.println(output);
    }
}
//it is for taking the input in string format and convert it into int
//    Scanner scanner = new Scanner(System.in);
//    String n = scanner.nextLine();
//    String[] numbers = n.split(" ");//"1","2","3";
//    int[] arr = new int[numbers.length]; //{1,2,3,4,}
//    for (int i = 0; i < arr.length; i++) {
//        arr[i] = Integer.parseInt(numbers[i]);
//        }
//}

//sum of n natural number's
//n(n+1) / 2


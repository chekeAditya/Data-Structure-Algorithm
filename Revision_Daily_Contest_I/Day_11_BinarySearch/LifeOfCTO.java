package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_11_BinarySearch;
/*
Life of a CTO -0:55:22
Description

Life of a CTO is a hard one. Same is the case with the CTO of Masai School, as he has to manage multiple products. To help him rejuvenate, the CEO of Masai School, sent him on a holiday for a month. After returning from the holiday, he found out that the N number of releases have been made for a new product. But he realizes that the product is buggy. As each new version of a product is built on an existing one, he wants to find the first buggy version of the product. The VP of Engineering, gives him the status of the versions in the form of an array of 1's and 0's, where 0 indicates the product is bug-free and 1 indicates that the product is buggy. Since, the CTO has to look after a large number of products, he asks you to find the first buggy version of the product, and return its index in the array, or -1 if none of the versions of the product are buggy.


Input
The first line contains N, the number of version rolled out of the product. Next line contains N space separated integers including 1's and 0's, where 1 indicates the a buggy version, and 0 indicates the version is bug-free.


Output
Print a single integer denoting, the index of the first buggy version, or -1 if no buggy version exists.


Sample Input 1

5
0 0 0 1 1
Sample Output 1

3
Sample Input 2

5
0 0 0 0 0
Sample Output 2

-1
 */
import java.util.Scanner;

public class LifeOfCTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(res(n, arr, 0, arr.length - 1));
    }

    static int res(int n, int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[0] == 1)
            return 1;
        if (low > high)
            return -1;
        if (arr[mid] == 1 && arr[mid - 1] == 0)
            return mid;

        if (arr[mid] == 0)
            return res(n, arr, mid + 1, high);
        else
            return res(n, arr, low, mid - 1);
    }
}

package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_7;

/*
Use Side Lane -2:12:38
Description

There are N trucks numbered from 1 to N. The trucks are coming on a road in a random manner.(by random, it means that any order of number: not sorted) There is a side lane which can be used to order the sequence of truck properly(1,2,3,..N)

Use these (Ref :https://imgur.com/a/yWLhQiK) images for better understanding of sample test case.

If it is possible to achieve using the side land, print "yes"

else print "no"


Input
Input Format :

There are several test cases.

The first line of each test case contains a single number n, the number of trucks.

The second line contains the numbers 1 to n in an arbitrary order.

All the numbers are separated by single spaces. These numbers indicate the order in which the trucks arrive in the approach street.

Input ends with number 0

Constraints :

N < 1000


Output
For each test case your program has to output a line containing a single word "yes" if the trucks can be re-ordered with the help of the side lane, and a single word "no" in case it is not possible.


Sample Input 1

5
5 1 2 4 3
0
Sample Output 1

yes
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class UseSideLane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(n, arr));
        }
    }

    static String res(int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == n - 1) {
                break;
            } else if (arr[i] > arr[i + 1])
                stack1.add(arr[i]);
            else
                stack.add(arr[i]);
        }
        Iterator<Integer> iterator = stack1.iterator();
        while (iterator.hasNext()) {
            stack2.add(iterator.next());
        }

        Iterator<Integer> iterator1 = stack1.iterator();
        while (!stack2.isEmpty()) {
            stack.add(iterator1.next());
        }

        Iterator<Integer> integerIterator = stack.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() < iterator.next() + 1) {
                return "no";
            }
        }
        return "yes";
    }
}
/*
1
4
1 3 2 4
 */

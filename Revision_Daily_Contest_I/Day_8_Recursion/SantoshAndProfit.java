package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_8_Recursion;

/*
Santosh & Profit -0:21:52
Description

Santosh is a milk man, and supplies milk to local shops. Due to lockdown, the demand for milk has increased substantially but due to surge in the prices of Petrol & Diesel, he has incurred some loss. Santosh is thinking of someway to maximize this profit. He is a smart man, and hence figures out, that  if he delivers  4 or 8 containers of milk, on each trip ,gives him the maximum return. Therefore, he decides that he will only carry 4 or 8 containers of milk for every delivery. To find the maximum profit that he can get with this arrangement, find the number of ways in which he can deliver N containers of milk, if for each visit he takes only 4 or 8 containers with him.


Input
The first line of input contains T, the number of test cases. Each test case consists of a single line N, the number of containers Santosh has to deliver.



Constraints :

1 <= T <= 10

0 <= N <= 150


Output
For each test case print the number of ways in which Santosh can deliver N containers of milk.


Sample Input 1

1
12
Sample Output 1

3
 */

import java.util.Scanner;

public class SantoshAndProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(res(n));
        }
    }

    static int res(int n) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else
            return res(n - 8) +  res(n - 4);
    }
}

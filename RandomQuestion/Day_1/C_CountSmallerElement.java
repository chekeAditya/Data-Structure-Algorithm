package Basic_To_Advanced_DataStructure.RandomQuestion.Day_1;

public class C_CountSmallerElement {
/*
Example 1:

Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5


Example 2:

Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4

 */

    public long countOfElements(long arr[], long n, long x) {
        int count = 0;
        for (long i: arr){
            if (i<=x)
                count++;
        }
        return count;
    }

}

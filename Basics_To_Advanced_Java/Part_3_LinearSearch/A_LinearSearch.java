package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

public class A_LinearSearch {

    /**
     * It's a technique for searching a data
     * Q) Find whether 14 exists in array or not ?
     * arr = [18,12,9,14,77,50]
     * <p>
     * Linear search tells start from 1st till the end and if you find the element then return it. else return -1.
     * Time Complexity -> best : O(1), worst case : O(n)
     * Here best case will be when element is present in the first place
     * Here worst case will be when element is present in the last place or did not find it.
     */
    public static void main(String[] args) {
        int[] arr = {25, 10, 4, 5, -9, 10, 18};
        int target = 10;
        System.out.println(linearSearch(arr, target));
    }

    //search in the array: return the index if item found  otherwise if item not found return -1
    private static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index
            int element = arr[index];
            if (element == target)
//                return index; //returning index
                return element; //returning index
        }
        //it will execute when element is not present in the array
//        return -1;
        return Integer.MAX_VALUE; // here we are writing as what if target is -1 in that case it will be a confusion that's why
    }
}

package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class D_SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 7, 19, 92};
        int largest = 0;
        int secondLargest = -1;
        System.out.println(secondLargest(arr, largest, secondLargest));
    }

    public static int secondLargest(int[] arr, int largest, int secondLargest) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest])
                    secondLargest = i;
            }
        }
        return arr[secondLargest];
    }
}

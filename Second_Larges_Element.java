// Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

// Note: If the second largest element does not exist, return -1.

// Examples:


// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.

// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.

// Input: arr[] = [10, 10, 10]
// Output: -1
// Explanation: The largest element of the array is 10 there is no second largest element.

public class Second_Larges_Element {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int N = arr.length;

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            }

            if (arr[i] > sec_max && arr[i] < max) {
                sec_max = arr[i];
            }
        }

        if (sec_max == Integer.MIN_VALUE)
            System.out.println("-1");
        else
            System.out.println(sec_max);
    }
}

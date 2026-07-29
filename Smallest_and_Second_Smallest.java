// Given an array arr[] of integers, find the smallest and second smallest distinct elements in the array. The result should be returned in ascending order, meaning the smallest element should come first, followed by the second smallest.

// Input: arr[] = [12, 25, 8, 55, 10, 33, 17, 11]
// Output: [8, 10]
// Explanation: The smallest element is 1 and second smallest element is 10.

// Input: arr[] = [2, 4, 3, 5, 6]
// Output: [2, 3]
// Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.

public class Smallest_and_Second_Smallest {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6 };
        int N = arr.length;
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] < sec_min && arr[i] > min) {
                sec_min = arr[i];
            }
        }

        System.out.print(min + " " + sec_min);
    }
}

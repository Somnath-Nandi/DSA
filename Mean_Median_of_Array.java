// Given an array arr[] of positive integers, find the Mean and Median, and return the floor of both values.

// Note: Mean is the average of all elements in the array and Median is the middle value when the array is sorted, if the number of elements is even, it's the average of the two middle values.

// Examples: 


// Input: arr[] = [1, 2, 19, 28, 5]
// Output: 11 5
// Explanation: Sorted array - [1, 2, 5, 19, 28], Mean = (1 + 2 + 19 + 28 + 5) / 5 = 55 / 5 = 11, Median = Middle element = 5

// Input: arr[] = [2, 8, 3, 4]
// Output: 4 3
// Explanation: Sorted array - [2, 3, 4, 8], Mean = (2 + 3 + 4 + 8) / 4 = 17 / 4 = 4.25, so floor(4.25) is 4, Median = (3 + 4)/2 = 3.5, so floor(3.5) is 3

import java.util.Arrays;

public class Mean_Median_of_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 19, 28, 5 };
        int N = arr.length;
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += arr[i];

        double mean = (double) sum / N;

        Arrays.sort(arr);

        double med = 0;
        if (N % 2 != 0)
            med = arr[(N / 2)];
        else
            med = (arr[(N / 2) - 1] + arr[(N / 2)]) / 2;

        System.out.print(mean + " " + med);
    }
}

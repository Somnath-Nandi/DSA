// Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5, 6], d = 2
// Output: [3, 4, 5, 6, 1, 2]
// Explanation: After first left rotation, arr[] becomes [2, 3, 4, 5, 6, 1] and after the second rotation, arr[] becomes [3, 4, 5, 6, 1, 2]

// Input: arr[] = [1, 2, 3], d = 4
// Output: [2, 3, 1]
// Explanation: The array is rotated as follows:

// After first left rotation, arr[] = [2, 3, 1]
// After second left rotation, arr[] = [3, 1, 2]
// After third left rotation, arr[] = [1, 2, 3]
// After fourth left rotation, arr[] = [2, 3, 1]

public class Array_Rotation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int d = 4;
        int N = arr.length;
        int[] temp = new int[N];
        for (int i = 1; i <= d; i++) {
            for (int j = 0; j < N; j++) {
                if (j == N - 1)
                    temp[j] = arr[0];
                else
                    temp[j] = arr[j + 1];
            }
            for (int j = 0; j < N; j++)
                arr[j] = temp[j];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

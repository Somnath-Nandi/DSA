// Given an array arr[] and an integer k, rotate the array in place k times to the right (clockwise). In each rotation, the last element moves to the front, and all other elements shift one position to the right. Modify the array in place, do not return anything.

// Examples : 

// Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
// Output: [5, 6, 1, 2, 3, 4]
// Explanation:
// => We perform 2 right rotations (since k = 2):

// After 1st rotation: Last element moves to front → [6, 1, 2, 3, 4, 5]
// After 2nd rotation: Again, last element to front → [5, 6, 1, 2, 3, 4]
// Input: arr[] = [1, 2, 3, 4, 5], k = 4
// Output: [2, 3, 4, 5, 1]
// Explanation:
// => We rotate the array 4 times to the right:

// After 1st rotation: [5, 1, 2, 3, 4]
// After 2nd rotation: [4, 5, 1, 2, 3]
// After 3rd rotation: [3, 4, 5, 1, 2]
// After 4th rotation: [2, 3, 4, 5, 1]

public class Array_After_K_Rotations {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int N = arr.length;
        int k = 4; // Number of Rotations
        int temp[] = new int[N];
        for (int n = 0; n < k; n++) {
            for (int i = 0; i < N; i++) {
                if (i == 0)
                    temp[i] = arr[N - 1];
                else
                    temp[i] = arr[i - 1];
            }

            for (int j = 0; j < N; j++) {
                arr[j] = temp[j];
            }
        }

        for (int i = 0; i < N; i++)
            System.out.print(temp[i] + " ");
    }
}

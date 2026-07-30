// Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

// Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

// Examples: 

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]
// Explanation: All the elements are 2, So only keep one instance of 2.

// Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
// Output: [1, 2, 3, 4, 5]

// Input: arr[] = [1, 2, 3]
// Output: [1, 2, 3]
// Explanation : No change as all elements are distinct.

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int N = arr.length;

        int[] newArr = new int[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            boolean flag = false;
            for (int j = 0; j < N; j++) {
                if (arr[i] == newArr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                newArr[index++] = arr[i];
        }

        for (int i = 0; i < N; i++) {
            if (newArr[i] != 0)
                System.out.print(newArr[i] + " ");
        }
    }
}

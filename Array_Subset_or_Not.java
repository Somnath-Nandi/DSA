// Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a subset of a[]. Both arrays are not sorted, and elements are distinct.

// Examples: 

// Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1] 
// Output: true

// Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4] 
// Output: true

// Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3] 
// Output: false

public class Array_Subset_or_Not {
    public static void main(String[] args) {
        int[] a = { 10, 5, 2, 23, 19 };
        int[] b = { 19, 5, 3 };
        int N = a.length;
        int M = b.length;
        int ctr = 0;
        for (int i = 0; i < M; i++) {
            int x = b[i];
            for (int j = 0; j < N; j++) {
                if (x == a[j]) {
                    ctr++;
                    break;
                }
            }
        }
        if (ctr == M)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

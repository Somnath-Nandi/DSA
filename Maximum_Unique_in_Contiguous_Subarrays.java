// You are given N integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M. 

// Example : Lets say the array is
// 5 3 5 2 3 2
// And M = 3 (contiguous sub array size) 

// So , S1 = {5,3,5} – has 2 unique numbers
// S2 = {3,5,2} – has 3 unique numbers 
// S3 = {5,2,3} – has 3 unique numbers
// S4 = {2,3,2} – has 2 unique numbers 

// So, The maximum amount of unique numbers among all possible contiguous subarrays is 3. 

import java.util.Scanner;

public class Maximum_Unique_in_Contiguous_Subarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int maxCtr = 0;
        for (int i = 0; i <= n - m; i++) {
            int ctr = 0;
            for (int j = i; j < i + m; j++) {
                boolean found = false;
                for (int k = i; k < j; k++) {
                    if (arr[j] == arr[k]) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    ctr++;
            }
            if (ctr > maxCtr)
                maxCtr = ctr;
        }

        System.out.println(maxCtr);
    }
}

// For entered two integer array as weights array (wt[0..n-1] ) and values array (val[0..n-1] ) of n items, put items in a knapsack of capacity W to get the maximum total value in the knapsack and write a function to find out the maximum value subset of val[] such that the sum of the weights of this subset is smaller than or equal to W. 

// Note: We cann't break an item, either pick the complete item or don’t pick it (0-1 property). 

// For example, input  of val=60,100,120 , wt=10,20,30 and W=50 so output=220 because weight of val 100 is 20 and weight of val 120 is 30 and 20+30=50 which is equal to knapsack capacity W=50. 

import java.util.Scanner;

public class Knapsack {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                dp[i][w] = dp[i - 1][w];
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i][w], val[i - 1] + dp[i - 1][w - wt[i - 1]]);
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        System.out.println(knapSack(W, wt, val, n));
    }
}

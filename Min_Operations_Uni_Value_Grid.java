class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        int[] arr = new int[m*n];
        int index=0;
        for (int[] row : grid) {
            for (int val : row) {
                arr[index++] = val;
            }
        }
        
        int remainder = arr[0] % x;
        for (int val : arr) {
            if (val % x != remainder) {
                return -1;
            }
        }

        Arrays.sort(arr);

        int med = arr[(m * n) / 2];

        int minOp = 0;
        for (int val : arr) {
            minOp += Math.abs(val - med) / x;
        }

        return minOp;
    }
}
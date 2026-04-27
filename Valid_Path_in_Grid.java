class Solution {

    int[][] dirs = {
        {},                     
        {0, -1, 0, 1},          
        {-1, 0, 1, 0},          
        {0, -1, 1, 0},         
        {0, 1, 1, 0},          
        {0, -1, -1, 0},       
        {0, 1, -1, 0}         
    };

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        return dfs(grid, 0, 0, visited);
    }

    private boolean dfs(int[][] grid, int i, int j, boolean[][] visited) {
        int m = grid.length, n = grid[0].length;

        if (i == m - 1 && j == n - 1) return true;

        visited[i][j] = true;

        int type = grid[i][j];
        int[] d = dirs[type];

        for (int k = 0; k < d.length; k += 2) {
            int ni = i + d[k];
            int nj = j + d[k + 1];

            if (ni < 0 || nj < 0 || ni >= m || nj >= n || visited[ni][nj])
                continue;

            if (canConnect(grid, i, j, ni, nj)) {
                if (dfs(grid, ni, nj, visited))
                    return true;
            }
        }
        return false;
    }

    private boolean canConnect(int[][] grid, int i, int j, int ni, int nj) {
        int di = ni - i, dj = nj - j;

        int nextType = grid[ni][nj];

       
        if (di == 0 && dj == 1)  
            return nextType == 1 || nextType == 3 || nextType == 5;
        if (di == 0 && dj == -1) 
            return nextType == 1 || nextType == 4 || nextType == 6;
        if (di == 1 && dj == 0)  
            return nextType == 2 || nextType == 5 || nextType == 6;
        if (di == -1 && dj == 0) 
            return nextType == 2 || nextType == 3 || nextType == 4;

        return false;
    }
}
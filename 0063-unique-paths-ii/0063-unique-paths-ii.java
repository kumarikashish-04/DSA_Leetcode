import java.util.Arrays;

class Solution {
    int n, m;
    int[][] dp;

    int up(int[][] grid, int i, int j) {

        // Out of bounds
        if (i >= n || j >= m) {
            return 0;
        }

        // Obstacle
        if (grid[i][j] == 1) {
            return 0;
        }

        // Destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Already computed
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Move Down + Move Right
        return dp[i][j] = up(grid, i + 1, j) + up(grid, i, j + 1);
    }

    public int uniquePathsWithObstacles(int[][] grid) {

        n = grid.length;
        m = grid[0].length;

        // If start or destination is blocked
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) {
            return 0;
        }

        dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return up(grid, 0, 0);
    }
}
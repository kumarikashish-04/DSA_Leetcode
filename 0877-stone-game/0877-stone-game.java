class Solution {
    int[][]dp;
    int solve(int i, int j, int[] piles) {
        if (i > j)
            return 0;
        if (i == j)
            return piles[i];
        if(dp[i][j]!=-1) return dp[i][j];
        int as = piles[i] + Math.min(solve(i + 2, j, piles), solve(i + 1, j - 1, piles));
        int bs = piles[j] + Math.min(solve(i, j - 2, piles), solve(i + 1, j - 1, piles));
        dp[i][j]=Math.max(as, bs);
        return dp[i][j];
    }

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int sum = 0;
        dp= new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < n; i++) {
            sum += piles[i];
        }
        int score = solve(0, n - 1, piles);
        return score * 2 >= sum;
    }
}
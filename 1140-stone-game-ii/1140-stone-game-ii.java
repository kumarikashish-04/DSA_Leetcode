class Solution {
    int dp[][][];

    int solve(int M, int i, int[] piles, int p) {
        if (i >= piles.length)
            return 0;
        if (dp[p][i][M] != -1)
            return dp[p][i][M];
        int r = (p == 0) ? -1 : Integer.MAX_VALUE;
        int stone = 0;
        for (int x = 1; x <= Math.min(2 * M, piles.length - i); x++) {
            stone += piles[x + i - 1];
            if (p == 0) {
                r = Math.max(r, stone + solve(Math.max(x, M), i + x, piles, 1));
            } else
                r = Math.min(r, solve(Math.max(x, M), i + x, piles, 0));
        }
        return dp[p][i][M] = r;
    }

    public int stoneGameII(int[] piles) {
        dp = new int[2][101][101];
        for (int[][] row : dp) {
            for (int[] arr : row) {
                Arrays.fill(arr, -1);
            }
        }
        int al=solve(1,0,piles,0);
        return al;
    }
}
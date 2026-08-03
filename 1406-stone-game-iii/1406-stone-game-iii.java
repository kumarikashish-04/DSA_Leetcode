import java.util.Arrays;

class Solution {
    int[] dp;

    int solve(int i, int[] stoneValue) {
        if (i >= stoneValue.length)
            return 0;

        if (dp[i] != Integer.MIN_VALUE)
            return dp[i];

        int take = 0;
        int best = Integer.MIN_VALUE;

        for (int x = 0; x < 3 && i + x < stoneValue.length; x++) {
            take += stoneValue[i + x];
            best = Math.max(best, take - solve(i + x + 1, stoneValue));
        }

        return dp[i] = best;
    }

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);

        int diff = solve(0, stoneValue);

        if (diff > 0)
            return "Alice";
        if (diff < 0)
            return "Bob";
        return "Tie";
    }
}
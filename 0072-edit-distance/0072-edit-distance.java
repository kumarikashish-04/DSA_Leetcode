class Solution {
    int n,m;
    int dp[][];
    int solve(int i,int j,String w1,String w2){
        if(i==w1.length()){
            return w2.length()-j;
        }
        if(j==w2.length()){
            return w1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(w1.charAt(i)==w2.charAt(j)) return solve(i+1,j+1,w1,w2);
        int d=solve(i+1,j,w1,w2);
        int in=solve(i,j+1,w1,w2);
        int r=solve(i+1,j+1,w1,w2);
        return dp[i][j]=1+Math.min(d,Math.min(in,r));
    }
    public int minDistance(String w1, String w2) {
        n=w1.length();
        m=w2.length();
        dp=new int[n][m];
        for(int[]idx:dp){
            Arrays.fill(idx,-1);
        }
        return solve(0,0,w1,w2);
    }
}
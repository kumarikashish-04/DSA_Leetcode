class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=1;i<=n;i++){
int t=Math.abs(s.charAt(i-1)-'z')+1;
sum=sum+(t*i);
        }
        return sum;
    }
}